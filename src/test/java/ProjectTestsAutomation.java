import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProjectTestsAutomation extends ProjectTestBase {

    private final String FB_URL = "http://www.fb.com";
    private final String FACEBOOK_URL = "https://www.facebook.com/";

    WebDriverWait wait = new WebDriverWait(chromeDriver, 10);

    @Test
    public void test_1_OpenFacebookSignUpPage(){
        chromeDriver.get(FB_URL);
    }

    @Test
    public void test_2_AssertTitle(){
        wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/"));
        Assert.assertEquals(FACEBOOK_URL,chromeDriver.getCurrentUrl());
    }
}
