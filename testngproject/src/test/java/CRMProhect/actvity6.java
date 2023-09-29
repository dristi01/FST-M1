package CRMProhect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class actvity6 {
    public static void main(String[] args) {
        // Setup Microsoft Edge WebDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Create an instance of EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Navigate to a URL
        String url = "http://alchemy.hguy.co/crm";
        //
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String title=driver.getTitle();
        System.out.println(title);
        // Perform your automation tasks on the opened page

        // Close the browser
        driver.quit();

    }
}
