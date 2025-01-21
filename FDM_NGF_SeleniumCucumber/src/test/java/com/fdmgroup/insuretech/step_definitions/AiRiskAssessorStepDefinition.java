package com.fdmgroup.insuretech.step_definitions;

import com.fdmgroup.insuretech.pages.AiRiskAssessorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.data.InsureTech_Datafile.*;
import static org.junit.Assert.assertTrue;

public class AiRiskAssessorStepDefinition {

    private final AiRiskAssessorPage aiRiskAssessorPage = new AiRiskAssessorPage();
    private final int delay = 1000;
    private final float scale = 0.25f;

    @Then("User is on the AI Risk Assessor submodule")
    public void user_is_on_the_ai_risk_assessor_submodule() {
        assertTrue(aiRiskAssessorPage.isOnAiRiskAssessorPage());
    }

    @Given("User clicks on auto insurance for AI risk rating")
    public void user_clicks_on_auto_insurance_for_ai_risk_rating() {
        aiRiskAssessorPage.selectDropdownTitle(INSURANCE_TYPE);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(AUTO_INSURANCE);
        sleep(scale);
    }

    @When("User enters age for AI risk rating {string}")
    public void user_enters_age_for_ai_risk_rating(String age) {
        aiRiskAssessorPage.enterAge(age);
        sleep(scale);
    }

    @When("User selects gender for AI risk rating {string}")
    public void user_selects_gender_for_ai_risk_rating(String gender) {
        aiRiskAssessorPage.selectDropdownTitle(SELECT_GENDER);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(gender);
        sleep(scale);
    }

    @When("User enters zip code for AI risk rating {string}")
    public void user_enters_zip_code_for_ai_risk_rating(String zipCode) {
        aiRiskAssessorPage.enterZipCode(zipCode);
        sleep(scale);
    }

    @When("User selects marital status for AI risk rating {string}")
    public void user_selects_marital_status_for_ai_risk_rating(String maritalStatus) {
        aiRiskAssessorPage.selectDropdownTitle(MARITAL_STATUS);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(maritalStatus);
        sleep(scale);
    }

    @When("User enters vehicle make and model for AI risk rating {string}")
    public void user_enters_vehicle_make_and_model_for_ai_risk_rating(String makeAndModel) {
        aiRiskAssessorPage.enterVehicleMakeAndModel(makeAndModel);
        sleep(scale);
    }

    @When("User enters vehicle year of manufacture for AI risk rating {string}")
    public void user_enters_vehicle_year_of_manufacture_for_ai_risk_rating(String yearOfManufacture) {
        aiRiskAssessorPage.enterVehicleYearOfManufacture(yearOfManufacture);
        sleep(scale);
    }

    @When("User selects vehicle usage for AI risk rating {string}")
    public void user_selects_vehicle_usage_for_ai_risk_rating(String vehicleUsage) {
        aiRiskAssessorPage.selectDropdownTitle(VEHICLE_USAGE);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(vehicleUsage);
        sleep(scale);
    }

    @When("User enters annual mileage for AI risk rating {string}")
    public void user_enters_annual_mileage_for_ai_risk_rating(String annualMileage) {
        aiRiskAssessorPage.enterMileagePerYear(annualMileage);
        sleep(scale);
    }

    @When("User enters years driving for AI risk rating {string}")
    public void user_enters_years_driving_for_ai_risk_rating(String yearsDriving) {
        aiRiskAssessorPage.enterYearsDriving(yearsDriving);
        sleep(scale);
    }

    @When("User enters number of accidents for AI risk rating {string}")
    public void user_enters_number_of_accidents_for_ai_risk_rating(String numberOfAccidents) {
        aiRiskAssessorPage.enterPreviousNumberOfAccidents(numberOfAccidents);
        sleep(scale);
    }

    @When("User clicks get risk rating button for AI risk rating")
    public void user_clicks_get_risk_rating_button_for_ai_risk_rating() {
        aiRiskAssessorPage.clickGetRiskRatingButton();
        sleep(4.0f);
    }

    @Then("User should see the risk rating level response for the AI risk rating {string}")
    public void user_should_see_the_risk_rating_level_response_for_the_ai_risk_rating(String riskRating) {
        sleep(8.0f);
        assertTrue(aiRiskAssessorPage.isRiskResponseValid(riskRating));
        sleep(scale);
    }

    @And("User clicks on health insurance for AI risk rating")
    public void userClicksOnHealthInsuranceForAIRiskRating() {
        aiRiskAssessorPage.selectDropdownTitle(INSURANCE_TYPE);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(HEALTH_INSURANCE);
        sleep(scale);
    }

    @When("User enters height for AI risk rating {string}")
    public void user_enters_height_for_ai_risk_rating(String height) {
        aiRiskAssessorPage.enterHeight(height);
    }
    @When("User selects weight status for AI risk rating {string}")
    public void user_selects_weight_status_for_ai_risk_rating(String weight) {
        aiRiskAssessorPage.enterWeight(weight);
    }
    @When("User enters occupation for AI risk rating {string}")
    public void user_enters_occupation_for_ai_risk_rating(String occupation) {
        aiRiskAssessorPage.enterOccupation(occupation);
    }
    @When("User selects pre existing conditions for AI risk rating {string}")
    public void user_selects_pre_existing_conditions_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(PRE_EXISTING_CONDITIONS);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(PRE_EXISTING_CONDITIONS + ":" + selection);
        sleep(scale);
    }
    @When("User enters text input for pre existing conditions for AI risk rating {string}")
    public void user_enters_text_input_for_pre_existing_conditions_for_ai_risk_rating(String text) {
        aiRiskAssessorPage.enterPreExistingConditions(text);
    }
    @When("User selects family medical history for AI risk rating {string}")
    public void user_selects_family_medical_history_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(FAMILY_MEDICAL_HISTORY);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(FAMILY_MEDICAL_HISTORY +  ":" + selection);
        sleep(scale);
    }
    @When("User enters text input for family medical history for AI risk rating {string}")
    public void user_enters_text_input_for_family_medical_history_for_ai_risk_rating(String text) {
        aiRiskAssessorPage.enterFamilyMedicalHistory(text);
    }
    @When("User selects recent surgeries for AI risk rating {string}")
    public void user_selects_recent_surgeries_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(RECENT_SURGERIES);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(RECENT_SURGERIES + ":" + selection);
        sleep(scale);
    }
    @When("User enters text input for recent surgeries for AI risk rating {string}")
    public void user_enters_text_input_for_recent_surgeries_for_ai_risk_rating(String text) {
        aiRiskAssessorPage.enterRecentSurgeries(text);
    }
    @When("User selects current medications for AI risk rating {string}")
    public void user_selects_current_medications_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(CURRENT_MEDICATIONS);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(CURRENT_MEDICATIONS + ":" + selection);
        sleep(scale);
    }
    @When("User enters text input for current medications for AI risk rating {string}")
    public void user_enters_text_input_for_current_medications_for_ai_risk_rating(String text) {
        aiRiskAssessorPage.enterCurrentMedications(text);
    }
    @When("User selects smoking status for AI risk rating {string}")
    public void user_selects_smoking_status_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(SMOKING_STATUS);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(SMOKING_STATUS + ":" + selection);
        sleep(scale);
    }
    @When("User selects alcohol consumption for AI risk rating {string}")
    public void user_selects_alcohol_consumption_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(ALCOHOL_CONSUMPTION);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(ALCOHOL_CONSUMPTION + ":" + selection);
        sleep(scale);
    }
    @When("User selects exercise habits for AI risk rating {string}")
    public void user_selects_exercise_habits_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(EXERCISE_HABITS);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(EXERCISE_HABITS + ":" + selection);
        sleep(scale);
    }
    @When("User selects dietary habits for AI risk rating {string}")
    public void user_selects_dietary_habits_for_ai_risk_rating(String selection) {
        aiRiskAssessorPage.selectDropdownTitle(DIETARY_HABITS);
        sleep(0.5f);
        aiRiskAssessorPage.selectDropdown(DIETARY_HABITS + ":" + selection);
        sleep(0.5f);
    }

    @When("User clicks on home insurance for AI risk rating")
    public void user_clicks_on_home_insurance_for_ai_risk_rating() {
        aiRiskAssessorPage.selectDropdownTitle(INSURANCE_TYPE);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(HOME_INSURANCE);
        sleep(scale);
    }
    @And("User enters city for AI risk rating {string}")
    public void userEntersCityForAIRiskRatingCity(String city) {
        aiRiskAssessorPage.enterCity(city);
    }
    @When("User selects owning status for AI risk rating {string}")
    public void user_selects_owning_status_for_ai_risk_rating(String owningStatus) {
        aiRiskAssessorPage.selectDropdownTitle(HOME_OWNING_STATUS);
        sleep(scale);
        aiRiskAssessorPage.selectDropdown(owningStatus);
        sleep(scale);
    }

    @When("User enters dwelling amount for AI risk rating {string}")
    public void user_enters_dwelling_amount_for_ai_risk_rating(String dwellingAmount) {
        aiRiskAssessorPage.enterDwellingAmount(dwellingAmount);
    }
    @When("User enters personal property amount for AI risk rating {string}")
    public void user_enters_personal_property_amount_for_ai_risk_rating(String personalPropertyAmount) {
        aiRiskAssessorPage.enterPersonalPropertyAmount(personalPropertyAmount);
    }
    @When("User enters liability for AI risk rating {string}")
    public void user_enters_liability_for_ai_risk_rating(String liability) {
        aiRiskAssessorPage.enterLiability(liability);
    }
    @When("User enters deductible for AI risk rating {string}")
    public void user_enters_deductible_for_ai_risk_rating(String deductibleAmount) {
        aiRiskAssessorPage.enterDeductible(deductibleAmount);
    }
    @When("User enters income for AI risk rating {string}")
    public void user_enters_income_for_ai_risk_rating(String income) {
        aiRiskAssessorPage.enterIncome(income);
    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
