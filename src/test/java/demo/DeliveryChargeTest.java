package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryChargeTest {
  @Test
  public void 商品の合計金額が2000円未満の場合_配送料は500円() {
    var cart = new ShoppingCart();
    cart = cart.add(new Product(1, "商品A", 500));
    cart = cart.add(new Product(2, "商品B", 1499));
    var charge = DeliveryCharge.from(cart);

    assertEquals(500, charge.amount());
  }

  @Test
  public void 商品の合計金額が2000円以上の場合_配送料は無料() {
    var cart = new ShoppingCart();
    cart = cart.add(new Product(1, "商品A", 500));
    cart = cart.add(new Product(2, "商品B", 1500));
    var charge = DeliveryCharge.from(cart);

    assertEquals(0, charge.amount());
  }
}