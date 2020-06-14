package Instagram_Selenium_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.instagram.com/accounts/login/?hl=en";
        driver.get(URL);

        //partialLinkText
        /*
            3- partialLinkText:
        --> partialLinkText is one of the 8 locators of Selenium
        --> this locator allows us to locate LINKS by their texts, BUT it does not expect the exact text to be passed. Only check if the given text is contained in the link
        ex: <a href="https://www.google.com"> TEXT HERE </a>
            driver.findElement(By.partialLinkText("TEXT"));
            driver.findElement(By.partialLinkText("HERE"));
        You can compare this with .equals and .contains methods from Java.
        linkText --> .equals --> checks for the exact match
        partialLinkText --> .contains --> checks for partial match of the text

        String LinkText_Part_1 = "Forgot";
        String LinkText_Part_2 = "password";

        //driver.findElement(By.partialLinkText(LinkText_Part_1)).click();
        driver.findElement(By.partialLinkText(LinkText_Part_2)).click();
         */
        //tagName
        /*
        6- tagName :
        --> tagName is one of the 8 locators in the Selenium
        --> tagName locates using the tagName itself
                --> the use case for this locator is very small
        --> usually good for when you want to locate all of the same type of web Elements
                --> for example : if you want to return all of the links on the page you can use it with findElements
        syntax : driver.findElement(By.tagName("a"))
        syntax : driver.findElement(By.tagName("div"))
        syntax : driver.findElement(By.tagName("input"))
        syntax : driver.findElement(By.tagName("h1"))


        WebElement tagName = driver.findElement(By.tagName("div"));
        System.out.println(tagName.getText());
        //https://dzone.com/articles/locating-elements-by-tagname-in-selenium

         */

        //driver.findElement(By.id("String"));

    }
}
