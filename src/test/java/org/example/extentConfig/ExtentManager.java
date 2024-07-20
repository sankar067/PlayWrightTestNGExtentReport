package org.example.extentConfig;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;

public class ExtentManager {

    public static ExtentSparkReporter sparkReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setExtent() throws IOException {
        extent = new ExtentReports();
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/" + "TestExecutionReport" + ".html");
        sparkReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");
        extent.attachReporter(sparkReporter);
    }

    public static void endReport() {
        extent.flush();
    }
}