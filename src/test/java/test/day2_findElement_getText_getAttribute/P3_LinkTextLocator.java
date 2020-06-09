package test.day2_findElement_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_LinkTextLocator {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        Thread.sleep(2000);

        driver.findElement(By.linkText("Gmail")).click();

        String actualGmailTitle = driver.getTitle();
        String expectGmailTitle = "Gmail";

        if(actualGmailTitle.contains(expectGmailTitle)){
            System.out.println("Gmail verification Passsed");
        }else {
            System.out.println("Gmail verification Failed");
        }

        Thread.sleep(4000);

        driver.navigate().back();

        String actualTitle = driver.getTitle();
        String expectTitle = "Google";

        if(actualTitle.equals(expectTitle)){
            System.out.println("Google verification Passed");
        }else {
            System.out.println("Google verification Failed");
        }




    }
}
