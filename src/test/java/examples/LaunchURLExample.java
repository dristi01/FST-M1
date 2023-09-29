package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchURLExample {
    public static void main(String[] args) {
        // Setup WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();

        // Create an instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the URL
        driver.get("https://www.example.com");

        // Close the browser
        driver.quit();
    }
}
