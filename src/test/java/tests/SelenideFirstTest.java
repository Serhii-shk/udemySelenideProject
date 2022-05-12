package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideFirstTest {
    @Test
    public void test() {
        open("https://www.google.com/");
        $x("//input[@name='q']")
                .setValue("ChromeDriver")
                .pressEnter();
        $x("//div[@id='result-stats']").shouldBe(Condition.visible);

    }
}
