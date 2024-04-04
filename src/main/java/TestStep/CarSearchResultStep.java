package TestStep;

import io.cucumber.java.en.And;

public class CarSearchResultStep extends BaseStep{

    @And("user choose car")
    public void userChooseCar() {
        objSearchResult.selectCar.click();
    }

    @And("user choose provider")
    public void userChooseProvider() {
        objSearchResult.selectProvider.click();
    }
}
