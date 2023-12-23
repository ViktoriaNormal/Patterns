package orderProcessor;

import addOn.AddOn;
import beverage.Beverage;
import recipe.Recipe;

public interface OrderProcessor {

    void processOrder(Beverage beverage,
                      double volume, Recipe recipe,
                      int addonsCount,
                      AddOn addOn,
                      String snack,
                      boolean heatWater,
                      String paymentMethod);
}
