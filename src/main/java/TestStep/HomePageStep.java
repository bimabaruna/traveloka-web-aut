package TestStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.time.LocalDate;

public class HomePageStep extends BaseStep{

    @Given("user click car rental")
    public void userClickCarRental() {
        objectHome.carIcon.click();
        objectHome.tabWithoutDriver.click();

    }

    @And("user select location car rental {string}")
    public void userSelectLocationCarRental(String location) {
        objectHome.carRentalLocation.click();
        objectHome.carRentalLocation.sendKeys(location);
        implicitWait(1);
        objectHome.resultLocation.click();
    }

    @And("user select date two days from today")
    public void userSelectDateDaysFromToday() {
        LocalDate currentDate = LocalDate.now();
        int today = currentDate.getDayOfMonth();
        objectHome.pickUpDate.click();
        selectDatePlus2(today);
    }


    @And("user input end time")
    public void userInputEndTimeAClock() {
        objectHome.endTime.click();
        time();
        objectHome.selectTime.click();
        objectHome.applyTime.click();
    }

    @And("user click search button")
    public void userClickSearchButton() {
        objectHome.searchButton.click();
    }
}
