package tests;

import org.junit.Test;
import pages.slider.HorizontalSliderPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void horizontalSliderTest() {
        int rightStepsNumber = 5;
        int leftStepsNumber = 2;

        MainPage.horizontalSlider.click();
        HorizontalSliderPage.heading.shouldHave(text("Horizontal Slider"));
        HorizontalSliderPage.slider.hover();

        HorizontalSliderPage.moveSlider(HorizontalSliderPage.MOVE_DIRECTION.RIGHT, rightStepsNumber);
        HorizontalSliderPage.range.shouldHave(text(String.valueOf(rightStepsNumber/2)));

        HorizontalSliderPage.moveSlider(HorizontalSliderPage.MOVE_DIRECTION.LEFT, leftStepsNumber);
        HorizontalSliderPage.range.shouldHave(text(String.valueOf(rightStepsNumber/2 - leftStepsNumber/2)));
    }
}
