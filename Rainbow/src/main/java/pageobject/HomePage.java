package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import resuable.BaseCode;

public class HomePage extends BaseCode {

    public static void enterProductName(String productName){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public static void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public static void clickSignIn(){

        WebElement signInElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(signInElement).build().perform();
        driver.findElement(By.linkText("Sign in")).click();
    }

}
