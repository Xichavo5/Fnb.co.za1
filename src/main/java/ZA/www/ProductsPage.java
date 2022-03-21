package ZA.www;

import ZA.common.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends CommonMethods {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "openaccount2")
    private WebElement openaccount;

    public boolean clickOpenAccount() {
        if (waitForElementToBeVisible(openaccount)) {
            clickElement(openaccount);
            return true;
        }
        return false;
    }

}
