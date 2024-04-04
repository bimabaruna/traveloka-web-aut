package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObject extends AbstractObject{
    public HomeObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="login-button" )
    public WebElement homeLoginBtn;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[6]/div/div[2]/div")
    public WebElement carIcon;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div[1]/div/div/h4")
    public WebElement tabWithoutDriver;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/input")
    public WebElement carRentalLocation;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/h3")
    public WebElement resultLocation;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[3]/div/div[1]/div[1]/input")
    public WebElement pickUpDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[7]/div/div[1]/div[1]/input")
    public WebElement dropOffDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[9]/div/div[1]/div[1]/input")
    public WebElement endTime;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[9]/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div[12]")
    public WebElement selectTime;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[9]/div/div[2]/div/div/div[2]/div/div")
    public WebElement applyTime;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[9]/div/div[2]/div/div/div[1]/div[1]/div[2]/div")
    public WebElement component;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[11]/div/div/div")
    public WebElement searchButton;

}
