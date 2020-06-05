package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest4 {
    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //System.setProperty("")
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
}
