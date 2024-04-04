package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarDetailObject extends AbstractObject{
    public CarDetailObject(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[1]/div[2]/div/div/div[1]/div/div[2]")
    public WebElement rentalOfficeButton;

    @FindBy(xpath = "//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[2]/div/div/div[1]/div[1]/div")
    public WebElement searchLocation;

    @FindBy(xpath = "//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div[3]/div/div[1]")
    public WebElement locationPickUp;

    @FindBy(xpath = "//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div")
    public WebElement location;

    @FindBy(xpath = "//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[5]/div[1]/div[2]/div/div/div[1]/div/div[2]")
    public WebElement dropOffOtherLocationButton;

    @FindBy(xpath = "//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[5]/div[2]/div/div/div[1]/div/div[1]/input")
    public WebElement searchLocationDropOff;

    @FindBy(xpath = "//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[5]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div")
    public WebElement locationDropOff;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[5]/div/div[1]/div/div[5]/div[3]/div")
    public WebElement buttonBookNow;



}
