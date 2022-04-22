package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        // Create a Firefox instance
        WebDriver driver = new FirefoxDriver();
        //Open a page
        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        String Link = driver.findElement(By.xpath("//div[@id='divLogo']/img")).getAttribute("src");

        System.out.println("URL is : "+ Link);
        driver.close();

    }
}
