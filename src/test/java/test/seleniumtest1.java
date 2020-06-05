package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seleniumtest1 {
    public static void main(String[] args) {

        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");


    }
}
