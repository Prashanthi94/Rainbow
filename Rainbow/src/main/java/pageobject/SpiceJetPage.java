package pageobject;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SpiceJetPage extends BaseCode {

    public static void selectCityInFromDropdown(String cityName){

        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR']//a[@value='"+cityName+"']")).click();
    }
}
