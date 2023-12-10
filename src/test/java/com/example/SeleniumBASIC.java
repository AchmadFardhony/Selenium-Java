package com.example;

import static org.junit.Assert.assertArrayEquals;
import java.io.File;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class SeleniumBASIC {

    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    
    }
    
    @Ignore //CheckBox
    public void test1()throws InterruptedException {
    driver.navigate().to("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);

    driver.findElement(By.xpath("//a[.='Checkboxes']")).click();
    WebElement CheckBox = driver.findElement(By.xpath("//input[1]"));
    CheckBox.click();

    if ( CheckBox.isSelected()){
        driver.quit();  
        Thread.sleep(3000);
      }
    }

    @Ignore //RightClick
    public void test2()throws InterruptedException {
    driver.navigate().to("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);

    driver.findElement(By.xpath("//a[.='Context Menu']")).click();
    Actions actions = new Actions(driver);
    WebElement RightClick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
    actions.contextClick(RightClick).perform();
    driver.switchTo().alert().accept();
    driver.quit();
    
    }
    @Ignore //DropDown
    public void test3()throws InterruptedException {
    driver.navigate().to("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);

    driver.findElement(By.xpath("//a[.='Dropdown']")).click();
    Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
    dropdown.selectByVisibleText("Option 2");
    Thread.sleep(3000);
    driver.quit();

    }

    @Ignore //CTRL + A
    public void test4()throws InterruptedException {
    driver.navigate().to("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 5000)");

    driver.findElement(By.xpath("//a[.='Inputs']")).click();
    driver.findElement(By.xpath("//input[1]")).sendKeys("082113270204");
    driver.findElement(By.xpath("//input[1]")).sendKeys(Keys.CONTROL, "a");
    driver.findElement(By.xpath("//input[1]")).sendKeys("082113270204");
    Thread.sleep(3000);
    driver.quit();
    
    }
    
    @Test //Take A screenshoot
    public void test5()throws IOException, InterruptedException {
    driver.navigate().to("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);


    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 5000)");

    driver.findElement(By.xpath("//a[.='Inputs']")).click();
    WebElement SS1 = driver.findElement(By.xpath("//input[1]"));
    SS1.sendKeys("082113270204");
    Thread.sleep(2000);

    Screenshot screenshot1 = new AShot().takeScreenshot(driver);
    String screenshotPath1 = "C:\\Users\\achma\\Documents\\seleniumfirst\\Screenshoot\\1..PNG";

    try {
        ImageIO.write(screenshot1.getImage(),  "PNG", new File(screenshotPath1));
        System.out.println("Screenshot saved at: " + screenshotPath1);
    } catch (IOException e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }

    driver.findElement(By.xpath("//input[1]")).sendKeys(Keys.CONTROL, "a");
    driver.findElement(By.xpath("//input[1]")).sendKeys(Keys.BACK_SPACE);
    Thread.sleep(2000);
    WebElement SS2 = driver.findElement(By.xpath("//input[1]"));
    SS2.sendKeys("082110119617");
    Thread.sleep(2000);

    Screenshot screenshot2 = new AShot().takeScreenshot(driver);
    String screenshotPath2 = "C:\\Users\\achma\\Documents\\seleniumfirst\\Screenshoot\\2..PNG";

    try {
        ImageIO.write(screenshot2.getImage(),  "PNG", new File(screenshotPath2));
        System.out.println("Screenshot saved at: " + screenshotPath2);
    } catch (IOException e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }

    driver.quit();

    }


    @Test //CheckBox
    public void test6()throws InterruptedException {
    driver.navigate().to("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);


    }

}
