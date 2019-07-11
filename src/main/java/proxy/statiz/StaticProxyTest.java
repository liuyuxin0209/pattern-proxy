package main.java.proxy.statiz;

public class StaticProxyTest {

  public static void main(String[] args) {
    Peter peter = new Peter();
    Agency agency = new Agency(peter);
    agency.tenancy();
  }
}
