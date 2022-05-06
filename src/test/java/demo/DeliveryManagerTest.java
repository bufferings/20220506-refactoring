package demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryManagerTest {
  @Test
  public void 商品の合計金額が2000円未満の場合_配送料は500円() {
    var products = List.of(
        new Product(1, "商品A", 500),
        new Product(2, "商品B", 1499)
    );
    assertEquals(500, DeliveryManager.deliveryCharge(products));
  }

  @Test
  public void 商品の合計金額が2000円以上の場合_配送料は無料() {
    var products = List.of(
        new Product(1, "商品A", 500),
        new Product(2, "商品B", 1500)
    );
    assertEquals(0, DeliveryManager.deliveryCharge(products));
  }
}