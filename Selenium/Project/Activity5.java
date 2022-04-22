package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity5 {
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
        //Click on My Info Tab
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
        Thread.sleep(3000);
        //On the new page, click the Edit button.
        driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
        Thread.sleep(3000);
        //Find, clear and fill In FirstName,Lastname,EmployeeID,Gender,Nationality and DOB

        //Firstname
        WebElement FirstName = driver.findElement(By.id("personal_txtEmpFirstName"));
        FirstName.clear();
        FirstName.sendKeys("Balaji");
        //LastName
        WebElement LastName = driver.findElement(By.id("personal_txtEmpLastName"));
        LastName.clear();
        LastName.sendKeys("Chandran");
        Thread.sleep(2000);
        //Employee Id
        WebElement EmployeeId = driver.findElement(By.id("personal_txtEmployeeId"));
        EmployeeId.clear();
        //Select Gender
        WebElement Gender = driver.findElement(By.id("personal_optGender_1"));
        Gender.click();
        //Select Nationality
        WebElement Nationality = driver.findElement(By.id("personal_cmbNation"));
        Select dropdown = new Select(Nationality);
        dropdown.selectByVisibleText("Indian");
        Thread.sleep(2000);
        //Enter DOB
        WebElement DOB = driver.findElement(By.id("personal_DOB"));
        DOB.clear();
        DOB.sendKeys("1986-10-02");
        Thread.sleep(3000);
        //Click on Save
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(3000);
        //Close the browser
        driver.close();

    }
}
