package CRMProhect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class test {
    public static void main(String[] args) {
        // Setup WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();

        // Create an instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the URL
        driver.get("http://alchemy.hguy.co/crm");
        String tittle=driver.getTitle();
        System.out.println(tittle);

        // Close the browser
        driver.quit();
    }
}

