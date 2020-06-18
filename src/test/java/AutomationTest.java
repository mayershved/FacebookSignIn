import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomationTest extends ProjectTestBase {

    private final String FB_URL = "http://www.fb.com";
    private final String FACEBOOK_URL = "https://www.facebook.com/";

    private final String FIRST_NAME = "Bob";
    private final String LAST_NAME = "Bobson";
    private final String EMAIL = "bob@user.com";
    private final String PASSWORD = "Password123@";

    private RegistrationPageObgect pageObgect = new RegistrationPageObgect(chromeDriver);
    private UI_Actions userAction = new UI_Actions(chromeDriver);

    Select selMonth, selDay, selYear, selGender;

    @Test
    public void test_01_openFBLandingPage(){
        chromeDriver.get(FB_URL);
    }

    @Test
    public void test_02_assertUrl(){
        Assert.assertEquals(FACEBOOK_URL,chromeDriver.getCurrentUrl());
    }

    @Test
    public void test_03_inputUserFirstName(){
        userAction.inputText(pageObgect.inputFirstNameElement,FIRST_NAME);
    }

    @Test
    public void test_04_inputLastName(){
        userAction.inputText(pageObgect.inputLastNameElement,LAST_NAME);
    }

    @Test
    public void test_05_inputEmail(){
        userAction.inputText(pageObgect.inputEmailElement,EMAIL);
    }

    @Test
    public void test_06_inputConfirmEmail(){
        userAction.inputText(pageObgect.inputConfirmEmailElement,EMAIL);
    }

    @Test
    public void test_07_inputPassword(){
        userAction.inputText(pageObgect.inputPasswordElement,PASSWORD);
    }

    @Test
    public void test_08_choseMonthFromDropMenu(){
    selMonth = new Select(userAction.getWebElement(pageObgect.monthDropMenuElement));
    selMonth.selectByVisibleText("Jan");
    }

    @Test
    public void test_09_choseDayFromDropMenu(){
        selDay = new Select(userAction.getWebElement(pageObgect.dayDropMenuElement));
        selDay.selectByVisibleText("1");
    }

    @Test
    public void test_10_choseYearFromDropMenu(){
        selYear = new Select(userAction.getWebElement(pageObgect.yearDropMenuElement));
        selYear.selectByVisibleText("1990");
    }

    @Test
    public void test_11_choseGender(){
        userAction.clickElement(pageObgect.genderRadioElement);
    }

    @Test
    public void test_12_chooseGenderPronoun(){
        selGender = new Select(userAction.getWebElement(pageObgect.genderDropMenuElement));
        selGender.selectByValue("1");
    }

    @Test
    public void test_13_inputCustomGender(){
        userAction.inputText(pageObgect.customGenderElement,"gender");
    }

    @Test
    public void test_14_SignUpUser(){
        userAction.clickElement(pageObgect.signUpButtonElement);
    }
}