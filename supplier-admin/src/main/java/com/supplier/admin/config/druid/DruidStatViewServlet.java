package com.supplier.admin.config.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * 注：以如下方式注入时，需要在启动类中添加 @ServletComponentScan
 * 如果使用 DruidConfiguration.java 代码注解方式，则不需要
 * @author thomas.su
 *
 */
@WebServlet(
		urlPatterns = "/druid/*",
		initParams={
				//IP白名单 (没有配置或者为空，则允许所有访问),英文逗号分隔;
				@WebInitParam(name="allow",value=""),
				//IP黑名单 (存在共同时，deny优先于allow)
	            @WebInitParam(name="deny",value=""),
	            //用户名
	            @WebInitParam(name="loginUsername",value="linq"),
	            //密码
	            @WebInitParam(name="loginPassword",value="@linq"),
	            //禁用HTML页面上的“Reset All”功能
	            @WebInitParam(name="resetEnable",value="false")
		})
public class DruidStatViewServlet extends StatViewServlet {

}
