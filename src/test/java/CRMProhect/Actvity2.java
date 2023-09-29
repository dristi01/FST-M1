package CRMProhect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actvity2 {
    public static void main(String[] args) {
        // Setup WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();

        // Create an instance of ss
        WebDriver driver = new FirefoxDriver();

        // Navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");
        String Currenturl=driver.getCurrentUrl();
        System.out.println(Currenturl);


        // Close the browser
        driver.quit();
    }
}

