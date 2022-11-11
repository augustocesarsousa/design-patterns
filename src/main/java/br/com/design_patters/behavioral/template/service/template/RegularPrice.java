package main.java.br.com.design_patters.behavioral.template.service.template;

import main.java.br.com.design_patters.behavioral.template.model.Cart;

public class RegularPrice extends BestOfferTemplate {

  public RegularPrice(Cart cart) {
    super(cart);
  }

  @Override
  public boolean isAppliable() {
    return true;
  }

  @Override
  protected void calibrateVariables() {
    // Nothing to adjust!
  }
}
