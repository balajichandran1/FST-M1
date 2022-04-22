package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
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
        Thread.sleep(3000);
        //Click login
        driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
        Thread.sleep(3000);

        Boolean visible = driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
        Boolean clickable = driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled();

        if (visible == true && clickable == true) {
            //If clickable, click on the menu item.
            driver.findElement(By.id("menu_directory_viewDirectory")).click();
            Thread.sleep(3000);
        }
        String searchDirectory = driver.findElement(By.xpath("//div[@class ='head']/h1")).getText();
        if (searchDirectory.equalsIgnoreCase("Search Directory")) {
            System.out.println("Heading of the Pages matches: " + searchDirectory);
        } else
            System.out.println("Heading of the Pages does not matches");
        //close the browser
        driver.close();
    }
}
