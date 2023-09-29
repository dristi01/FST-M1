package CRMProhect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Actvity9 {
        public static void main(String[] args) {
            // Set up Firefox driver
            WebDriverManager.firefoxdriver().setup();
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the page
            String url = "http://alchemy.hguy.co/crm";
            //
            driver.findElement(By.id("user_name")).sendKeys("admin");
            driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
            driver.findElement(By.id("bigbutton")).click();
            driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Accounts\"]")).click();
            List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody"));
            for (WebElement e : elements) {
                System.out.println(e.getText());
            }


            // Close the browser
            driver.close();
        }
    }

