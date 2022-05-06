package demo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  private final List<Product> products;

  public ShoppingCart() {
    products = new ArrayList<>();
  }

  private ShoppingCart(List<Product> products) {
    this.products = products;
  }

  public ShoppingCart add(Product product) {
    var adding = new ArrayList<>(products);
    adding.add(product);
    return new ShoppingCart(adding);
  }

  public int totalPrice() {
    return products.stream().mapToInt(Product::price).sum();
  }
}
