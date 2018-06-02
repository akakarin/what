package Enums.Elements;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

import java.net.URL;

public class Browser extends RemoteWebDriver implements AutoCloseable{
    public Browser(Capabilities capabilities){
       super(getChromeExecutor(), capabilities);
    }

    public Browser (URL url, Capabilities capabilities){
        super(url, capabilities);
    }

    private static DriverCommandExecutor getChromeExecutor(){
        return new DriverCommandExecutor(ChromeDriverService.createDefaultService());
    }
}
