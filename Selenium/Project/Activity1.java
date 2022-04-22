package LiveProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.Assert.assertEquals;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException{
        // Create a Firefox instance
        WebDriver driver = new FirefoxDriver();

        //Open a page
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(5000);

        //Getting the title
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "OrangeHRM";
        //Verifying both expected and actual title
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Both Actual Title & Expected Title are matching, so browser will be closed soon");
        // Close the page
        driver.close();

    }
}
