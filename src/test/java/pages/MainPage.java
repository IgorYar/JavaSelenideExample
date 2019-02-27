package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {

    public static final SelenideElement heading = $(".heading"),
                                        exampleList = $("h2"),
                                        addRemoveElementsLink = $("[href=\"/add_remove_elements/\"]"),
                                        dropdown = $("[href=\"/dropdown\"]"),
                                        formAuthentication = $("[href=\"/login\"]"),
                                        horizontalSlider = $("[href=\"/horizontal_slider\"]"),
                                        statusCodes = $("[href=\"/status_codes\"]");
}
