package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSearchResult extends AbstractObject {
    public CarSearchResult(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[5]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div")
    public WebElement selectCar;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[5]/div/div[4]/div/div[2]/div[2]/div/div[2]/div")
    public WebElement selectProvider;
}
