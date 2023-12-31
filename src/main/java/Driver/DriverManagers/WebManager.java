package Driver.DriverManagers;

import Driver.DriverFactories.DriverFactory;
import Driver.DriverManager;
import Driver.entity.WebDriverData;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static ConfigFiles.Factory.ConfigFactory.getConfig;

public final class WebManager {
    private WebManager(){}

    public static void getDriver(){
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().RemoteModeType());
            WebDriver driver =  DriverFactory.getDriverForWeb(getConfig().RunMode()).getDriver(driverData);
            driver.manage().window().maximize();
            driver.get("https://development.d38myx0xdgfcgt.amplifyapp.com");
            DriverManager.setDriver(driver);
        }
    }
}
