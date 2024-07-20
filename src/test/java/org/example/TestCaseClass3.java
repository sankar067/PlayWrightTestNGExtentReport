package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCaseClass3 extends BaseClass {


    @Test
    void shouldSearchWiki() {
        page.navigate("https://www.wikipedia.org/");
        page.locator("input[name=\"search\"]").click();
        page.locator("input[name=\"search\"]").fill("playwright");
        page.locator("input[name=\"search\"]").press("Enter");
        assertEquals("https://en.wikipedia.org/wiki/Playwright", page.url());
    }
}
