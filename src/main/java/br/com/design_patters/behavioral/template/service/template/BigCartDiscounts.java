package main.java.br.com.design_patters.behavioral.template.service.template;

import main.java.br.com.design_patters.behavioral.template.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {

  public BigCartDiscounts(Cart cart) {
    super(cart);
  }

  @Override
  public boolean isAppliable() {
    return regularItemsPrice > 1000;
  }

  @Override
  protected void calibrateVariables() {
    priceFactor = 0.9d;
  }
}
