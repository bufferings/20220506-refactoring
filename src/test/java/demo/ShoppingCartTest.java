package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ShoppingCartTest {
  static class AddTest {
    @Test
    public void 商品を追加すると新しいショッピングカートインスタンスを返す() {
      var cart1 = new ShoppingCart();
      var cart2 = cart1.add(new Product(1, "商品A", 500));

      assertNotSame(cart1, cart2);
      assertEquals(0, cart1.totalPrice());
      assertEquals(500, cart2.totalPrice());
    }
  }

  static class TotalPriceTest {
    @Test
    public void 商品がひとつもない場合_合計金額は0円() {
      var cart = new ShoppingCart();
      assertEquals(0, cart.totalPrice());
    }

    @Test
    public void 商品が追加されている場合_合計金額を返す() {
      var cart = new ShoppingCart();
      cart = cart.add(new Product(1, "商品A", 500));
      cart = cart.add(new Product(2, "商品B", 1500));

      assertEquals(2000, cart.totalPrice());
    }
  }

}