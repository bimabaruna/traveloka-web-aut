package TestStep;

import Test.TestRunner;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;

public class CarDetailStep extends BaseStep{

    @And("user pick up location in Rental office")
    public void userPickUpLocationInRentalOffice() {
        objCarDetail.rentalOfficeButton.click();
        objCarDetail.searchLocation.click();
        objCarDetail.locationPickUp.click();
    }
    @And("user drop off location other location")
    public void userDropOffLocationOtherLocation() {
        implicitWait(2);
        objCarDetail.dropOffOtherLocationButton.click();
        objCarDetail.searchLocationDropOff.click();
        objCarDetail.locationDropOff.click();
        implicitWait(5);
    }

    @And("user click button book now")
    public void userClickButtonBookNow() {
        objCarDetail.buttonBookNow.click();
        implicitWait(5);
    }
}
