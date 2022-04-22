package LiveProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity8 {
    public static void main(String[] args) throws InterruptedException {
        // Create a Firefox instance
        WebDriver driver = new FirefoxDriver();

        //Open a page
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(5000);
        // Finding and entering the username and password
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("orange");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("orangepassword123");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

        //Navigate to the Dashboard page and click on the Apply Leave option
        driver.findElement(By.xpath("//span[text() ='Apply Leave']")).click();
        Thread.sleep(6000);
        // Selecting the leave type
        Select LeaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        LeaveType.selectByVisibleText("DayOff");
        // Clearing and updating From and To Date
        WebElement Fromdate = driver.findElement(By.id("applyleave_txtFromDate"));
        Fromdate.clear();
        Fromdate.sendKeys("2022-05-02");

        WebElement Todate = driver.findElement(By.id("applyleave_txtToDate"));
        Todate.clear();
        Todate.sendKeys("2022-05-03");
        // Entering the comments
        WebElement comments = driver.findElement(By.id("applyleave_txtComment"));
        comments.sendKeys("Taking Off from work");
        Thread.sleep(4000);
        // Click on Apply
        driver.findElement(By.id("applyBtn")).click();

        // Scrolling up and Just ensuring that the leave dates are appearing in the table
        WebElement Leavetable = driver.findElement(By.xpath("//div[@class='inner']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",Leavetable);
        Thread.sleep(5000);
        //Navigate to the My Leave page to check the status of the leave application.
        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
        Thread.sleep(5000);
        // Find our record and printing the approval status
        String approvalStatus = driver.findElement(By.xpath("//input[@id ='hdnLeaveRequestStatus_16']/preceding-sibling::a")).getText();
        System.out.println("Leave approval status:"+approvalStatus);
        //Close the browser.
        driver.close();

    }

}
