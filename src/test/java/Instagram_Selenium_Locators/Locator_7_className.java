package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_7_className {
    public static void main(String[] args) {
        /*
        className:
        --> className is not unique, there could be multiple values of the same attribute value
        --> this locator will return the first one it finds
         */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.instagram.com/";
        driver.get(URL);

        String ElementX = "_2hvTZ pexuQ zyHYP";
        driver.findElement(By.className(ElementX)).sendKeys("cilekcicocuk"); //.sendKeys("wooden spoon");

        //driver.findElement(By.className("_2hvTZ pexuQ zyHYP")).sendKeys("cilekcicocuk");


    }
}
