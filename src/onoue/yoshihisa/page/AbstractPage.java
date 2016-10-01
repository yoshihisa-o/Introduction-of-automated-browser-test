package onoue.yoshihisa.page;

import org.openqa.selenium.WebDriver;

abstract class AbstractPage {
    
    protected WebDriver driver;
    protected String url;
    
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.url = getUrl();
    }
    
    protected abstract String getUrl();
    
    public void open(){
        driver.get(url);
    }
    
    public void close(){
        driver.close();
    }
}
