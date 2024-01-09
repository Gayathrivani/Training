import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Launch {
    public static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:deviceName", "vivo");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:platformVersion", "13");
        caps.setCapability("appium:noReset", false);
//        caps.setCapability(MobileCapabilityType.APP,"system/app/Calculator/Calculator.apk");
        caps.setCapability("appium:appPackage", "com.vivo.calculator");
        caps.setCapability("appium:appActivity", "com.vivo.calculator.Calculator");
        caps.setCapability("appium:automationName", "UiAutomator2");
        // Initialize the AndroidDriver
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver<>(url, caps);

        System.out.println("-------App launched-------------------");

        driver.findElement(By.id("com.vivo.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.vivo.calculator:id/op_add")).click();
        driver.findElement(By.id("com.vivo.calculator:id/digit_4")).click();
        driver.findElement(By.id("com.vivo.calculator:id/eq")).click();
        String ans=driver.findElement(By.id("com.vivo.calculator:id/formula")).getText();
        System.out.println("Addition of 2 + 4 = "+ ans);

        driver.closeApp();


    }
}
