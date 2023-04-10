package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Current URl
        System.out.println("Current URL :" + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        // Find the Username field Element and type the username
         driver.findElement(By.name("username")).sendKeys("Admin");

         // Find the Password Field Element and type the password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //close the Browser
       driver.close();

    }
}
