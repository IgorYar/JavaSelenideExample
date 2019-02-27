package pages.basicElements;

import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class DropdownPage extends BasePage {

    public static final SelenideElement dropdownList = $("#dropdown");
}
