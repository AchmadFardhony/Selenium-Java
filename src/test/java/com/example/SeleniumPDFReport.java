package com.example;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class SeleniumPDFReport {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");

        // Initialize WebDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the desired page
        driver.get("https://Google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Take a screenshot 1
        File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("persib bandung");
        Thread.sleep(3000);

        // Take a screenshot 2
        File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        // Take a screenshot 3
        File screenshotFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Initialize PDF Document
        try (PdfWriter writer = new PdfWriter("SeleniumTestReport.pdf");
             PdfDocument pdf = new PdfDocument(writer);
             Document document = new Document(pdf)) {

            // Convert the screenshot to an iText Image
            Image image1 = new Image(ImageDataFactory.create(screenshotFile1.getAbsolutePath()));
            Image image2 = new Image(ImageDataFactory.create(screenshotFile2.getAbsolutePath()));
            Image image3 = new Image(ImageDataFactory.create(screenshotFile3.getAbsolutePath()));

            // Add the image to the PDF
            document.add(image1);
            document.add(image2);
            document.add(image3);

            System.out.println("Screenshot saved as PDF.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }
}
