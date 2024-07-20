package org.example;

import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertTrue;

public class TestCaseClass2 extends BaseClass {
    @Test
    void verifyPlayWriteWiki() {
        page.navigate("https://wikipedia.org/");
        page.locator("id=searchInput").fill("playwright");
        assertThat(page.locator(".mw-page-title-main").getByText("Playwright"));
    }
}
