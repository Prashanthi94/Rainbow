package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import resuable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class WikiPage extends BaseCode {

    public static List<String> getValue(int columnIndex){

     List<WebElement> co=  driver.findElements(By.xpath("//table[@class='wikitable']//tr//td["+columnIndex+"]"));

     List<String> columnValues = new ArrayList<String>();
     for (WebElement a:co){
         columnValues.add(a.getText());
     }

     return columnValues;

    }


    public static String getValue(int row , int column){

      return  driver.findElement(By.xpath("//table[@class='wikitable']//tr["+row+"]//td["+column+"]")).getText();
    }

    public void getRowValue(int row){

        driver.findElements(By.xpath("//table[@class='wikitable']//tr["+row+"]/td"));
    }




}
