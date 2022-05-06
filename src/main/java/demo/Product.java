package demo;

public class Product {
  private final int id;
  private final String name;
  private final int price;

  public Product(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public int id() {
    return id;
  }

  public String name() {
    return name;
  }

  public int price() {
    return price;
  }
}
