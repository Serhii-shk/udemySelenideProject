package pages.telecomunications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class MobilePhoneReplenishment extends BasePage {

	private final SelenideElement inputPhoneNumber = $x("//input[@data-qa-node='phone-number']");
	private final SelenideElement inputAmount = $x("//input[@data-qa-node='amount']");
	private final SelenideElement inputCardNumber = $x("//input[@data-qa-node='numberdebitSource']");
	private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
	private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
	private final SelenideElement buttonSubmitPayment = $x("//button[@data-qa-node='submit']");
//	private final SelenideElement cardNumberInTheCart = $x("//td[@data-qa-node='card']");
//	private final SelenideElement recipientNameInTheCart = $x("//span[@data-qa-node='nameB']");
//	private final SelenideElement amountInTheCart = $x("//span[@data-qa-node='amount']");
//	private final SelenideElement commissionInTheCart = $x("//span[@data-qa-node='commission']");
//	private final SelenideElement amountCurrencyInTheCard = $x("//small[@data-qa-node='currency']");
//	private final SelenideElement commissionCurrencyInTheCard = $x("//small[@data-qa-node='commission-currency']");
	private final SelenideElement walletButton = $x("//div[@data-qa-node='debitSourceSource']");

	/**
	 * Enter a phone number excluding country code
	 * @param phone phone number
	 */
	public MobilePhoneReplenishment enterPhoneNumber(String phone){
		clearAndType(inputPhoneNumber, phone);
		return this;
	}

	/**
	 * Enter the amount of replenishment of the mobile phone number
	 * @param sum amount of replenishment
	 */
	public MobilePhoneReplenishment enterAmount(String sum){
		clearAndType(inputAmount, sum);
		return this;
	}

	/**
	 * Enter the card number for payment
	 * @param number card number
	 */
	public MobilePhoneReplenishment enterCardNumber(String number){
		clearAndType(inputCardNumber, number);
		return this;
	}

	/**
	 * Enter the card expiry date for payment
	 * @param expDate expiry date
	 */
	public MobilePhoneReplenishment enterExpDate(String expDate){
		clearAndType(inputCardExpDate, expDate);
		return this;
	}

	/**
	 * Enter the cvv code from the card for payment
	 * @param cvv the cvv code
	 */
	public MobilePhoneReplenishment enterCvvCode(String cvv){
		clearAndType(inputCardCvv, cvv);
		return this;
	}

	/**
	 * Acceptance of payment
	 */
	public MobilePhoneReplenishment submitMobileReplenishment(){
		buttonSubmitPayment.shouldBe(Condition.visible).click();
		return this;
	}

	/**
	 * Choose a card from the wallet
	 */
	public MobilePhoneReplenishment selectCardFromWallet(){
		walletButton.shouldBe(Condition.visible).click();
		return this;
	}

	/**
	 * Check the card number with which the payment and the recipient
	 * @param cardFrom the card number for payment
	 * @param recipient mobile operator
	 */
	public MobilePhoneReplenishment checkPaymentCardAndRecipient(String cardFrom, String recipient){
		checkMessage(cardFrom);
		checkMessage(recipient);
		return this;
	}

	/**
	 * Check the amount and Commission amount
	 * @param amount the amount will be credited to the mobile account
	 * @param commission the commission in addition to mobile account
	 */
	public MobilePhoneReplenishment checkPaymentAmountAndCommission(String amount, String commission){
		checkMessage(amount);
		checkMessage(commission);
		return this;
	}

	/**
	 * Check the currency of the payment amount and currency of fee
	 * @param currencyAmount currency of the payment
	 * @param commissionAmount currency of fee
	 */
	public MobilePhoneReplenishment checkPaymentCurrency(String currencyAmount, String commissionAmount){
		checkMessage(currencyAmount);
		checkMessage(commissionAmount);
		return this;
	}
}