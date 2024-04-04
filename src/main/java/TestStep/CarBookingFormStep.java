package TestStep;

import io.cucumber.java.en.And;

public class CarBookingFormStep extends BaseStep{

    @And("user Fill name {string}")
    public void userFillName(String name) {
        objCarBookingForm.fullName.sendKeys(name);
    }

    @And("user Fill phone number {string}")
    public void userFillPhoneNumber(String number) {
        objCarBookingForm.phoneNumber.sendKeys(number);
    }

    @And("user fill email {string}")
    public void userFillEmail(String email) {
        objCarBookingForm.email.sendKeys(email);
    }
}
