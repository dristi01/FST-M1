package CRMProhect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchURLExample1 {


    public static void main(String[] args) {

        // Setup WebDriverManager for Firefox
        WebDriverManager.edgedriver().setup();
        // Create an instance of ChromeDriver
        WebDriver driver = new EdgeDriver();
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
        String tittle = driver.getTitle();
        System.out.println(tittle);
        driver.manage().window().maximize();

    }
}