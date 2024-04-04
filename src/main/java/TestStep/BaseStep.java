package TestStep;

import Test.TestRunner;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Object.*;

public class BaseStep {

    public static HomeObject objectHome = new HomeObject(TestRunner.driver);
    public static CarSearchResult objSearchResult = new CarSearchResult(TestRunner.driver);
    public static CarDetailObject objCarDetail = new CarDetailObject(TestRunner.driver);
    public static CarBookingFormObject objCarBookingForm = new CarBookingFormObject(TestRunner.driver);

    public WebDriverWait wt = new WebDriverWait(TestRunner.driver,55);
    public Faker faker = new Faker();

    public void implicitWait(Integer time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {

        }
    }
    public String randEmail() {

        String email = faker.name().firstName();
        String emailFormat = "@mailinator.com";
        return email + emailFormat;
    }

    public void selectDatePlus2(Integer currentDate){
        int searchText = currentDate+2;
        WebElement element = TestRunner.driver.findElement(By.xpath("//div[@dir='auto' and contains(text(), '" + searchText + "')]"));
        element.click();
    }

    public void time(){
        WebElement element = TestRunner.driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[9]/div/div[2]/div/div/div[1]/div[1]/div[2]/div"));
        ((JavascriptExecutor) TestRunner.driver).executeScript("arguments[0].scrollBy(0, 300);", element);
    }
}
