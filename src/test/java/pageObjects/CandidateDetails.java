package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CandidateDetails extends BasePage {

	public CandidateDetails(WebDriver driver) {
		super(driver);

	}

	// @FindBy(xpath = "//input[@name='file-553']")
	// WebElement fileUpload;
	@FindBy(xpath = "//input[@id='g2599-name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='g2599-email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='g2599-website']")
	WebElement website;

	@FindBy(xpath = "//select[@id='g2599-experienceinyears']")
	WebElement expYears;
	@FindBy(xpath = "//input[@value='Functional Testing']")
	WebElement checkFunctionslaTesting;
	@FindBy(xpath = "//input[@value='Automation Testing']")
	WebElement checkAutomation;
	@FindBy(xpath = "//input[@value='Graduate']")
	WebElement btn_Graduate;
	@FindBy(xpath = "//textarea[@id='contact-form-comment-g2599-comment']")
	WebElement txtField;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement btnSubmit;
	@FindBy(xpath = "//div[@class='content_bgr']//h3[1]")
	WebElement cnfMsg;

	/*
	 * public void uploadFiles() { fileUpload.
	 * sendKeys("\"C:\\Users\\Faster\\Pictures\\Screenshots\\Screenshot 2024-09-02 211807.png\""
	 * ); }
	 */

	public void name() {
		firstName.sendKeys("Jacob");
	}

	public void email() {
		email.sendKeys("Jacob@gmail.com");
	}

	public void web() {
		website.sendKeys("https://www.google.com/");
	}

	public void selectYears() {
		Select st = new Select(expYears);
		st.selectByVisibleText("1-3");
	}

	public void checkBox1() {
		checkFunctionslaTesting.click();
	}

	public void checkBox2() {
		checkAutomation.click();
	}

	public void radioButton() {
		btn_Graduate.click();
	}

	public void textArea() {
		txtField.sendKeys("Test Purpose");
	}

	public void submit() {
		btnSubmit.click();
	}

	public String getConfirmationPage() {
		try {
			return (cnfMsg.getText());

		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}