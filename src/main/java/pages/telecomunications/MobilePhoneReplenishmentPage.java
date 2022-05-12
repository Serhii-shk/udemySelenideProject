//package pages.telecomunications;
//
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import pages.base.BasePage;
//
//public class MobilePhoneReplenishmentPage extends BasePage {
//    public MobilePhoneReplenishmentPage(WebDriver driver) {
//        super(driver);
//    }
//
//    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
//    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
//    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
//    private final By buttonSubmitToTheCart = By.xpath("//button[@data-qa-node='submit']");
//    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
//    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
//    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
//    private final By inputFirstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
//    private final By inputLastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
//    private final By paymentDetails = By.xpath("//div[@data-qa-node='details']");
//
//
//    /**
//     * Choose a card from the wallet
//     * **/
//    public MobilePhoneReplenishmentPage selectCardFromWallet() {
//        driver.findElement(buttonWallet).click();
//        return this;
//    }
//
//    /**
//     * Enter phone number excluding country code
//     * @param number phone number
//     * **/
//    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
//        driver.findElement(inputPhoneNumber).sendKeys(number);
//        return this;
//    }
//
//    /**
//     * Enter replenishment amount
//     * @param amount replenishment amount
//     * **/
//    public MobilePhoneReplenishmentPage enterAmount(String amount) {
//        driver.findElement(inputAmount).sendKeys(amount);
//        return this;
//    }
//
//    /**
//     * Enter number card
//     * @param card number card
//     * **/
//    public MobilePhoneReplenishmentPage enterCardFrom(String card) {
//        driver.findElement(inputCardFrom).sendKeys(card);
//        return this;
//    }
//
//    /**
//     * Enter card expiry date
//     * @param expDate card expiry date
//     * **/
//    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
//        driver.findElement(inputCardExpDate).sendKeys(expDate);
//        return this;
//    }
//
//    /**
//     * Enter Cvv
//     * @param cvv cvv card
//     * **/
//    public MobilePhoneReplenishmentPage enterCvv(String cvv) {
//        driver.findElement(inputCardCvv).sendKeys(cvv);
//        return this;
//    }
//
//    /**
//     * Click the button submit to the cart
//     * **/
//    public MobilePhoneReplenishmentPage submitToTheCart() {
//        driver.findElement(buttonSubmitToTheCart).click();
//        return this;
//    }
//
//    /**
//     * Enter first name
//     * @param firstName first name
//     * **/
//    public MobilePhoneReplenishmentPage enterFirstName(String firstName) {
//        driver.findElement(inputFirstName).sendKeys(firstName);
//        return this;
//    }
//
//    /**
//     * Enter last name
//     * @param lastName last name
//     * **/
//    public MobilePhoneReplenishmentPage enterLastName(String lastName) {
//        driver.findElement(inputLastName).sendKeys(lastName);
//        return this;
//    }
//
//    /**
//     * Check payment details present in the cart
//     * @param text
//     * **/
//    public MobilePhoneReplenishmentPage checkPaymentDetailsPresentInTheCart(String text) {
//        waitElementIsVisible(driver.findElement(paymentDetails));
//        WebElement details = driver.findElement(paymentDetails);
//        Assertions.assertEquals(text, details.getText());
//        return this;
//    }
//
//}
