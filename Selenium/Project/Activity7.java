package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
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

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("(//a[text() ='Qualifications'])[2]")).click();
        Thread.sleep(3000);
        //Click on Add button to add WorkExperience
        driver.findElement(By.id("addWorkExperience")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("TestSpecialist");
        driver.findElement(By.id("experience_from_date")).clear();
        driver.findElement(By.id("experience_from_date")).sendKeys("2007-09-11");
        driver.findElement(By.id("experience_to_date")).clear();
        driver.findElement(By.id("experience_to_date")).sendKeys("2022-09-11");
        driver.findElement(By.xpath("//textarea[@id=\"experience_comments\"]")).click();
        driver.findElement(By.xpath("//textarea[@id=\"experience_comments\"]")).sendKeys("Sample Record for Work Experience");
        driver.findElement(By.id("btnWorkExpSave")).click();
        Thread.sleep(5000);

        //Close the browser.
        driver.close();

    }
    }
