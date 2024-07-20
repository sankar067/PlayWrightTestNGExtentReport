package org.example;

import com.microsoft.playwright.*;
import org.example.extentConfig.ExtentManager;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseClass {
    // Shared between all tests in this class.
    Playwright playwright;
    Browser browser;

    // New instance for each test method.
    BrowserContext context;
    Page page;

    @BeforeClass
    void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
    }

    @AfterClass
    void closeBrowser() {
        playwright.close();
    }

    @BeforeMethod
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterMethod
    void closeContext() {
        context.close();
    }

    @BeforeSuite
    public void beforeSuite() throws IOException {
        ExtentManager.setExtent();
    }

    @AfterSuite
    public void afterSuite() {
        ExtentManager.endReport();
    }
}