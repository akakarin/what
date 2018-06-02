package Enums.Elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LazyWebElement {
    protected WebElement webElement;
    protected Browser browser;
    private By searchBy;

    public LazyWebElement(WebElement webElement, Browser browser){

        this.webElement = webElement;
        this.browser = browser;
    }

    public LazyWebElement(By searchBy, Browser browser){

        this.searchBy = searchBy;
        this.browser = browser;
    }

    private void initWebElement(){
        webElement = browser.findElement(this.searchBy);
    }

    public void init(){
        if(webElement == null){
            initWebElement();
        }
    }


}
