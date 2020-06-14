package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1_id {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        String URL = "https://www.etsy.com";
        driver.get(URL);

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon");

        //driver.findElement(By.);

        //driver.manage().deleteAllCookies();



    }














    /*
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.etsy.com";
        driver.get(URL);

        String idWebElement = "global-enhancements-search-query";

        WebElement result = driver.findElement(By.id(idWebElement));
        result.sendKeys("wooden spoon");
        //System.out.println(result.getAttribute("id"));
        }
        */




}
