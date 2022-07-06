package com.spring;

/**
 * BeanDefinition对象封装了Bean的定义信息，包括Bean的名称、Bean的类型、Bean的初始化方法等。
 */
public class BeanDefinition {

    private Class beanClass;
    private ScopeEnum scope;

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }


    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public static void main(String[] args) {
        System.out.println("123");
        
    }

}
