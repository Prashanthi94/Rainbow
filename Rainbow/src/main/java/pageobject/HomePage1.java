package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import resuable.BaseCode;

public class HomePage1 extends BaseCode {

    public HomePage1 enterProductName(String productName){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);

        return this;
    }

    public HomePage1 clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();

        return this;
    }

    public void clickSignIn(){

        WebElement signInElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(signInElement).build().perform();
        driver.findElement(By.linkText("Sign in")).click();
    }

}
