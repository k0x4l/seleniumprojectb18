package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_8_tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com");

        WebElement div_tag = driver.findElement(By.tagName("div"));
        System.out.println(div_tag.getText());

    }
}
