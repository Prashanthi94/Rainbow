package pageobject;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class ResultPage extends BaseCode {

    public static String getResultPageTitle(){

       return driver.getTitle();
    }

    public static void selectResult(int index ){

        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+index+"']//a")).click();
    }
}
