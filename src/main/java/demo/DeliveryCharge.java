package demo;

public class DeliveryCharge {
  private static final int CHARGE_FREE_THRESHOLD = 2000;
  private static final int PAY_CHARGE = 500;
  private static final int CHARGE_FREE = 0;

  final int amount;

  public DeliveryCharge(ShoppingCart cart) {
    int totalPrice = cart.totalPrice();
    if (totalPrice < CHARGE_FREE_THRESHOLD) {
      amount = PAY_CHARGE;
    } else {
      amount = CHARGE_FREE;
    }
  }
}
