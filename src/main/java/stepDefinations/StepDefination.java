package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.CustomWebDriver;
import utils.Log;

import java.util.List;

public class StepDefination  {
    public WebDriver driver;


    @Given("^application is open$")
    public void application_in_open() throws Throwable {
        System.out.println("application is open");
        Log.info("yes");
        driver = new CustomWebDriver("firefox").getDriver();
        driver.get("https://stackoverflow.com");
        driver.quit();


    }

    @When("^user loges in with Username and Password$")
    public void user_Loges_In_With_Username_And_Password(DataTable dataTable) throws Throwable {
        List<List<String>> data =dataTable.raw();
        System.out.println(data.get(1).get(0));
    }

    @Then("^application loges in$")
    public void application_loges_in()throws Throwable{
        System.out.println("application_loges_in");
    }

    @And("^user closes the broswer$")
    public void user_closes_the_broswer$() throws Throwable{
        System.out.println("user_closes_the_broswer$");


    }



}



