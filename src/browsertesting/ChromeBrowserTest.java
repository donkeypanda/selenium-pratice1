package browsertesting;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {
String baseUrl= "https://demo.nopcommerce.com/";
//launch browser
WebDriver driver = new ChromeDriver();
//open url
driver.get(baseUrl);
//maximise
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        // get page title

        String title = driver.getTitle();
        System.out.println(title);

        //get page source

        System.out.println("The page source info: " + driver.getPageSource());

        //get current url
        System.out.println("The current url:" + driver.getCurrentUrl());

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        driver.navigate().to(loginUrl);
        System.out.println("Get current url "+ driver.getCurrentUrl());


        driver.navigate().back();
        System.out.println("The current url:" + driver.getCurrentUrl());


        driver.navigate().refresh();

        Thread.sleep(5000);
        driver.navigate().forward();
        System.out.println("The current url:" + driver.getCurrentUrl());

        //close browser
        driver.quit();
    }

}
