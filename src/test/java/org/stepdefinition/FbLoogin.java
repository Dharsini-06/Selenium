package org.stepdefinition;
import java.util.List;
import java.util.Map;

import org.bas.BaseClass;
import org.pojo.FbregPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;
public class FbLoogin extends BaseClass {
	FbregPojo f;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    WindowMaximize();
	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new button")
	public void to_click_the_create_new_button() {
		f=new FbregPojo();
		clickBtn(f.getCreateAcc());
	}

	@When("To pass the first name in the firstname text box")
	public void to_pass_the_first_name_in_the_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> m = d.asMap(String.class,String.class);
		f=new FbregPojo();
		passText(m.get("firstname1"),f.getFirsttextbox());
		
	    
	}

	@When("To pass surname in the surname text box")
	public void to_pass_surname_in_the_surname_text_box() {
	    f=new FbregPojo();
	    passText("maheswaran",f.getLastnametextbox());
	}

	@When("To pass mobile number or email in the text box")
	public void to_pass_mobile_number_or_email_in_the_text_box(DataTable d) {
		List<Map<String, String>> asMaps = d.asMaps();
		f=new FbregPojo();
		passText(asMaps.get(0).get("password1"),f.getEmailtextbox());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
	    f=new FbregPojo();
	    passText("572642782",f.getPassword());
	}

	@Then("To close the web Browser")
	public void to_close_the_web_Browser() {
	    //closeEntireBrowser();
	}


}
