package test.day9_testbase_properties_driverUtil;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.base.TestBase;

import java.util.Set;

public class WindowHandlePractice extends TestBase {

    @Test
    public void multiple_window_test(){
        driver.get("https://www.amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windowHandles =  driver.getWindowHandles();

        for ( String windowHandle : windowHandles ) {

            driver.switchTo().window(windowHandle);
            System.out.println("windowHandle = " + windowHandle);;
            System.out.println(driver.getTitle());

            if ( driver.getCurrentUrl().contains("etsy") ){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }

        }

    }

}
