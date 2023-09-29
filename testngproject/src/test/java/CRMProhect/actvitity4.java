package CRMProhect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class actvitity4 {
    public static void main(String[] args) {
        // Setup Microsoft Edge WebDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Create an instance of EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Navigate to a URL
        String url = "http://alchemy.hguy.co/crm";
        driver.get(url);
        String gettext=driver.findElement(By.xpath("//*[@id=\"admin_options\"]")).getText();
        System.out.println(gettext);
        // Perform your automation tasks on the opened page

        // Close the browser
        driver.quit();
    }
}


