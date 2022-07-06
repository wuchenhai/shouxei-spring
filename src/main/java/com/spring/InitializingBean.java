package com.spring;

/**
 * @author luban
 * @dscription  InitializingBean 接口，实现该接口的类会在容器初始化时调用 afterPropertiesSet 方法
 */
public interface InitializingBean {

    public void afterPropertiesSet();
}
