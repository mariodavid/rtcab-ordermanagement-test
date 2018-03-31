package com.roadtocubaandbeyond.ordermanagement.login;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.haulmont.masquerade.Components._$;

public class LoginTest {


    private String APPLICATION_BASE_URL = "http://localhost:8080/app";

    @Test
    public void login() {
        open(APPLICATION_BASE_URL);

        LoginWindow loginWindow = _$(LoginWindow.class);

        loginWindow.loginAs("admin", "admin");
    }

}