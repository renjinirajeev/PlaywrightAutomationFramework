package com.automation.pages;

import com.automation.utils.ConfigReader;

import java.util.Collections;

public class LoginPage extends BasePage{
    public void openWebsite() {
        page.navigate(ConfigReader.getConfigProperty("base.url"));
    }

    public void doLogin(String usernameKey, String passwordKey) {
    }
}
