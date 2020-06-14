package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_3_linkText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //String URL = "https://www.instagram.com/accounts/login/"; //-
        String URL = "https://accounts.snapchat.com/accounts/login?continue=https%3A%2F%2Faccounts.snapchat.com%2Faccounts%2Fwelcome";
        driver.get(URL);

        //driver.findElement(By.linkText("Forgot password?")).click(); //-
        //driver.findElement(By.linkText("Sign Up")).click(); //+
        driver.findElement(By.linkText("Sign Up")).click();
    }
}
