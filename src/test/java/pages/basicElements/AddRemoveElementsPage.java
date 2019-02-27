package pages.basicElements;

import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class AddRemoveElementsPage extends BasePage {

    public static final SelenideElement addElementButton = $("[onclick=\"addElement()\"]"),
                                        deleteElementButton = $("[onclick=\"deleteElement()\"]");
}
