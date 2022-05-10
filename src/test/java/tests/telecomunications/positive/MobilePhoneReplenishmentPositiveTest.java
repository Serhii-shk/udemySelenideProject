package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.MobileReplenishmentTestDada.*;
import static constans.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {
    @Test
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_EXP_DATE)
                .enterCvv(MOBILE_PAYMENT_CVV)
                .enterFirstName(MOBILE_FIRST_NAME_CARD)
                .enterLastName(MOBILE_LAST_NAME_CARD)
                .submitToTheCart()
                .checkPaymentDetailsPresentInTheCart("1Mobile payment. Phone number +380979979468");

    }

}
