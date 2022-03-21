package ZA.www;

import ZA.common.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPage extends CommonMethods {

    public PersonalInformationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "first_name")
    private WebElement txtFname;
    @FindBy(id = "surname")
    private WebElement txtSname;
    @FindBy(id = "email")
    private WebElement txtEmail;
    @FindBy(id = "phone")
    private WebElement txtPhone;
    @FindBy(id = "password")
    private WebElement txtPassword;
    @FindBy(id = "sa_id")
    private WebElement txtsa_id;
    @FindBy(id = "build-number")
    private WebElement txtMobile;
    @FindBy(id = "username")
    private WebElement txtUserName;
    @FindBy(xpath = "//*[@id=\"content\"]/ui-view/div/ai-register/div/div/div/div/ai-registration-landing/div/div/div/div[2]/form/div[6]/div[3]/div[2]/div/label/div[1]/div")
    private WebElement imgclick;
    @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
    private WebElement Captchaclick;
    @FindBy(xpath = "//*[@id=\"sa-id-field\"]/div/div")
    private WebElement lblMessage;
    public boolean captureSurnameField(String sName) {
        if (waitForElementToBeVisible(txtSname)) {
            captureText(txtSname, sName);
            return true;
        }
        return false;
    }
    public boolean captureUsernameField(String fName) {
        if (waitForElementToBeVisible(txtFname)) {
            captureText(txtFname, fName);
            return true;
        }
        return false;
    }
    public boolean captureEmailField(String email) {
        if (waitForElementToBeVisible(txtEmail)) {
            captureText(txtEmail, email);
            return true;
        }
        return false;
    }
    public boolean capturePhoneField(String phone) {
        if (waitForElementToBeVisible(txtPhone)) {
            captureText(txtPhone, phone);
            return true;
        }
        return false;
    }

    public boolean capturePasswordField(String password) {
        if (waitForElementToBeVisible(txtPassword)) {
            captureText(txtPassword, password);
            return true;
        }
        return false;
    }

    public boolean captureSAIDField(String saId) {
        if (waitForElementToBeVisible(txtsa_id)) {
            captureText(txtsa_id, saId);
            return true;
        }
        return false;
    }
    public boolean captureMobileField(String mobile) {
        if (waitForElementToBeVisible(txtMobile)) {
            captureText(txtMobile, mobile);
            return true;
        }
        return false;
    }
    public boolean captureUserNameField(String username) {
        if (waitForElementToBeVisible(txtUserName)) {
            captureText(txtUserName, username);
            return true;
        }
        return false;
    }
    public boolean clickOption() {
        if (waitForElementToBeVisible(imgclick)) {
            clickElement(imgclick);
            return true;
        }
        return false;
    }
    public boolean clickCaptcha() {
        if (waitForElementToBeVisible(Captchaclick)) {
            clickElement(Captchaclick);
            return true;
        }
        return false;
    }
    public boolean verifySouthAfricanIDnumbersarethirteendigits(String message) {
        if (waitForElementToBeVisible(lblMessage)) {
            if (lblMessage.getText().equalsIgnoreCase(message)){
                return true;
            }
            else return false;
        }
        return false;
    }
}
