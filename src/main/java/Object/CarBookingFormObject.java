package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarBookingFormObject extends AbstractObject {
    public CarBookingFormObject(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/input")
    public WebElement fullName;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/input")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div[1]/div")
    public WebElement email;
}
