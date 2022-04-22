package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

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

        //Find the PIM option in the menu and click it
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
        Thread.sleep(3000);
        //Click the Add button to add a new Employee
        driver.findElement(By.id("btnAdd")).click();
        Thread.sleep(3000);

        //Fill in the required fields and click Save
        driver.findElement(By.id("firstName")).sendKeys("Balaji");
        driver.findElement(By.id("lastName")).sendKeys("Chandran");
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(3000);

        //Navigate back to the PIM page (Employee List tab) and verify the creation of your employee
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("BALAJI" + Keys.TAB);
        driver.findElement(By.id("searchBtn")).click();

        //Close the browser
        driver.close();


    }
}
