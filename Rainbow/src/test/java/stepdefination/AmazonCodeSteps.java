package stepdefination;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BaseCode;
import resuable.ReadExcelData;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonCodeSteps extends BaseCode {

    @Given("user selects the category in the homepage")
    public void selectCategory() throws IOException {

        WebElement selectCategroryElement = driver.findElement(By.id("searchDropdownBox"));
        Select catergory = new Select(selectCategroryElement);
       // catergory.selectByIndex(3);
       // catergory.selectByVisibleText("Beauty");
        catergory.selectByValue("search-alias=appliances");

       int dropdownCount = selectCategroryElement.findElements(By.tagName("option")).size();
       System.out.println(dropdownCount);

//        for (int i=0 ; i < dropdownCount ;i++){
//
//           String val= selectCategroryElement.findElements(By.tagName("option")).get(i).getText();
//
//            System.out.println(val);
//        }


        List <WebElement> categoryElem = selectCategroryElement.findElements(By.tagName("option"));
        List <String> categValue = new ArrayList<String>();
        for(WebElement a:categoryElem){
            categValue.add(a.getText());
        }

        for(String dropVal:categValue){

            if(dropVal.equals("Books")){
                Assert.assertTrue(true);
                break;
            }
        }


    }

    @Given("user handles the dynamic dropdown")
    public void userHandlesTheDynamicDropdown() {

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

//        WebElement toElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
//        toElement.findElement(By.xpath("//a[@value='MAA']")).click();

        driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();

    }

    @Given("user extracts the column one value")
    public void userExtractsTheColumnOneValue() {


        WebElement infosysTable = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

       int colunOneCount = infosysTable.findElements(By.tagName("th")).size();

       List<String> columnOneValue = new ArrayList<String>();  //empty list

        for(int n =0 ;n < colunOneCount ;n++ ){

            String valu =infosysTable.findElements(By.tagName("th")).get(n).getText();
           columnOneValue.add(valu);
        }

        System.out.println(columnOneValue);

        int colunTwoCount = infosysTable.findElements(By.tagName("td")).size();
        for(int n =2 ;n < colunTwoCount ;n++ ){

            String valu =infosysTable.findElements(By.tagName("td")).get(n).getText();
            System.out.println(valu);
        }

        WebElement acqElement = driver.findElement(By.xpath("//table[@class='wikitable']"));

       int colunTwo = acqElement.findElements(By.xpath("//tr//td[5]")).size();

       List <String> acqVal = new ArrayList<String>();
       for (int h =0 ; h < colunTwo; h++){
           String valu =acqElement.findElements(By.xpath("//tr//td[5]")).get(h).getText();
           System.out.println(valu);
           acqVal.add(valu);
       }

        System.out.println(acqVal);


    }

    @Given("user navigates to baby wish list page")
    public void userNavigatesToBabyWishListPage() {

        WebElement accountListElement = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.clickAndHold(accountListElement).build().perform();

       // driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Baby Wishlist")));


      //  driver.findElement(By.linkText("Baby Wishlist")).sendKeys("Madurai"+Keys.ENTER);

        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

       Set<String> handleValues = driver.getWindowHandles();

       for(String winProp:handleValues){

           driver.switchTo().window(winProp);

           if(driver.getTitle().contains("Baby Wish List")){

               break;
           }
       }


      Boolean field= driver.findElement(By.id("disable")).isEnabled();
       Assert.assertFalse(field);

       Assert.assertEquals("",driver.switchTo().alert().getText());

        driver.switchTo().alert().dismiss();

        driver.switchTo().alert().sendKeys("");


    }

    @Given("user handles the drag and drop")
    public void userHandlesTheDragAndDrop() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).build().perform();

        driver.switchTo().defaultContent();


    }
}
