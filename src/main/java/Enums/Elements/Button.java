package Enums.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Button extends LazyWebElement {

  public Button(WebElement webElement, Browser browser){
      super(webElement, browser);

  }

  public Button(By searchBy, Browser browser){
      super(searchBy, browser);
  }


    public void click(){
        init();
        webElement.click();
    }
}
