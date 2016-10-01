package onoue.yoshihisa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tech extends AbstractPage{
    private static final String url = "http://edition.cnn.com/tech";

    public Tech(WebDriver driver) {
        super(driver);
    }
    
    public String getUrl() {
        return url;
    }
    public WebElement titleTech() {
        return driver.findElement(By.className("zn-header__text-page_header"));
    }
}
