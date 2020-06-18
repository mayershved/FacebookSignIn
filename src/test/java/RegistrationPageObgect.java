import org.openqa.selenium.By;

public class RegistrationPageObgect {

    // page By elements
    public By inputFirstNameElement = By.cssSelector("input[name = 'firstname']");
    public By inputLastNameElement = By.cssSelector("input[name = 'lastname']");
    public By inputEmailElement = By.cssSelector("input[name = 'reg_email__']");
    public By inputConfirmEmailElement = By.cssSelector("input[name = 'reg_email_confirmation__']");
    public By inputPasswordElement = By.cssSelector("input[name = 'reg_passwd__']");
    public By genderRadioElement = By.cssSelector("input[value = '-1']");
    public By customGenderElement = By.cssSelector("input[name = 'custom_gender']");
    public By signUpButtonElement = By.cssSelector("button[name = 'websubmit']");

    //DropMenu By elements
    public By monthDropMenuElement = By.id("month");
    public By dayDropMenuElement = By.id("day");
    public By yearDropMenuElement = By.id("year");
    public By genderDropMenuElement = By.name("preferred_pronoun");
}