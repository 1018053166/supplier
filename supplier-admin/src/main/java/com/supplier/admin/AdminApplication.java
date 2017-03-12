package com.supplier.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.supplier.admin")
public class AdminApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdminApplication.class);
    }

    /**
     * Method description
     *
     *
     * @param args
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AdminApplication.class, args);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
