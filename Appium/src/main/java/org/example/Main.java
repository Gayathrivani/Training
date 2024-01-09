package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;


public class Main {

//    public static AndroidDriver driver;
    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:deviceName", "vivo");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:platformVersion", "13");
        caps.setCapability("appium:allowTestPackages", true);
        caps.setCapability("appium:autoGrantPermissions", true);
        caps.setCapability("appium:ignoreHiddenApiPolicyError", true);
        caps.setCapability("appium:noReset", false);
//        caps.setCapability(MobileCapabilityType.APP,"system/app/Calculator/Calculator.apk");
        caps.setCapability("appium:appPackage", "com.vivo.calculator");
        caps.setCapability("appium:appActivity", "com.vivo.calculator.Calculator");
        caps.setCapability("appium:automationName", "UiAutomater2");

//        URL url=new URL("http://127.0.0.1:4723/wd/hub");
//
//        driver=new AndroidDriver<>(url, caps);


//         AppiumDriver<MobileElement> driver;
//        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
//                caps);

//        System.out.println("-------App launched-------------------");
//        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.myairtelapp:id/btnv_icon\"])[3]")).click();
//        driver.findElement(By.id("00000000-0000-0039-ffff-ffff00000173")).click();
//        java.lang.String Title = driver.findElement(By.id("home_header_profile_main_page_title")).getText();
//        System.out.println(Title);
        URL appiumServerURL;
        try {
//            appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");
            System.out.println("-------App launched-------------------");
        } catch (Exception e) {
            throw new RuntimeException("Failed to create Appium server URL: " + e.getMessage());
        }

        // Initialize the AndroidDriver
//        WebDriver driver = new AndroidDriver<>(appiumServerURL, caps);
        WebDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);

        // Perform your automation actions here

        // Quit the driver when done
        if (driver != null) {
            driver.quit();
        }
    }
}