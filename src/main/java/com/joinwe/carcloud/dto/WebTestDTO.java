package com.joinwe.carcloud.dto;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 不会飞的小鹏
 * create on 2020/6/24 9:03
 * @Description WebTestDTO is
 */
@Component
@Data
public class WebTestDTO implements ApplicationContextAware {
    private String name;
    private Integer age;

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        WebTestDTO.applicationContext = applicationContext;
    }

    public static <T>T getBean(Class<T> tClass){
        return applicationContext != null ? applicationContext.getBean(tClass) : null;
    }

}
