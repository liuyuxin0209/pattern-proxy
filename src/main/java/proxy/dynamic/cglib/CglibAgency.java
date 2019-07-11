package main.java.proxy.dynamic.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibAgency implements MethodInterceptor {

  public Object getInstance(Class<?> clazz) {
    Enhancer enhancer = new Enhancer();
    //生产的新类 继承哪个类
    enhancer.setSuperclass(clazz);

    enhancer.setCallback(this);

    return enhancer.create();
  }

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {

    System.out.println("我是cglib中介 开始给你 筛选适合你的房屋");

    //业务的增强
    methodProxy.invokeSuper(o, objects);

    System.out.println("如果合适 就开始签合同");
    return null;
  }
}
