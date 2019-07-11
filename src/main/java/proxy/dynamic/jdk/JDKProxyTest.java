package main.java.proxy.dynamic.jdk;

import main.java.proxy.statiz.Person;

public class JDKProxyTest {

  public static void main(String[] args) {
    Person person = (Person) new JDKAgency().getInstance(new Perry());
    person.tenancy();
  }

}
