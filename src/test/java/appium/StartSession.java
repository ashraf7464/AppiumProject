package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class StartSession {
    private static AndroidDriver driver;
    static String platformName;


    public static AppiumDriver initializeDriver(String platformName) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("appium:app", "D:\\Batch 6\\Appium\\ApiDemos-debug.apk");
        //desiredCapabilities.setCapability("appium:deviceName", "Pixel_3a");
        desiredCapabilities.setCapability("appium:deviceName", "Pixel 7 Pro");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, desiredCapabilities);
        return driver;
    }
}
