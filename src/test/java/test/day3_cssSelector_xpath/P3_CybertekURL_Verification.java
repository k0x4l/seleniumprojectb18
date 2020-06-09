package test.day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURL_Verification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("anyemail@gmail.com");

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualURL = driver.getCurrentUrl();
        String expecteddURL = "email_sent";
        System.out.println("Your current URL = "+actualURL);

        if(actualURL.contains(expecteddURL)){
            System.out.println("URL verification PASSED");
        }else {
            System.out.println("URL verification FAİLED");
        }

        WebElement confirmationMesaage = driver.findElement(By.name("confirmation_message"));
        //String actualMessage = driver.findElement(By.name("confirmation_message")).getText();

    }
}
