package com.supplier.admin.filter;


import com.alibaba.fastjson.JSON;
import com.supplier.common.constants.SessionKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Linq
 * @description
 * @date 2017/3/12 16:52
 */
public class SessionFilter implements Filter {


    private Logger logger = LoggerFactory.getLogger(this.getClass());


    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("SessionFilter Filter init ...");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        String url = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
        if (url.startsWith("/") && url.length() > 1) {
            url = url.substring(1);
        }

        if (isInclude(url)) {
            filterChain.doFilter(httpRequest, httpResponse);
            return;
        } else {
            HttpSession session = httpRequest.getSession();
            if (session.getAttribute(SessionKey.ADMIN_USER_SESSION) != null) {

                logger.info("SESSION = {}",JSON.toJSONString(session.getAttribute(SessionKey.ADMIN_USER_SESSION)));

                // session存在
                filterChain.doFilter(httpRequest, httpResponse);
                return;
            } else {
                // session不存在 准备跳转失败
                RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("/login.html");
                dispatcher.forward(httpRequest, httpResponse);
                return;
            }
        }

    }

    public void destroy() {

    }


    /**
     * 是否需要过滤
     *
     * @param url
     *
     * @return
     */
    private boolean isInclude(String url) {
        logger.info("url = {}", url);

        if (url.contains("/") || url.contains("login.html") || url.contains("admin/login") ||
                url.contains("admin/login.jsp") || url.contains(".css") || url.contains(".js")
                || url.contains(".jpg") || url.contains(".jpeg") || url.contains(".gif")
                || url.contains(".png") || url.contains("error") || url.contains("woff2")
                || url.contains("woff") || url.contains("ttf") || url.contains("eot")
                || url.contains("ttf") || url.contains("svg") || url.contains(".ico")) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(\\**)?.css");

        Matcher matcher = pattern.matcher("resources/css/style.min.css");
        System.out.println("matcher = " + matcher.matches());


    }


}
