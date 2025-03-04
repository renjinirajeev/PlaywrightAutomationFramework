package com.automation.utils;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import java.time.Duration;

public class DriverManager {

    static Playwright playwright;
    static Page page;

    public static void createDriver(){
        playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );

        BrowserContext context = browser.newContext();
        page = browser.newPage();

    }

    public static Page getPage(){
        return page;
    }

    public static void quit(){
        playwright.close();
    }
}
