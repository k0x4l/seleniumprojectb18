package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_10_xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.apple.com");
        //driver.findElement(By.xpath("//div/input[@id='twotabsearchtextbox']")).sendKeys("wooden spoon");

        WebElement xXx = driver.findElement(By.xpath("//a[@href='/iphone/']"));
        //xXx.click();
        //System.out.println(xXx.getAttribute());


        //driver.findElement(By.xpath("//div/input[@id='twotabsearchtextbox']")).sendKeys("wooden spoon"); //+
        //driver.findElement(By.xpath("//div/input[@class='nav-input']")).sendKeys("wooden spoon"); //- ??
        //driver.findElement(By.xpath("//div/a[@class='nav-a nav-a-2  ']")).click(); //+


        //driver.get("https://www.instagram.com/accounts/login/");
        //driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("cilekcicocuk"); //-



    }
}
