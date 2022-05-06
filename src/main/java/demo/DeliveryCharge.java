package demo;

public class DeliveryCharge {
  final int amount;

  public DeliveryCharge(ShoppingCart cart) {
    int charge = 0;
    int totalPrice = 0;
    for (Product each : cart.products) {
      totalPrice += each.price;
    }
    if (totalPrice < 2000) {
      charge = 500;
    } else {
      charge = 0;
    }
    this.amount = charge;
  }
}
