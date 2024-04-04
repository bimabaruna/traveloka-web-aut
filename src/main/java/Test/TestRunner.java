package Test;


import Base.ReportConfig;
import com.google.common.io.Files;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

@CucumberOptions(

        glue = "TestStep",
        features = "src/test/java/",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
        },
        tags = {"@guestBookCar"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

    public String reportDirectory = "reports";
    public String reportFormat = "xml";

    public static WebDriver driver = null ;
    DesiredCapabilities dc = new DesiredCapabilities();

    public void setUp() throws IOException, InterruptedException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Meister-\\IntelliJIDEAProjects\\AutomationTest\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.traveloka.com/en-id");
        driver.getTitle();


    }

    @Before
    public void asd(Scenario scenario){
        String scenarioName = scenario.getName();
        String[] arrayScenarioName = scenarioName.split("--");
        String scenarioName1 = arrayScenarioName[0];
        String scenarioName2 = arrayScenarioName[1];
        System.out.println("Scenario Name 1 for this test is -> " + scenarioName1);
        System.out.println("Scenario Name 2 for this test is -> " + scenarioName2);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String failureImageFileName = result.getMethod().getDescription()
                    + new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
            File failureImageFile = new File(System.getProperty("user.dir") + "//target/cucumber-html-reports/screenshots Failed/Fail " + failureImageFileName);
            failureImageFile.getParentFile().mkdir();
            failureImageFile.createNewFile();
            Files.copy(imageFile, failureImageFile);

        }
    }

    @AfterSuite(alwaysRun = true)
    public void quit() throws IOException {
        ReportConfig.generateCucumberReport();
        ReportConfig.takeScreenShootAfterFinish();
        driver.quit();
    }

    @BeforeSuite
    public void setUpp() throws Exception {
        setUp();
    }
}
