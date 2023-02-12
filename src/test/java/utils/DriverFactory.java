package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class DriverFactory {
    private static WebDriver driver;

    private static final String DRIVER_PATH = "src/test/resources/";

    public static WebDriver getDriver(Browser browser) {
        File file;
        switch (browser) {
            case CHROME -> {
                file = new File(DRIVER_PATH + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
            }
            case EDGE -> {
                file = new File(DRIVER_PATH + "msedgedriver.exe");
                System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
                driver = new EdgeDriver();
            }
        }
        driver.manage().window().maximize();
        return driver;
    }
}
