package com.spring;

/**
 * 后置处理器，作用是在Bean对象在实例化和依赖注入完毕后，在显示调用初始化方法的前后添加我们自己的逻辑
 */
public interface BeanPostProcessor {

    public void postProcessBeforeInitialization(String beanName, Object bean);
    public void postProcessAfterInitialization(String beanName, Object bean);
}
