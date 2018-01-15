package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public WebDriver driver;
    public MyAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how=How.XPATH,using = "//input[@id=\"log\"]")
    private WebElement _inputUserName_textField;

    public void type_inputUserName_textField(String inputString){
        _inputUserName_textField.sendKeys(inputString);
    }

}
