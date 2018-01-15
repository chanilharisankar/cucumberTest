package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.XPATH,using = ".//a[@class='account_icon']")
    private WebElement _myAccount_link;


    public void click_myAccount_link(){
        _myAccount_link.click();
    }



}
