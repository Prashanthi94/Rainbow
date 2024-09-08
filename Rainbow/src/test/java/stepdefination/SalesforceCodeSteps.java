package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resuable.BaseCode;
import resuable.ReadExcelData;

import java.io.IOException;


public class SalesforceCodeSteps extends BaseCode {



@And("user clicks the login button")
    public void clickLogin(){

driver.findElement(By.id("Login")).click();

}

    @When("user enter the username {string} and password {string}")
    public void enterCredi(String userName, String password) throws IOException {

    driver.findElement(By.cssSelector("input[id='username']")).sendKeys(userName);
  //  driver.findElement(By.cssSelector("#username")).sendKeys(userName);
   //     driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();

       // driver.findElement(By.className("button r4 wide primary")).click();
      //  driver.findElement(By.id("username")).sendKeys(ReadExcelData.getExcelData("logininformation",0,0));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    }

    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {

        String actualErrorMessage =  driver.findElement(By.xpath("//form[@id='login_form']/child::div[@class='loginError']")).getText();

        System.out.println(actualErrorMessage);

        String expectedResult = "your username and password. If you still can't log in, contact your Salesforce administrator.";

     //   Assert.assertEquals(expectedResult,actualErrorMessage);


        if(actualErrorMessage.equals(expectedResult)){

            Assert.assertTrue(true);

        }
        else{

            Assert.assertTrue(false);

        }

    }



    @Then("verify whether the user navigates to Homepage")
    public void verifyWhetherTheUserNavigatesToHomepage() {
    }
}
