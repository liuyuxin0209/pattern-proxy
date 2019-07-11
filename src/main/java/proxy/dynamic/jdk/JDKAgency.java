package main.java.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKAgency implements InvocationHandler {

  private Perry target;

  public Object getInstance(Perry target) {
    this.target = target;

    Class<?> clazz = target.getClass();

    //用来生成一个新的对象（字节码重组）
    return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println("我是jdk中介 开始给你 筛选适合你的房屋");

    method.invoke(this.target,args);

    System.out.println("如果合适 就开始签合同");

    return null;
  }
}
