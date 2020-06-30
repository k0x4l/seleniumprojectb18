package test.day8_alerts_iframes_windows;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowhandleWarmup {
    /*
1. Create a new class called: WindowHandleWarmup
2. Create new test and make set ups
3. Go to : https://www.amazon.com
4. Copy paste the lines from below into your class

Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
These lines will simple open new tabs using something called JavaScriptExecut
and get those pages. We will learn JavaScriptExecutor later as well.

5. Create a logic to switch to the tab where Etsy.com is open
6. Assert: Title contains “Etsy”
     */

    WebDriver driver;
    String expectedTitle = "Etsy";

    @BeforeClass
    public void setUp(){

       driver = WebDriverFactory.getDriver("chrome");
       driver.get("https://www.amazon.com");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().deleteAllCookies();

    }

    @Test
    public void JSExecutor(){
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> tabs  = driver.getWindowHandles();

        for ( String tab : tabs ) {
/*
            if ( tab.equalsIgnoreCase("Etsy") ){
                Assert.assertEquals(expectedTitle,driver.getTitle());
                System.out.println(driver.getTitle());
                break;
            }

 */
            driver.switchTo().window(tab);
            if ( driver.getTitle().contains("Etsy") ){
                System.out.println(driver.getTitle());
                break;
            }

            System.out.println(driver.getTitle());

        }

        Assert.assertTrue(driver.getTitle().contains("Etsy"));

    }

}
