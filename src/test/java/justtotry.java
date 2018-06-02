import Enums.Elements.NavbarButton;
import Enums.NavbarEnum;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class justtotry extends AbstractTest {


// public final NavbarButton navbar = new NavbarButton("96b432e3-d374-4293-8145-b00772447cde", browser);
    @Test
    public void jus(){
//    navbar.click();

       wd.findElement(By.cssSelector("[data-id='96b432e3-d374-4293-8145-b00772447cde']")).click();
    // Enums.Elements.NavbarButton navbar = new Enums.Elements.NavbarButton(NavbarEnum.NEW_IN.getDataId(), browser);
    // navbar.click();
    }

}
