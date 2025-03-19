package com.fdmgroup.MindfulMotion.step_definitions;


import com.fdmgroup.MindfulMotion.pages.MindfulMotionPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MindfulMotion_StepDefinition {
	
	 private MindfulMotionPage mindfulMotionPage = new MindfulMotionPage();
	 private final int delay = 3000;
	
	 @When("User enters body part {string} for exercise")
	    public void user_enters_body_part(String bodyPart) throws InterruptedException {
		 mindfulMotionPage.enterBodyPartName(bodyPart);
	        Thread.sleep(delay);
	    }
	 
	 @And("User clicks submit button")
	    public void user_clicks_submit_button() throws InterruptedException {
		 mindfulMotionPage.clickSubmitButton();
	        Thread.sleep(delay);
	    }

}
