package com.fdmgroup.isense.step_definitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.isense.pages.CodeAssistantPage;
import com.fdmgroup.isense.pages.IntelliSensePage;
import com.fdmgroup.isense.pages.TranspilerCodeConvertPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TranspilerCodeConvertStepDefinition extends BrowserUtilities {
	private final HomePage homePage = new HomePage();
    private final IntelliSensePage intelliSensePage = new IntelliSensePage();
    private final CodeAssistantPage codeAssistantPage = new CodeAssistantPage();
    private final TranspilerCodeConvertPage transpilerCodeConvertPage = new TranspilerCodeConvertPage();

@When("User explores Intellisense and then lanches code assistant")
public void user_explores_intellisense_and_then_lanches_code_assistant() {
    homePage.clickExploreIntellisenseButton();
    intelliSensePage.clickExploreCodeAssistantButton();
    intelliSensePage.clickLaunchButton();
}
@When("User chooses the option to convert your code to any programming language {string}")
public void user_chooses_the_option_to_convert_your_code_to_any_programming_language(String option) {
	transpilerCodeConvertPage.clickPromptOption();
	transpilerCodeConvertPage.chooseOption(option);
}

@When("User Selects the programming language {string}")
public void user_selects_the_programming_language(String language) {
	transpilerCodeConvertPage.inputLanguageToConvertInto(language);
}

@When("User paste the code in the field to get converted {string}")
public void user_paste_the_code_in_the_field_to_get_converted(String data) {
	transpilerCodeConvertPage.enterCodeToConvert(data);
}

@Then("Clicks on the receive feedback")
public void clicks_on_the_receive_feedback() {
	transpilerCodeConvertPage.clickReceiveFeedback();
	transpilerCodeConvertPage.getConvertedCode();
	assertEquals(transpilerCodeConvertPage.getConvertedCode(),true);
}

}
