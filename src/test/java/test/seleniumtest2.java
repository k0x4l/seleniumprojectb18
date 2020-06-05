package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest2 {
    public static void main(String[] args) throws Exception {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        /* driver.manage().window().maximize();

        //BROWSER NAVIGATIONS
        //this line will take user to the previous page
        Thread.sleep(2000); //this line adds 2000milliseconds of wait = 2seconds
        driver.navigate().back();

        System.out.println(driver.getTitle());
*/
    }
}
