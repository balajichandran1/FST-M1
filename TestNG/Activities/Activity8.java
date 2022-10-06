package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;
    WebDriverWait wait;
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TestSuite" parallel="classes">
    <test name="Tests">
        <classes>
            <class name="session9.Activity1"/>
            <class name="session9.Activity2"/>
            <class name="session9.Activity3"/>
            <class name="session9.Activity4"/>
            <class name="session9.Activity5"/>
            <class name="session9.Activity6"/>
        </classes>
    </test>
</suite>

}