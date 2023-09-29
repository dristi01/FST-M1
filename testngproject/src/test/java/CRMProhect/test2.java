package CRMProhect;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

    public class test2 {
        public static void main(String[] args) {
            // Set the path to the Firefox binary
            String firefoxBinaryPath = "C:\\Users\\004IH2744\\IdeaProjects\\testngproject\\src\\test\\resources"; // Replace with the actual path

            // Create FirefoxOptions and set the binary path
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary(firefoxBinaryPath);

            // Create WebDriver with FirefoxOptions
            WebDriver driver = new FirefoxDriver(firefoxOptions);

            // Perform your automation tasks here

            // Close the browser
            driver.quit();
        }
    }


