package Instagram_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_2_name {
    public static void main(String[] args) {
        /*

        name: This locator will be looking into the whole HTML code, and return the WebElement with matching name attribute value
        - it will find and return the first webElement it finds


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //String URL = "https://www.instagram.com/accounts/login/"; //-
        String URL = "https://en-gb.facebook.com/login/"; //+
        //String URL = "https://www.etsy.com"; //+
        driver.get(URL);
        //driver.findElement(By.name("username")).sendKeys("cilekcicocuk");

        //driver.findElement(By.name("search_query")).sendKeys("wooden spoon");

        driver.findElement(By.name("email")).sendKeys("cilekcicocuk"); //+
        //driver.findElement(By.name("username")); //-
        //driver.findElement(By.name("password")).sendKeys("cilekcicocuk"); //-
        //driver.findElement(By.name("password")).sendKeys("123456"); //-
        */
        /*
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.instagram.com/");

        // 1.Inspect the elements

        // 2.Find the name of email input box, type random email (Sendkeys)

        driver.findElement(By.name("username")).sendKeys("instagram@gmail.com");
        // 3.Find the name of password input box, type random password (Sendkeys)

        driver.findElement(By.name("password")).sendKeys("Password12345" + Keys.ENTER);
        // 4.And press ENTER (SendKeys(Keys.ENTER))

        //  driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

        // 5. Close the tab

        driver.close();
        */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\__{{ KoxaL }}__\\IdeaProjects\\seleniumprojectb18\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.instagram.com/");
        driver.manage().window().maximize();
        // 1.Inspect the elements

        driver.manage().deleteAllCookies();

        // 2.Find the name of email input box, type random email (Sendkeys)

        driver.findElement(By.name("username")).sendKeys("instagram@gmail.com");
        // 3.Find the name of password input box, type random password (Sendkeys)

        driver.findElement(By.name("password")).sendKeys("Password12345" + Keys.ENTER);
        // 4.And press ENTER (SendKeys(Keys.ENTER))

        //  driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

        // 5. Close the tab

        // driver.close();






    }
}
