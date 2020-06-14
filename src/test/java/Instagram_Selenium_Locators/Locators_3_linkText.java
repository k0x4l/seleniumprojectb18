package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_3_linkText {
    public static void main(String[] args) {
        /*
        2- linkText:
    --> linktext is one of the 8 locators of Selenium
    --> this locator allows us to locate LINKS by their texts
    --> this locator will ONLY WORK ON LINKS
        How do I know if the webELement is a link or not?
        ->If it is stored inside of <a>, it is a link
    <a href="https://www.google.com"> TEXT HERE </a>
    TagName --> a --> anchor tag --> used for HTML links
    attribute --> href
    attribute value --> https://www.google.com
    LINK TEXT --> TEXT HERE
    ex: driver.findElement(By.linkText("TEXT HERE"));
         */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.instagram.com/accounts/login/";
        driver.get(URL);

        String LinkText = "Forgot password?";
        //driver.findElement(By.linkText(LinkText));
        driver.findElement(By.linkText(LinkText)).click();
    }
}
