package src.main.java.crmproject;


public class Actvity1 {
    public void user_is_on_Home_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://alchemy.hguy.co/crm");
    }
}
