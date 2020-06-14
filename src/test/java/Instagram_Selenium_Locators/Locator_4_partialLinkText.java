package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_4_partialLinkText {
    public static void main(String[] args) {
        /*
            partialLinkText:
        --> this locator allows us to locate LINKS by their texts, BUT it does not expect the exact text to be passed. Only check if the given text is contained in the link
        ex: <a href="https://www.google.com"> TEXT HERE </a>
            driver.findElement(By.partialLinkText("TEXT"));
            driver.findElement(By.partialLinkText("HERE"));
        You can compare this with .equals and .contains methods from Java.
        linkText --> .equals --> checks for the exact match
        partialLinkText --> .contains --> checks for partial match of the text
        */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.instagram.com/accounts/login/";
        driver.get(URL);


        String LinkText_Part_1 = "Forgot";
        String LinkText_Part_2 = "password";

        //driver.findElement(By.partialLinkText(LinkText_Part_1)).click();
        driver.findElement(By.partialLinkText(LinkText_Part_2)).click();
    }

}
