package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        // Create a Firefox instance
        WebDriver driver = new FirefoxDriver();
        //Open a page
        driver.navigate().to("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        //Find and select the username field
        WebElement Username = driver.findElement(By.id("txtUsername"));
        //Find and select the password field
        WebElement Password = driver.findElement(By.id("txtPassword"));

        //Enter the credentials in respective fields
        Username.sendKeys("orange");
        Password.sendKeys("orangepassword123");
        Thread.sleep(5000);
        //Click login
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);

        //Verify that the homepage has opened.
        String homePageTitle = driver.getTitle();
        System.out.println("Page Title is: " + homePageTitle);
        //Close the browser
        driver.close();

    }
}
