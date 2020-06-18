import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UI_Actions {

    private WebDriver driver;

    //UI_Actions methods

    public WebElement getWebElement(By element){
        return driver.findElement(element);
    }

    public void inputText(By element, String userInput) {
        driver.findElement(element).sendKeys(userInput);
    }

    public void clickElement(By element){
        driver.findElement(element).click();
    }

    //class constructor
    public UI_Actions(WebDriver driver) {
        this.driver = driver;
    }

}
