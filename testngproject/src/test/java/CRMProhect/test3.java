package CRMProhect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class test3 {



        public static void main(String[] args) {
            // Set up Firefox driver
            WebDriverManager.firefoxdriver().setup();
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the page
            driver.get("https://www.v1.training-support.net/selenium/login-form");
            // Print the title of the page
            System.out.println("Home page title: " + driver.getTitle());


            String message = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Login message: " + message);

            // Close the browser
            driver.close();
        }
    }

