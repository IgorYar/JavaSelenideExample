package tests;

import org.junit.Test;
import pages.login.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;

public class LoginTest extends BaseTest {

    @Test
    public void invalidUsernameTest() {
        MainPage.formAuthentication.click();
        LoginPage.heading.shouldHave(text("Login Page"));

        LoginPage.username.setValue(LoginPage.INVALID_VALUE);
        LoginPage.password.setValue(LoginPage.VALID_PASSWORD);

        LoginPage.loginButton.click();
        LoginPage.flashMessageBar.shouldHave(text(LoginPage.INVALID_USERNAME_ERROR_MESSAGE));
    }

    @Test
    public void invalidPasswordTest() {
        MainPage.formAuthentication.click();
        LoginPage.heading.shouldHave(text("Login Page"));

        LoginPage.username.setValue(LoginPage.VALID_USERNAME);
        LoginPage.password.setValue(LoginPage.INVALID_VALUE);

        LoginPage.loginButton.click();
        LoginPage.flashMessageBar.shouldHave(text(LoginPage.INVALID_PASSWORD_ERROR_MESSAGE));
    }

    @Test
    public void validLoginDataTest() {
        MainPage.formAuthentication.click();
        LoginPage.heading.shouldHave(text("Login Page"));

        LoginPage.username.setValue(LoginPage.VALID_USERNAME);
        LoginPage.password.setValue(LoginPage.VALID_PASSWORD);

        LoginPage.loginButton.click();
        LoginPage.flashMessageBar.shouldHave(text(LoginPage.SUCCESSFULLY_LOGGED_MESSAGE));
        LoginPage.heading.shouldHave(text("Secure Area"));
        LoginPage.logoutButton.shouldHave(text("Logout"));

        LoginPage.logoutButton.click();
        LoginPage.heading.shouldHave(text("Login Page"));
    }
}
