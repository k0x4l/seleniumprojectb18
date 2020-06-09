package test.day2_findElement_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBear_Titleverification {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        String actualTitle = driver.getTitle();
        String expectTitle = "Web Orders Login";

        if ( actualTitle.equals(expectTitle) ){
            System.out.println("HomePageTitle verification Passed");
        }else {
            System.out.println("HomePageTitle verification Failed");
        }

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        if (driver.getTitle().equals("Web Orders")){
            System.out.println("Landing Page verification Passed");
        }else {
            System.out.println("Landing Page verification Failed");
        }



    }
}
