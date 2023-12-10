package com.example;

import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class SeleniumTestRunner {
        public static void main(String[] args) {
        TestNG testng = new TestNG();
        List<String> suites = new ArrayList<>();
        suites.add("C:\\Users\\achma\\Documents\\seleniumfirst\\Test.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}
