package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1_id {
    public static void main(String[] args) {

        /*
        id:
    --> id will locate by matching id attribute's value
    --> id is *** unique *** for that specific web element
    --> if you have id and it is not dynamic (meaning the attribute value is not changing when you refresh the page) you should always use id

    syntax: driver.findElement(By.id("id attribute's value"))
         */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.etsy.com";
        driver.get(URL);

        WebElement result = driver.findElement(By.id("global-enhancements-search-query")); //.sendKeys("wooden spoon");
        System.out.println(result.getAttribute("id"));



    }
}
