package main.java.proxy.dynamic.cglib;

public class CglibProxyTest {

  public static void main(String[] args) {
    Aimer aimer = (Aimer)new CglibAgency().getInstance(Aimer.class);
    aimer.tenancy();
  }
}
