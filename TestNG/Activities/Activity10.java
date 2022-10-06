package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity10 {
    WebDriver driver;
    Actions builder;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        builder = new Actions(driver);

        //Open browser
        driver.get("https://www.training-support.net/selenium/sliders");
    }

    @Test
    public void sliderToMiddleTest() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Clicking on the slider element moves it to the middle
        slider.click();
        
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Mid value: " + volumeLevel);
        
        Assert.assertEquals(volumeLevel, "50");
    }
    
    @Test
    public void sliderToMaxTest() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
        
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max value: " + volumeLevel);
        
        Assert.assertEquals(volumeLevel, "100");
    }
    
    @Test
    public void sliderToMinTest() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();
        
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        
        Assert.assertEquals(volumeLevel, "0");
    }
    
    @Test
    public void sliderTo30Test() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
        
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        
        Assert.assertEquals(volumeLevel, "30");
    }
    
    @Test
    public void sliderTo80Test() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(45, 0).release().build().perform();
        
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);
        
        Assert.assertEquals(volumeLevel, "80");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}
    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("confirmAlertTestCase() started |");
        //Click the button to open a simple alert
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm Alert opened |");

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");
        
        //Assertion
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

        confirmAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 2)
    public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |");
        //Click the button to open a simple alert
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");

        //Switch to alert window
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        //Get text in the alert box and print it
        String alertText = promptAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        promptAlert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert |");
        
        //Assertion
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);

        promptAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("Ending Test |");
        //Close the driver
        driver.close();
    }
}