package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

   @Test (groups = { "Car" })
public void Car1() {
    System.out.println("Batch Car - Test car 1");
}

@Test (groups = { "Car" })
public void Car2() {
    System.out.println("Batch Car - Test car 2");
}