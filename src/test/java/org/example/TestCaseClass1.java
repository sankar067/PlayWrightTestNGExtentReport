package org.example;

import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TestCaseClass1 extends BaseClass {

    @Test
    void verifyPlayWriteSearch() {
        page.navigate("http://google.com");
        page.locator(".gLFyf").fill("playwright");
        assertThat(page.locator("role=heading").getByText("playwright"));
    }
}
