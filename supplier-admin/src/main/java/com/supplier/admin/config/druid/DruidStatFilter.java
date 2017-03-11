package com.supplier.admin.config.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 1. 启动项目后访问 http://域名/druid/index.html 即可查看数据源及SQL统计等。
 * 2. 常见问题参考：
 * https://github.com/alibaba/druid/wiki/%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98
 * http://www.open-open.com/lib/view/open1430558786084.html
 * 
 * 3. 注：以如下方式注入时，需要在启动类中添加 @ServletComponentScan
 * 如果使用 DruidConfiguration.java 代码注解方式，则不需要
 * 
 * @author thomas.su
 *
 */
@WebFilter(
		filterName="druidWebStatFilter",
		urlPatterns="/*",
		initParams={
				 @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
		})
public class DruidStatFilter extends WebStatFilter {

}
