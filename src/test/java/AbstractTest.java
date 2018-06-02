import Enums.Elements.Browser;
import Enums.Elements.NavbarButton;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractTest {

    String baseUrl = "http://www.asos.com/women/";
  //  protected Browser browser;
  //  protected NavbarButton navbar;
    WebDriver wd;

        @Before
        public void start(){
            System.setProperty("webdriver.chrome.driver", "C:/Users/karin/Downloads/chromedriver_win32/chromedriver.exe");
/*
            try {
                List<String> chromeArgs = new ArrayList<String>();
                chromeArgs.add("--lang=en");
                chromeArgs.add("start-maximized");

                Map<String, Object > chromeOptions = new HashMap<String, Object>();
                chromeOptions.put("args", chromeArgs);
                DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
                desiredCapabilities.setPlatform(Platform.LINUX);
                desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

                browser = new Browser( new URL("http:///10.163.0.207:4444/wd/hub") ,desiredCapabilities);
                browser.get(baseUrl);

            }
            catch (Exception e){
                throw new RuntimeException(e);
            }
           navbar = new NavbarButton("96b432e3-d374-4293-8145-b00772447cde", browser);

            }
*/
            wd = new ChromeDriver();
            wd.get(baseUrl);
            wd.manage().window().maximize();



    }
}


