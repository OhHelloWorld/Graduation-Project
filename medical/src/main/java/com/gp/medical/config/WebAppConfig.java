package com.gp.medical.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2018/3/16 0016.
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter{

    /**
     * 图片地址映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/image/**").addResourceLocations("file:///D:/image/");
    }
}
