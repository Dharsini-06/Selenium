package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbregPojo extends BaseClass{

	
	public FbregPojo() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement CreateAcc;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firsttextbox;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastnametextbox;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement emailtextbox;

	@FindBy(xpath = "//input[@autocomplete='new-password']")
	private WebElement password;
	
	public WebElement getCreateAcc() {
		return CreateAcc;
	}

	public WebElement getFirsttextbox() {
		return firsttextbox;
	}

	public WebElement getLastnametextbox() {
		return lastnametextbox;
	}

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getPassword() {
		return password;
	}

}
