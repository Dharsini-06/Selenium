package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLoginPojo {
	
	public FbLoginPojo() {
		
	}
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement clkbtn;

	
	public WebElement getMail() {
		return mail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClkbtn() {
		return clkbtn;
	}

}
