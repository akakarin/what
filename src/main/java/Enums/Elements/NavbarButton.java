package Enums.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavbarButton extends Button {

    public NavbarButton(String dataId, Browser browser){

        super(By.cssSelector("[data-id='" + dataId + "']"), browser);

    }


    

}
