package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_SeleniumEasy_CheckBox {
    public static void main(String[] args) {

        //TC #2: SeleniumEasy Checkbox Verification – Section 1

        //1. Open Chrome browser
        WebDriver driver = utilities.WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //3. Verify "Success – Check box is checked" message is NOT displayed.
        WebElement successCheckbox = driver.findElement((By.xpath((""))));
        //4. Click to checkbox under "Single Checkbox Demo" section
        //5. Verify "Success – Check box is checked" message is displayed.

    }

}
