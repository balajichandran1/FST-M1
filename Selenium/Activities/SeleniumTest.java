import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //Close the browser
        driver.close();
    }
}
