package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.WebDriver;

public class P04_Cybertek_Checkboxes {
    public static void main(String[] args) {
        //Practice: Cybertek   Checkboxes
        // 1.Go    to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        // 2.Confirm   checkbox   #1 is NOT    selected   by default
        // 3.Confirm   checkbox   #2 is SELECTED   by default.
        // 4.Click checkbox   #1 to select it.
        // 5.Click checkbox   #2 to deselect   it.
        // 6.Confirm   checkbox   #1 is SELECTED.
        // 7.Confirm   checkbox   #2 is NOT

    }
}
