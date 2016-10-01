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
        HomePage homePage = new HomePage(driver);
        homePage.open();

        System.out.println("Click menu");
        homePage.buttonMenu().click();

        System.out.println("Click Tech");
        homePage.buttonTechInMenu().click();

        System.out.println("Confirm the title");
        Tech tech = new Tech(driver);
        assertEquals(tech.titleTech().getText(), "Tech");
        
        tech.close();
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
