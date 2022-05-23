package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public final SelenideElement authWidgetP24new = $x("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * A method for navigating to a specific URL
     **/
    public void goToURL(String url){
        open(url);
    }

    /**
     * A method that cleans the element of the text and enters the desired text
     * @param element Selenium WebElement
     * @param value text
     * */
    protected void clearAndType(SelenideElement element, String value) {
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.setValue(value);
    }

    /**
     * Checking whether a frame for authorization
     **/
     public void checkIsDisplayedAuthWidget() {
         authWidgetP24new.shouldBe(Condition.visible);
    }


    /** Check the text on page */
    public void checkMessage(String message) {
         $(byText(message)).shouldBe(Condition.visible);
    }
}
