package pages.basicElements;

import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class StatusCodesPage extends BasePage {

    public static final SelenideElement pageContentText = $("p"),
                                        statusCodeListLink = $("[href=\"/status_codes\"]"),
                                        code200 = $("[href=\"status_codes/200\"]"),
                                        code301 = $("[href=\"status_codes/301\"]"),
                                        code404 = $("[href=\"status_codes/404\"]"),
                                        code500 = $("[href=\"status_codes/500\"]");

    public static final List<SelenideElement> statusCodeList = new ArrayList<SelenideElement>(){{
        add(code200);
        add(code301);
        add(code404);
        add(code500);
    }};
}
