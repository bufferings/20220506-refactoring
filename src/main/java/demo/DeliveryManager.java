package demo;

import java.util.List;

/**
 * 配送管理クラス
 */
public class DeliveryManager {

  /**
   * 配送料を返す。
   *
   * @param products 配送対象の商品リスト
   * @return 配送料
   */
  public static int deliveryCharge(List<Product> products) {
    var cart = new ShoppingCart();
    for (var elem : products) {
      cart = cart.add(elem);
    }
    var charge = new DeliveryCharge(cart);
    return charge.amount;
  }
}