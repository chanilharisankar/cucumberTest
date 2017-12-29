package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination  {

@Given("^application is open$")
public void application_in_open() throws Throwable {
System.out.println("application is open");

}

@When("^user loges in with username and password$")
public void user_loges_in_with_username_and_password() throws Throwable{
System.out.println("user_loges_in_with_username_and_password");
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



