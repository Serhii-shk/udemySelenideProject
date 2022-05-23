package pages.loans;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class CarLoans extends BasePage{

	private final SelenideElement agreementsTab = $x("//div[contains(text(), 'Agreements') and .//parent::a[@href='/auto-credit/my']]");
	private final SelenideElement amountFieldCarCost = $x("//input[@data-qa-node='amount']");
	private final SelenideElement amountFieldPrepaidExpense = $x("//input[@data-qa-node='prepaid']");
	private final SelenideElement phoneCodeButton = $x("//button[@data-qa-node='phone-code']");
	private final SelenideElement searchPhoneCodeField = $x("//input[@placeholder = 'Search' and .//ancestor::div[@data-qa-node]]");
	private final SelenideElement phoneNumberField = $x("//input[@data-qa-node = 'phone-number' and @placeholder = '000000000']");
	private final SelenideElement applyOrderButton = $x("//button[@type = 'button' and contains(text(), 'Submit an application')]");
	private final SelenideElement selectedUsedAutoTab = $x("//div[@data-qa-node='type' and contains(text(), 'With mileage')]");
	private final SelenideElement confirmForm = $x("//div[contains(text(), 'One-time password has been forwarded to your phone')]");
	private final SelenideElement buttonCountryRussia = $x("//div[@name='Russia']");

	/**
	 * Selecting a tab agreements
	 */
	public CarLoans selectAgreementsTab(){
		agreementsTab.shouldBe(Condition.visible);
		return this;
	}

	/**
	 * Test display of the form confirmation of transaction
	 */
	public CarLoans checkIsDisplayedConfirm(){
		confirmForm.shouldBe(Condition.visible);
		return this;
	}

	/**
	 * Enter the amount of the car value
	 * @param amount the full cost of a car
	 */
	public CarLoans enterAmountFieldCarCost(String amount) {
		clearAndType(amountFieldCarCost, amount);
		return this;
	}

	/**
	 * Enter the advance amount for the loan
	 * @param amount the amount of the advance payment
	 */
	public CarLoans enterAmountFieldPrepaidExpense(String amount) {
		clearAndType(amountFieldPrepaidExpense, amount);
		return this;
	}

	/**
	 * Filling in the mobile number to apply
	 * @param phoneNumber mobile number to apply
	 */
	public CarLoans enterPhoneNumber(String phoneNumber) {
		clearAndType(phoneNumberField, phoneNumber);
		return this;
	}

	/**
	 * Search country code for mobile communications
	 * @param phoneNumber mobile number to apply
	 */
	public CarLoans searchPhoneCountryCodeField(String phoneNumber) {
		clearAndType(searchPhoneCodeField, phoneNumber);
		return this;
	}

	/**
	 * Selection of drop down list of codes of countries, mobile communications
	 */
	public CarLoans selectPhoneCodeButton() {
		phoneCodeButton.shouldBe(Condition.visible).click();
		return this;
	}

	/**
	 * Confirmation of application for credit
	 */
	public CarLoans submitOrderButton() {
		applyOrderButton.shouldBe(Condition.visible).click();
		return this;
	}

	/**
	 * Check that the selected tab is "With mileage"
	 */
	public CarLoans checkSelectedTabWithMileageAuto() {
		selectedUsedAutoTab.shouldBe(Condition.visible);
		return this;
	}

	/**
	 * Select the country code from the drop down list
	 */
	public CarLoans selectCountryCountryRussiaFromList() {
		buttonCountryRussia.shouldBe(Condition.visible).click();
		return this;
	}
}