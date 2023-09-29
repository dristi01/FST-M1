package CRMProhect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class actvitity3 {
    public static void main(String[] args) {
        // Setup Microsoft Edge WebDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Create an instance of EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Navigate to a URL
        String url = "https://www.example.com";
        driver.get(url);

        // Perform your automation tasks on the opened page

        // Close the browser
        driver.quit();
    }
}
