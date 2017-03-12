package com.supplier.admin.config.filter;

import com.supplier.admin.filter.SessionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author Linq
 * @description
 * @date 2017/3/12 17:00
 */
@Configuration
public class FilterConfig {


    /**
     * 配置过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(sessionFilter());
        registration.addUrlPatterns("/*");
//        registration.addInitParameter("paramName", "paramValue");
        registration.setName("sessionFilter");
        return registration;
    }

    /**
     * 创建一个bean
     * @return
     */
    @Bean(name = "sessionFilter")
    public Filter sessionFilter() {
        return new SessionFilter();
    }

}
