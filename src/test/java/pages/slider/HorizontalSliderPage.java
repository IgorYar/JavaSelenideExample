package pages.slider;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class HorizontalSliderPage extends BasePage {

    public static final SelenideElement slider = $("[type=\"range\"]"),
                                        range = $("#range");

    public enum MOVE_DIRECTION {
        RIGHT,
        LEFT
    }

    public static void moveSlider(final MOVE_DIRECTION direction, final int step) {
        switch (direction) {
            case RIGHT : loopedKeyPress(step, Keys.ARROW_RIGHT);
                break;
            case LEFT : loopedKeyPress(step, Keys.ARROW_LEFT);
                break;
        }
    }

    public static void loopedKeyPress(final int step, final Keys key) {
        for (int i = 0; i < step; i++) {
            slider.sendKeys(key);
        }
    }
}
