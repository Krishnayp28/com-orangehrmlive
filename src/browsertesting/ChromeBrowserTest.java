package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();;
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);

       // Get the Current URl
        System.out.println("Current URL :" + driver.getCurrentUrl());

      // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());



        // Find the Username field Element
        WebElement userName = driver.findElement(By.name("username"));
        // Type the username  to username field element
        userName.sendKeys("Admin");

        // Find the Password Field Element and type the password
       driver.findElement(By.name("password")).sendKeys("admin123");

       // close the Browser
        driver.close();

    }
}
