package demo;

public class DeliveryCharge {
  private static final int CHARGE_FREE_THRESHOLD = 2000;
  private static final int PAY_CHARGE = 500;
  private static final int CHARGE_FREE = 0;

  public static DeliveryCharge from(ShoppingCart cart) {
    int totalPrice = cart.totalPrice();
    if (fulfillChargeFreeCondition(totalPrice)) {
      return new DeliveryCharge(CHARGE_FREE);
    } else {
      return new DeliveryCharge(PAY_CHARGE);
    }
  }

  private static boolean fulfillChargeFreeCondition(int totalPrice) {
    return totalPrice >= CHARGE_FREE_THRESHOLD;
  }

  private final int amount;

  private DeliveryCharge(int amount) {
    this.amount = amount;
  }

  public int amount() {
    return amount;
  }

}
