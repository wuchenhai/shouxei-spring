package com.luban.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;

@Component
public class LubanBeanPostProcessor implements BeanPostProcessor {

    @Override
    public void postProcessBeforeInitialization(String beanName, Object bean) {

    }

    @Override
    public void postProcessAfterInitialization(String beanName, Object bean) {
        // 在bean实例化完毕后，在显示调用初始化方法的前后添加我们自己的逻辑
        // aop在这里创建一个代理对象，并且把原始对象传入到代理对象的构造函数中
        System.out.println("postProcessAfterInitialization");
    }
}
