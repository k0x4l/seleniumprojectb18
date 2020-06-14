package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_9_cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com");
        //driver.findElement(By.cssSelector("input[tabindex='19']")).sendKeys("wooden spoon");
        driver.findElement(By.cssSelector("div[class='nav-search-field ']>input")).sendKeys("wooden spoon");

        //driver.findElement(By.cssSelector("input[tabindex='19']")).sendKeys("wooden spoon"+ Keys.ENTER); //+
        //driver.findElement(By.cssSelector("input.19")).sendKeys("wooden spoon"+ Keys.ENTER); //-
        //driver.findElement(By.cssSelector("div[class='nav-search-field ']>input")).sendKeys("wooden spoon"+ Keys.ENTER); //+


        //driver.get("https://www.instagram.com");
        //driver.findElement(By.cssSelector("input[aria.label='Phone number, username, or email']")).sendKeys("cileckcicocuk");
        //driver.findElement(By.cssSelector("input[name='username']")).sendKeys("cilekcicocuk");
        //driver.findElement(By.cssSelector("button[class='sqdOP yWX7d    y3zKF     ']")).click();
        //driver.findElement(By.cssSelector("input.Phone number, username, or email")).sendKeys("cilekcicocuk");
        //driver.findElement(By.cssSelector("a[class='_2Lks6']")).click();
        //driver.findElement(By.cssSelector("div[class='_9GP1n   ']>input")).sendKeys("cilekcicocuk");


    }
}
