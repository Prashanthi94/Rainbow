package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobject.HomePage;
import pageobject.ResultPage;
import pageobject.SignInPage;
import pageobject.WikiPage;

public class AmazonSteps {

    @Given("user enter the product name")
    public void userEntername(){

        HomePage.enterProductName("iphone");
        HomePage.clickSearchIcon();

    }

    @Then("validate the title of search result page")
    public void validateTheTitleOfSearchResultPage() {

        Assert.assertEquals("Amazon.in : iphone", ResultPage.getResultPageTitle());


        ResultPage.selectResult(4);
    }

    @Given("user enter the credi")
    public void userEnterTheCredi() {
        HomePage.clickSignIn();
        SignInPage.enterMailId();
        SignInPage.clickContinue();
        SignInPage.enterPassword();
        SignInPage.clickSignIn();

        WikiPage.getValue(3,2);
    }
}
