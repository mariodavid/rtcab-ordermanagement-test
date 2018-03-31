package com.roadtocubaandbeyond.ordermanagement.login;

import com.haulmont.masquerade.Wire;
import com.haulmont.masquerade.base.Composite;
import com.haulmont.masquerade.components.*;
import org.openqa.selenium.support.FindBy;


public class LoginWindow extends Composite<LoginWindow> {
    @Wire
    public TextField loginField;

    @Wire
    public PasswordField passwordField;

    @Wire(path = "rememberMeCheckBox")
    public CheckBox rememberMeCheckBox;

    @Wire(path = {"loginFormLayout", "loginButton"})
    public Button loginSubmitButton;

    @Wire
    public LookupField localesSelect;

    @Wire
    public Label welcomeLabel;

    @FindBy(className = "c-login-caption")
    public Label welcomeLabelTest;
    
    
    
    public void loginAs(String username, String password) {

        loginField.setValue(username);
        passwordField.setValue(password);

        rememberMeCheckBox.setChecked(true);

        loginSubmitButton.click();
    }
}
