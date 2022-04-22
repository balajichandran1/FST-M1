package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //Open a browser and navigate to url
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        //Find and select the username and password fields
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement passWord = driver.findElement(By.id("txtPassword"));
        //Enter login credentials into the respective fields
        userName.sendKeys("orange");
        passWord.sendKeys("orangepassword123");
        //Click login
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
        // Navigate to MyInfo tab
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        //Click on the “Emergency Contacts” menu item.
        driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
        //Retrieve information about all the contacts listed in the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id ='emgcontact_list']/tbody/tr"));
        System.out.println("No of columns " + columns.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id ='emgcontact_list']/tbody/tr/td[2]"));
        System.out.println("No of Rows " + rows.size());
        //Print all the information to the console
        for (int j = 0; j < columns.size(); j++) {

            // To retrieve text from that specific cell
            String celtext = columns.get(j).getText();
            System.out.println(celtext);
        }
        //Close the browser.
        driver.close();
    }
}
