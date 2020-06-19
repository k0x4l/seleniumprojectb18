package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectorExample {
    public static void main(String[] args) throws Exception {
        WebDriver driver = utilities.WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");
        WebElement amazonsearch = driver.findElement(By.cssSelector("input[tabindex='19'"));
        amazonsearch.sendKeys("wooden spoon" + Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedInTitle = "wooden spoon";

        Thread.sleep(1000);

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

    }
}
