package pages.login;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public static final SelenideElement heading = $("h2"),
                                        username = $("[name=\"username\"]"),
                                        password = $("[name=\"password\"]"),
                                        loginButton = $(".fa"),
                                        flashMessageBar = $(".flash"),
                                        logoutButton = $("[href=\"/logout\"]");

    public static final ElementsCollection loginDataList = $$("em");

    public static final String VALID_USERNAME = loginDataList.get(0).getText(),
                               VALID_PASSWORD = loginDataList.get(1).getText(),
                               INVALID_VALUE = "qwerty",
                               INVALID_USERNAME_ERROR_MESSAGE = "Your username is invalid!",
                               INVALID_PASSWORD_ERROR_MESSAGE = "Your password is invalid!",
                               SUCCESSFULLY_LOGGED_MESSAGE = "You logged into a secure area!";
}
