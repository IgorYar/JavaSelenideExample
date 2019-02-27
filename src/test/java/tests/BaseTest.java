package tests;

import org.junit.Before;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeClass
    public static void setUp() {
        browser = "chrome";
        startMaximized = true;
        timeout = 5000;
        baseUrl = "http://the-internet.herokuapp.com";
    }

    @Before
    public void openMainPage() {
        open("/");
    }
}
