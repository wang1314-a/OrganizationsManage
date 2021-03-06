package org.jude.manageBack.config;

import org.jude.manageBack.servlet.HelloServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Servlet配置类
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet());
        bean.addUrlMappings("/hello");
        return bean;
    }
}
