package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

import java.awt.*;
import java.awt.event.KeyEvent;


public class App {
    public static void main(String[] args) throws AWTException  {
 
       // Open PuTTY using Selenium and Robot class
        try {
            // Launch PuTTY via command prompt
            Runtime.getRuntime().exec("cmd /c start putty");

            // Initiate Class Robot
            Robot robot = new Robot();
            // Simulate to interact with the opened PuTTY window
            robot.keyPress(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_7);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_PERIOD);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_8);
            robot.keyPress(KeyEvent.VK_PERIOD);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_PERIOD);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_0);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyPress(KeyEvent.VK_RIGHT);  
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_TAB);    
            Thread.sleep(1000  );
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyPress(KeyEvent.VK_A);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_3);
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_ENTER);

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}

