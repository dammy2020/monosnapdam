package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class logintest {

    private WebDriver driver;



    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.monosnap.com/");
        Thread.sleep(5000);

//1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.className("link headButtonWrap d-flex align-items-center justify-content-end justify-content-xl-center")).click();
        driver.findElement(By.className("w-100 textInput in")).sendKeys("corneliusakinloye071034@gmail.com");
        driver.findElement(By.className("w-100 textInput")).sendKeys("ayoKUNU$12.");
        driver.findElement(By.className("login")).click();

    }

    public static void main(String args[]) throws InterruptedException {
        logintest test = new logintest();
        test.setUp();
    }

}

