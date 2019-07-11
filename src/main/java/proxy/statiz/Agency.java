package main.java.proxy.statiz;

public class Agency {

  private Person person;

  public Agency(Person person) {
    this.person = person;
  }

  public void tenancy() {
    System.out.println("筛选租房者要求");
    person.tenancy();
  }
}
