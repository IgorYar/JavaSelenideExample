package tests;

import com.codeborne.selenide.*;
import org.junit.Assert;
import org.junit.Test;
import pages.basicElements.AddRemoveElementsPage;
import pages.basicElements.DropdownPage;
import pages.MainPage;
import pages.basicElements.StatusCodesPage;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.*;

public class BasicElementsTest extends BaseTest {

    @Test
    public void mainPageTest() {
        MainPage.heading.shouldHave(text("Welcome to the-internet"));
        MainPage.exampleList.shouldHave(text("Available Examples"));

    }

    @Test
    public void addRemoveElementsTest() {
        MainPage.addRemoveElementsLink.click();
        AddRemoveElementsPage.heading.shouldHave(text("Add/Remove Elements"));
        AddRemoveElementsPage.addElementButton.shouldBe(visible);
        AddRemoveElementsPage.addElementButton.shouldHave(text("Add Element"));
        AddRemoveElementsPage.deleteElementButton.shouldNotBe(visible);

        AddRemoveElementsPage.addElementButton.click();
        AddRemoveElementsPage.deleteElementButton.shouldBe(visible);
        AddRemoveElementsPage.deleteElementButton.shouldHave(text("Delete"));

        AddRemoveElementsPage.deleteElementButton.click();
        AddRemoveElementsPage.deleteElementButton.shouldNotBe(visible);
    }

    @Test
    public void dropdownTest() {
        MainPage.dropdown.click();
        DropdownPage.heading.shouldHave(text("Dropdown List"));
        DropdownPage.dropdownList.shouldHave(text("Please select an option"));

        DropdownPage.dropdownList.selectOption(1);
        DropdownPage.dropdownList.shouldHave(text("Option 1"));

        DropdownPage.dropdownList.selectOption(2);
        DropdownPage.dropdownList.shouldHave(text("Option 2"));
    }

    @Test
    public void statusCodeTest() {
        MainPage.statusCodes.click();
        StatusCodesPage.heading.shouldHave(text("Status Codes"));

        List<String> statusCodeTextList = new ArrayList<String>(){{
            add("200");
            add("301");
            add("404");
            add("500");
        }};

        for (SelenideElement statusCode : StatusCodesPage.statusCodeList) {
            int idx = StatusCodesPage.statusCodeList.indexOf(statusCode);

            statusCode.click();
            StatusCodesPage.pageContentText.shouldHave(text("This page returned a " + statusCodeTextList.get(idx) + " status code"));
            Assert.assertTrue(WebDriverRunner.url().endsWith("status_codes/" + statusCodeTextList.get(idx)));

            StatusCodesPage.statusCodeListLink.click();
        }
    }
}
