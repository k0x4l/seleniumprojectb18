package Instagram_Selenium_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater_2_name {
    public static void main(String[] args) {
        /*
        name: This locator will be looking into the whole HTML code, and return the WebElement with matching name attribute value
        - it will find and return the first webElement it finds
         */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.instagram.com/accounts/login/";
        driver.get(URL);

        //driver.findElement(By.name("username"));
        //driver.findElement(By.name("username")).sendKeys("cilekcicocuk");

        //driver.findElement(By.name("password")).sendKeys("123456");

    }
}
