package test.day6_testing_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.WebDriverFactory;

public class TestNGPractice {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running");
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");


    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
    }

    @Test
    public void test1(){
        System.out.println("Test1 running");
    }

    @Test
    public void test2(){
        System.out.println("Test2 running");

        Assert.assertEquals("string1","string2","String verification on test2 failed");
    }

    @Test
    public void test3(){
        System.out.println("Test3 is running");
        String actualTitle = " Amazon prime ";
        String expextedTitle = "prime";
        Assert.assertFalse(actualTitle.contains(expextedTitle));
    }

    @Test
    public void  google_title_test() throws Exception{


        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue(actualTitle.equals(expectedTitle));

        WebElement appleSearchBox = driver.findElement(By.name("q"));

        appleSearchBox.sendKeys("apple" + Keys.ENTER);
        String actualInTitle = driver.getTitle();
        String expectedInTitle =  "apple";

        Assert.assertTrue(actualInTitle.contains(expectedInTitle));

        Thread.sleep(2000);
        driver.close();
    }



}
