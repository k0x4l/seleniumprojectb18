package test.day4_findElements_checkbox_radio;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P01_MerriamWebster_FindElements {

    public static void main(String[] args) {
        WebDriver driver = utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.merriam-webster.com");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachlink : listOfLinks){
            System.out.println(eachlink.getText());
            String textOfEachLink = eachlink.getText();

            if ( textOfEachLink.isEmpty() ){
                linksWithoutText++;
            }else {
                System.out.println(eachlink.getText());
                linksWithText++;
            }
        }

        System.out.println("The number of links that does NOT have text: " + linksWithoutText);

        System.out.println("the number of links that has text: " + linksWithText);

        System.out.println("Total links on this page: " + listOfLinks.size());
    }

}
