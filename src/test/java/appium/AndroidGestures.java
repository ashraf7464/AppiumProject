package appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidGestures {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = StartSession.initializeDriver("Android");
        dragGesture(driver);
        longClickGesture(driver);
        swipeGesture(driver);


    }

    public static void longClickGesture(AppiumDriver driver) throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement element =driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
                //  "x",217,
                // "y",659,
                "elementId", ((RemoteWebElement) element).getId(),
                "duration",1000
        ));
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();

    }

    public static void dragGesture(AppiumDriver driver) throws InterruptedException {



        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement element =driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", 844,
                "endY", 690
        ));

        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(1000);
    }

    public static void swipeGesture(AppiumDriver driver) throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[2]"));
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
        //"left", 100, "top", 100, "width", 200, "height", 200,
                "elementId",((RemoteWebElement)element).getId(),
                "direction", "left", //can do swipe down
                "percent", 1
        ));
    }


}
