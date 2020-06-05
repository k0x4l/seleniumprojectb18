package test.day2_findElement_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleTitleVerification {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple");//+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        String actualTtile = driver.getTitle();
        String expectedTitle = "apple";

        if(actualTtile.startsWith(expectedTitle)){
            System.out.println("Google test title verification PASSED");
        }else {
            System.out.println("Google test title verification FAİLED");
        }
        //Thread.sleep(2000);

    }
}
