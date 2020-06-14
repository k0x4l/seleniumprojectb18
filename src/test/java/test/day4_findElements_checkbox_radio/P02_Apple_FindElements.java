package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P02_Apple_FindElements {


    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        WebDriver driver = utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        //3. Click to iPhone
        //locating the iphone link with xpath
        WebElement iphoneLink = driver.findElement(By.xpath("//span[.='iPhone']/.."));
        //clicking to the iphone link we just located

        //Thread.sleep(2000);
        iphoneLink.click();
        //4. Print out the texts of all links
        //we need to locate all of the links on the page
        //body//a --> will return all of the links INSIDE OF <body>
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement link : allLinks){
            String textOfLinks = link.getText();
            System.out.println(textOfLinks);
        }
        //5. Print out how many link is missing text

        int LinksWithoutText = 0;
        int linksWithText = 0;

        for ( WebElement link : allLinks){
            String textOfLinks = link.getText();
            System.out.println(textOfLinks);
            if ( textOfLinks.isEmpty() ){
                LinksWithoutText++;
            }else {
                linksWithText++;
            }
        }

        System.out.println("links without text: "+LinksWithoutText);
        System.out.println("links with text: "+linksWithText);
        //6. Print out how many link has text
        //7. Print out how many total link
    }





}
