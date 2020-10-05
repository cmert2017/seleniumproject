package com.cybertek.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
            browserType = browserType.toLowerCase();
        switch (browserType){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "opera":
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            /*case "Safari":
                WebDriverManager.safari().setup();
                return new SafariDriver();
                */
            case "edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case "chromium":
                WebDriverManager.chromiumdriver().setup();
                return new InternetExplorerDriver();
            case "internetexplorer":
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            default:
                System.out.println("Not valid input");
                throw new RuntimeException("Not valid driver");
        }

    }

    public static void urlContainsVerification(String actualURL, String expectedinURL){
        if(actualURL.contains(expectedinURL)){
            System.out.println("URL contains com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("URL contains com.cybertek.extrapractice.test FAILED");
            System.out.println(actualURL);
            System.out.println(expectedinURL);
        }
    }

    public static void contentVerification(String actualContent, String expectedContent){
        if(actualContent.equalsIgnoreCase(expectedContent)){
            System.out.println("Content com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("Content com.cybertek.extrapractice.test FAILED");
            System.out.println(expectedContent);
            System.out.println(actualContent);
        }
    }

    public static void titleVerification(String actualContent, String expectedContent){
        if(actualContent.equalsIgnoreCase(expectedContent)){
            System.out.println("Title com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("Title com.cybertek.extrapractice.test FAILED");
            System.out.println(expectedContent);
            System.out.println(actualContent);
        }
    }

    public static void titleContainsVerification(String actualTitle, String expectedInTitle){
        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title contains com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("Title contains com.cybertek.extrapractice.test FAILED");
            System.out.println(actualTitle);
            System.out.println(expectedInTitle);
        }
    }

}
