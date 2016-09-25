package onoue.yoshihisa.test_case;

import static org.junit.Assert.*;

import onoue.yoshihisa.page.HomePage;
import onoue.yoshihisa.page.Tech;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    private static FirefoxDriver driver;
    WebElement element;
    
    @BeforeClass
    public static void openBrowser(){
        System.out.println("Launching Firefox");
        driver = new FirefoxDriver();
        System.out.println("Launched Firefox");
    }
 
    @Test
    public void canOpenTechPage() {
        System.out.println("Open home page");
        driver.get(HomePage.getUrl());
        System.out.println("Click menu");
        HomePage.buttonMenu(driver).click();
        System.out.println("Click Tech");
        HomePage.buttonTechInMenu(driver).click();
        System.out.println("Confirm the title");
        assertEquals(Tech.titleTech(driver).getText(), "Tech");
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
