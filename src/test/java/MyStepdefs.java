

import ZA.www.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;


public class MyStepdefs extends BaseClass{
    @Given("^As a user i launch the sauce demo webpage$")
    public void as_a_user_i_launch_the_sauce_demo_webpage()  {
    openBrowser(endPoint);

    }







    @And("I click open account")
    public void iClickOpenAccount() {
    ProductsPage productsPage = new ProductsPage(driver);
    productsPage.clickOpenAccount();
    }

    @And("User enters{string}")
    public void userEnters(String fName) {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.captureUsernameField(fName);
    }

    @And("User  types {string}")
    public void userTypes(String password) {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.capturePasswordField(password);
    }



    @And("User type{string}")
    public void userType(String sname) {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.captureSurnameField(sname);
    }

    @And("The user enters the {string}")
    public void theUserEntersThe(String email) {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.captureEmailField(email);
    }

    @And("The user types {string}")
    public void theUserTypes(String mobile) {
        PersonalInformationPage personalInformationPage= new PersonalInformationPage(driver);
        personalInformationPage.captureMobileField(mobile);
    }

    @And("The user enters {string}")
    public void theUserEnters(String username) {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.captureUserNameField(username);
    }

    @And("User enters his{string}")
    public void userEntersHis(String saId) {
        PersonalInformationPage personalInformationPage= new PersonalInformationPage(driver);
        personalInformationPage.captureSAIDField(saId);
    }

    @And("User click the product desired")
    public void userClickTheProductDesired() {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.clickOption();
    }

    @And("User click the Captcha checkbox")
    public void userClickTheCaptchaCheckbox() {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.clickCaptcha();
    }
}

