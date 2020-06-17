import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProjectSettings {

    private WebDriver chromeDriver;

    public void setProjectWebDriver(){
        System.setProperty("webdriver.chrome.driver"
                ,"/Users/igor_shved/Documents/Java/libraries/webDrivers/chromedriver");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
    }

    public WebDriver getChromeDriver(){
        return this.chromeDriver;
    }
}
