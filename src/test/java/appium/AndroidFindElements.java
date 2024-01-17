package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class AndroidFindElements extends StartSession{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AppiumDriver driver = StartSession.initializeDriver("Android");
        // driver.findElement
        driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        // Using WebElement
        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
        element.click();
        // Using By Class
        driver.navigate().back();
        Thread.sleep(2000);
        By views = AppiumBy.accessibilityId("Preference");
        driver.findElement(views).click();
        driver.navigate().back();
        Thread.sleep(2000);

        WebElement element1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Media\")"));
//      By element2= AppiumBy.androidUIAutomator(("new Uiselector().text(\"Media\")"));

        //WebElement elemen21 = driver.findElement(AppiumBy.androidUIAutomator("new Uiselector().className(\"Media\")"));

        element1.click();
        // element21.click();;

        // New Line of Code to check GitHub Branch




    }
}
