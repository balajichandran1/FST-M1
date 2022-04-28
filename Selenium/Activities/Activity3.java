import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        driver.manage().window().maximize();

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
        //Find the input fields & text
        driver.findElement(By.id("firstName")).sendKeys("Sivaraj");
        driver.findElement(By.id("lastName")).sendKeys("Elangovan");
        Thread.sleep(3000);

        //driver.findElement(By.id(""));

        //Enter the email
        driver.findElement(By.id("email")).sendKeys("testing@example.com");
        Thread.sleep(3000);
        //Enter the contact number
        driver.findElement(By.id("number")).sendKeys("8899002233");
        Thread.sleep(3000);
        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        Thread.sleep(3000);
        //Close the browser
        driver.close();
    }
}