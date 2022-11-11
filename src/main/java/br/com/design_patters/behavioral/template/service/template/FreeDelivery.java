package main.java.br.com.design_patters.behavioral.template.service.template;

import main.java.br.com.design_patters.behavioral.template.model.Cart;

public class FreeDelivery extends BestOfferTemplate {

  public FreeDelivery(Cart cart) {
    super(cart);
  }

  @Override
  public boolean isAppliable() {
    return regularItemsPrice > 500;
  }

  @Override
  protected void calibrateVariables() {
    deliveryFactor = 0d;
  }
}
