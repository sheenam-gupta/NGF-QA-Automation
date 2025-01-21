package com.fdmgroup.insuretech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;
import static com.fdmgroup.data.InsureTech_Datafile.*;

public class AiRiskAssessorPage extends BrowserUtilities {

    @FindBy(xpath = "//h1[@class='display-6']")
    private WebElement AiRiskAssessorTitle;

    @FindBy(xpath = "//select[@id='insuranceType']")
    private WebElement insuranceType;

    @FindBy(xpath = "//option[contains(text(),'Select an option')]")
    private WebElement selectAnOption;

    @FindBy(xpath = "//option[contains(text(),'Health Insurance')]")
    private WebElement healthInsuranceOption;

    @FindBy(xpath = "//option[contains(text(), 'Auto Insurance')]")
    private WebElement autoInsuranceOption;

    @FindBy(xpath = "//option[contains(text(), 'Home Insurance')]")
    private WebElement homeInsuranceOption;

    @FindBy(xpath = "//input[@id='age']")
    private WebElement age;

    @FindBy(xpath = "//div[contains(text(), 'valid age')]")
    private WebElement invalidAgeFeedback;

    @FindBy(xpath = "//select[@id='gender']")
    private WebElement gender;

    @FindBy(xpath = "//option[contains(text(), 'Select Gender')]")
    private WebElement selectGender;

    @FindBy(xpath = "//option[@value='male']")
    private WebElement maleOption;

    @FindBy(xpath = "//option[@value='female']")
    private WebElement femaleOption;

    @FindBy(xpath = "//option[@value='other']")
    private WebElement otherOption;

    @FindBy(xpath = "//option[@value='renting']")
    private WebElement rentingOption;

    @FindBy(xpath = "//option[@value='owning']")
    private WebElement owningOption;

    @FindBy(xpath = "//option[@value='prefer_not_to_say']")
    private WebElement preferNotToSayOption;

    @FindBy(xpath = "//input[@id='height']")
    private WebElement height;

    @FindBy(xpath = "//div[contains(text(), 'valid height')]")
    private WebElement invalidHeightFeedback;

    @FindBy(xpath = "//input[@id='weight']")
    private WebElement weight;

    @FindBy(xpath = "//div[contains(text(), 'valid weight')]")
    private WebElement invalidWeightFeedback;

    @FindBy(xpath = "//input[@id='occupation']")
    private WebElement occupation;

    @FindBy(xpath = "//div[contains(text(), 'valid occupation')]")
    private WebElement invalidOccupationFeedback;

    @FindBy(xpath = "//select[@id='preExistingConditionsSelect']")
    private WebElement preExistingConditionsSelect;
        @FindBy(xpath = "//select[@id='preExistingConditionsSelect']//option[@value='yes']")
        private WebElement preExistingConditionsDropdownYes;
        @FindBy(xpath = "//select[@id='preExistingConditionsSelect']//option[@value='no']")
        private WebElement preExistingConditionsDropdownNo;

    @FindBy(xpath = "//select[@id='familyMedicalHistorySelect']")
    private WebElement familyMedicalHistorySelect;
        @FindBy(xpath = "//select[@id='familyMedicalHistorySelect']//option[@value='yes']")
        private WebElement familyMedicalHistoryDropdownYes;
        @FindBy(xpath = "//select[@id='familyMedicalHistorySelect']//option[@value='no']")
        private WebElement familyMedicalHistoryDropdownNo;


    @FindBy(xpath = "//select[@id='recentSurgeriesSelect']")
    private WebElement recentSurgeriesSelect;
        @FindBy(xpath = "//select[@id='recentSurgeriesSelect']//option[@value='yes']")
        private WebElement recentSurgeriesDropdownYes;
        @FindBy(xpath = "//select[@id='recentSurgeriesSelect']//option[@value='no']")
        private WebElement recentSurgeriesDropdownNo;

    @FindBy(xpath = "//select[@id='currentMedicationsSelect']")
    private WebElement currentMedicationsSelect;
        @FindBy(xpath = "//select[@id='currentMedicationsSelect']//option[@value='yes']")
        private WebElement currentMedicationsDropdownYes;
        @FindBy(xpath = "//select[@id='currentMedicationsSelect']//option[@value='no']")
        private WebElement currentMedicationsDropdownNo;

    @FindBy(xpath = "//option[contains(text(), 'Select')]")
    private WebElement selectOption;

    @FindBy(xpath = "//select[@id='smokingStatus']")
    private WebElement smokingStatus;
        @FindBy(xpath = "//select[@id='smokingStatus']//option[@value='never']")
        private WebElement smokingStatusOptionNever;
        @FindBy(xpath = "//select[@id='smokingStatus']//option[@value='former']")
        private WebElement smokingStatusOptionFormer;
        @FindBy(xpath = "//select[@id='smokingStatus']//option[@value='light']")
        private WebElement smokingStatusOptionLight;
        @FindBy(xpath = "//select[@id='smokingStatus']//option[@value='heavy']")
        private WebElement smokingStatusOptionHeavy;

    @FindBy(xpath = "//select[@id='alcoholConsumption']")
    private WebElement alcoholConsumption;
        @FindBy(xpath = "//select[@id='alcoholConsumption']//option[@value='none']")
        private WebElement alcoholConsumptionOptionNone;
        @FindBy(xpath = "//select[@id='alcoholConsumption']//option[@value='light']")
        private WebElement alcoholConsumptionOptionLight;
        @FindBy(xpath = "//select[@id='alcoholConsumption']//option[@value='moderate']")
        private WebElement alcoholConsumptionOptionModerate;
        @FindBy(xpath = "//select[@id='alcoholConsumption']//option[@value='heavy']")
        private WebElement alcoholConsumptionOptionHeavy;



    @FindBy(xpath = "//select[@id='exerciseHabits']")
    private WebElement exerciseHabits;
        @FindBy(xpath = "//select[@id='exerciseHabits']//option[@value='sedentary']")
        private WebElement exerciseHabitsOptionSedentary;
        @FindBy(xpath = "//select[@id='exerciseHabits']//option[@value='light']")
        private WebElement exerciseHabitsOptionLight;
        @FindBy(xpath = "//select[@id='exerciseHabits']//option[@value='moderate']")
        private WebElement exerciseHabitsOptionModerate;
        @FindBy(xpath = "//select[@id='exerciseHabits']//option[@value='active']")
        private WebElement exerciseHabitsOptionActive;


    @FindBy(xpath = "//select[@id='dietaryHabits']")
    private WebElement dietaryHabits;
        @FindBy(xpath = "//select[@id='dietaryHabits']//option[@value='unhealthy']")
        private WebElement dietaryHabitsOptionUnhealthy;
        @FindBy(xpath = "//select[@id='dietaryHabits']//option[@value='average']")
        private WebElement dietaryHabitsOptionAverage;
        @FindBy(xpath = "//select[@id='dietaryHabits']//option[@value='healthy']")
        private WebElement dietaryHabitsOptionHealthy;
        @FindBy(xpath = "//select[@id='dietaryHabits']//option[@value='very_healthy']")
        private WebElement dietaryHabitsOptionVeryHealthy;


    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='col-lg-6 mt-5']//div[@class='mt-3']//p[3]")
    private WebElement riskAssessmentResponse; // Low, Medium-Low, Medium, Medium-High, High

    // Text Areas
    @FindBy(xpath = "//textarea[@id='preExistingConditions']")
    private WebElement preExistingConditions;

    @FindBy(xpath = "//textarea[@id='familyMedicalHistory']")
    private WebElement familyMedicalHistory;

    @FindBy(xpath = "//textarea[@id='recentSurgeries']")
    private WebElement recentSurgeries;

    @FindBy(xpath = "//textarea[@id='currentMedications']")
    private WebElement currentMedications;
    
    @FindBy(xpath = "//table[@class='SampleTable']//tbody//tr[3]")
    private WebElement myTestElement;

    // forms exclusively for auto insurance
    @FindBy(xpath = "//input[@id='zipCode']")
    private WebElement zipCode;

    @FindBy(xpath = "//select[@id='maritalStatus']")
    private WebElement maritalStatus;

    @FindBy(xpath = "//option[@value='single']")
    private WebElement singleOption;

    @FindBy(xpath = "//option[@value='married']")
    private WebElement marriedOption;

    @FindBy(xpath = "//option[@value='divorced']")
    private WebElement divorcedOption;

    @FindBy(xpath = "//option[@value='widowed']")
    private WebElement widowedOption;

    @FindBy(xpath = "//input[@id='vehicleMakeModel']")
    private WebElement vehicleMakeAndModel;

    @FindBy(xpath = "//input[@id='vehicleYear']")
    private WebElement vehicleYear;

    @FindBy(xpath = "//select[@id='vehicleUsage']")
    private WebElement vehicleUsage;

    @FindBy(xpath = "//option[@value='personal']")
    private WebElement personalOption;

    @FindBy(xpath = "//option[@value='commute']")
    private WebElement commuteOption;

    @FindBy(xpath = "//option[@value='business']")
    private WebElement businessOption;

    @FindBy(xpath = "//input[@id='mileagePerYear']")
    private WebElement mileagePerYear;

    @FindBy(xpath = "//input[@id='yearsDriving']")
    private WebElement yearsDriving;

    @FindBy(xpath = "//input[@id='previousAccidents']")
    private WebElement previousAccidents;

    @FindBy(xpath = "//input[@id = 'location']")
    private WebElement city;

    @FindBy(xpath = "//select[@id='rentingOwningStatus']")
    private WebElement homeOwningStatus;

    @FindBy(xpath = "//input[@id='dwellingAmount']")
    private WebElement dwellingAmountField;

    @FindBy(xpath = "//input[@id='personalPropertyAmount']")
    private WebElement personalPropertyAmountField;

    @FindBy(xpath = "//input[@id='liability']")
    private WebElement liabilityField;

    @FindBy(xpath = "//input[@id='deductible']")
    private WebElement deductibleField;

    @FindBy(xpath = "//input[@id='income']")
    private WebElement incomeField;
    
    private Actions action;
    private WebDriverWait wait;

    public AiRiskAssessorPage() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public boolean isOnAiRiskAssessorPage() {
        return AiRiskAssessorTitle.getText().contains(AI_RISK_ASSESSOR);
    }

    public void enterAge(String age) {
        action.moveToElement(this.age).click().sendKeys(age).perform();
    }

    public void selectDropdown(String dropdownItem) {
        switch(dropdownItem) {
            case SELECT -> selectOption();
            case HEALTH_INSURANCE -> selectHealthInsurance();
            case AUTO_INSURANCE -> selectAutoInsurance();
            case HOME_INSURANCE -> selectHomeInsurance();
            case SELECT_AN_OPTION -> selectAnOptionDropdown();
            case MALE -> selectMale();
            case FEMALE -> selectFemale();
            case OTHER -> selectOther();
            case RENTING -> selectRenting();
            case OWNING -> selectOwning();
            case PREFER_NOT_TO_SAY -> selectPreferNotToSay();
            case SMOKING_STATUS + ":" + NEVER -> selectSmokingStatusNever();
            case SMOKING_STATUS + ":" + FORMER -> selectSmokingStatusFormer();
            case SMOKING_STATUS + ":" + LIGHT -> selectSmokingStatusLight();
            case SMOKING_STATUS + ":" + HEAVY -> selectSmokingStatusHeavy();
            case ALCOHOL_CONSUMPTION + ":" + NONE -> selectAlcoholConsumptionNone();
            case ALCOHOL_CONSUMPTION + ":" + LIGHT -> selectAlcoholConsumptionLight();
            case ALCOHOL_CONSUMPTION + ":" + MODERATE -> selectAlcoholConsumptionModerate();
            case ALCOHOL_CONSUMPTION + ":" + HEAVY -> selectAlcoholConsumptionHeavy();
            case EXERCISE_HABITS + ":" + SEDENTARY -> selectExerciseHabitsSedentary();
            case EXERCISE_HABITS + ":" + LIGHT -> selectExerciseHabitsLight();
            case EXERCISE_HABITS + ":" + MODERATE -> selectExerciseHabitsModerate();
            case EXERCISE_HABITS + ":" + VERY_ACTIVE -> selectExerciseHabitsActive();
            case DIETARY_HABITS + ":" + UNHEALTHY -> selectDietaryHabitsUnhealthy();
            case DIETARY_HABITS + ":" + AVERAGE -> selectDietaryHabitsAverage();
            case DIETARY_HABITS + ":" + HEALTHY -> selectDietaryHabitsHealthy();
            case DIETARY_HABITS + ":" + VERY_HEALTHY -> selectDietaryHabitsVeryHealthy();
            case SINGLE -> selectSingle();
            case MARRIED -> selectMarried();
            case DIVORCED -> selectDivorced();
            case WIDOWED -> selectWidowed();
            case PERSONAL -> selectPersonal();
            case COMMUTE -> selectCommute();
            case BUSINESS -> selectBusiness();
            case PRE_EXISTING_CONDITIONS + ":" + YES -> selectPreExistingConditionsDropdownYes();
            case PRE_EXISTING_CONDITIONS + ":" + NO -> selectPreExistingConditionsDropdownNo();
            case FAMILY_MEDICAL_HISTORY + ":" + YES -> selectFamilyMedicalHistoryDropdownYes();
            case FAMILY_MEDICAL_HISTORY + ":" + NO -> selectFamilyMedicalHistoryDropdownNo();
            case RECENT_SURGERIES + ":" + YES -> selectRecentSurgeriesDropdownYes();
            case RECENT_SURGERIES + ":" + NO -> selectRecentSurgeriesDropdownNo();
            case CURRENT_MEDICATIONS + ":" + YES -> selectCurrentMedicationsDropdownYes();
            case CURRENT_MEDICATIONS + ":" + NO -> selectCurrentMedicationsDropdownNo();
        }
    }

    public void selectDropdownTitle(String title) {
        switch(title) {
            case INSURANCE_TYPE -> clickInsuranceType();
            case SELECT_GENDER -> clickGender();
            case PRE_EXISTING_CONDITIONS -> clickPreExistingConditions();
            case FAMILY_MEDICAL_HISTORY -> clickFamilyMedicalHistory();
            case RECENT_SURGERIES -> clickRecentSurgeries();
            case CURRENT_MEDICATIONS -> clickCurrentMedications();
            case SMOKING_STATUS -> clickSmokingStatus();
            case ALCOHOL_CONSUMPTION -> clickAlcoholConsumption();
            case EXERCISE_HABITS -> clickExerciseHabits();
            case DIETARY_HABITS -> clickDietaryHabits();
            case MARITAL_STATUS -> clickMaritalStatus();
            case HOME_OWNING_STATUS -> clickHomeOwningStatus();
            case VEHICLE_USAGE -> clickVehicleUsage();
        }
    }

    public void enterHeight(String height) {
        action.moveToElement(this.height).click().sendKeys(height).perform();
    }

    public void enterWeight(String weight) {
        action.moveToElement(this.weight).click().sendKeys(weight).perform();
    }

    public void enterOccupation(String occupation) {
        action.moveToElement(this.occupation).click().sendKeys(occupation).perform();
    }

    public void enterPreExistingConditions(String preExistingConditions) {
        action.moveToElement(this.preExistingConditions).click().sendKeys(preExistingConditions).perform();
    }

    public void enterFamilyMedicalHistory(String familyMedicalHistory) {
        action.moveToElement(this.familyMedicalHistory).click().sendKeys(familyMedicalHistory).perform();
    }

    public void enterRecentSurgeries(String recentSurgeries) {
        action.moveToElement(this.recentSurgeries).click().sendKeys(recentSurgeries).perform();
    }

    public void enterCurrentMedications(String currentMedications) {
        action.moveToElement(this.currentMedications).click().sendKeys(currentMedications).perform();
    }

    public void enterZipCode(String zipCode) {
        action.moveToElement(this.zipCode).click().sendKeys(zipCode).perform();
    }

    public void enterVehicleMakeAndModel(String vehicleMakeAndModel) {
        action.moveToElement(this.vehicleMakeAndModel).click().sendKeys(vehicleMakeAndModel).perform();
    }

    public void enterVehicleYearOfManufacture(String vehicleYear) {
        action.moveToElement(this.vehicleYear).click().sendKeys(vehicleYear).perform();
    }

    public void enterMileagePerYear(String mileagePerYear) {
        action.moveToElement(this.mileagePerYear).click().sendKeys(mileagePerYear).perform();
    }

    public void enterYearsDriving(String yearsDriving) {
        action.moveToElement(this.yearsDriving).click().sendKeys(yearsDriving).perform();
    }

    public void enterPreviousNumberOfAccidents(String previousAccidents) {
        action.moveToElement(this.previousAccidents).click().sendKeys(previousAccidents).perform();
    }

    public void enterCity(String city) {
        action.moveToElement(this.city).click().sendKeys(city).perform();
    }

    public void enterIncome(String income) { action.moveToElement(incomeField).click().sendKeys(income).perform();   }

    public void enterDeductible(String deductible) { action.moveToElement(deductibleField).click().sendKeys(deductible).perform();   }

    public void enterLiability(String liability) { action.moveToElement(liabilityField).click().sendKeys(liability).perform();   }

    public void enterPersonalPropertyAmount(String personalProperty) { action.moveToElement(personalPropertyAmountField).click().sendKeys(personalProperty).perform();}

    public void enterDwellingAmount(String dwelling) { action.moveToElement(dwellingAmountField).click().sendKeys(dwelling).perform();   }

    public boolean isInvalidAgeFeedbackPresent() {
        return invalidAgeFeedback.isDisplayed();
    }

    public boolean isInvalidHeightFeedbackPresent() {
        return invalidHeightFeedback.isDisplayed();
    }

    public boolean isInvalidWeightFeedbackPresent() {
        return invalidWeightFeedback.isDisplayed();
    }

    public boolean isInvalidOccupationFeedbackPresent() {
        return invalidOccupationFeedback.isDisplayed();
    }

    // Dropdown titles
    public void clickInsuranceType() {
        action.moveToElement(insuranceType).click().perform();
    }

    public void clickGender() {
        gender.click();
    }

    public void clickPreExistingConditions() {
        preExistingConditionsSelect.click();
    }

    public void clickFamilyMedicalHistory() {
        familyMedicalHistorySelect.click();
    }

    public void clickRecentSurgeries() {
        recentSurgeriesSelect.click();
    }

    public void clickCurrentMedications() {
        currentMedicationsSelect.click();
    }

    public void clickSmokingStatus() {
        smokingStatus.click();
    }

    public void clickAlcoholConsumption() {
        alcoholConsumption.click();
    }

    public void clickExerciseHabits() {
        action.moveToElement(exerciseHabits).click().perform();
    }

    public void clickDietaryHabits() {
        action.moveToElement(dietaryHabits).click().perform();
    }

    public void clickMaritalStatus() {
        action.moveToElement(maritalStatus).click().perform();
    }

    public void clickHomeOwningStatus() { action.moveToElement(homeOwningStatus).click().perform();
    }
    public void clickVehicleUsage() {
        action.moveToElement(vehicleUsage).click().perform();
    }

    private void selectSmokingStatusNever() {
        smokingStatusOptionNever.click();
    }

    private void selectSmokingStatusFormer() {
        smokingStatusOptionFormer.click();
    }

    private void selectSmokingStatusLight() {
        smokingStatusOptionLight.click();
    }

    private void selectSmokingStatusHeavy() {
        smokingStatusOptionHeavy.click();
    }

    private void selectAlcoholConsumptionNone() {
        alcoholConsumptionOptionNone.click();
    }

    private void selectAlcoholConsumptionLight() {
        alcoholConsumptionOptionLight.click();
    }

    private void selectAlcoholConsumptionModerate() {
        alcoholConsumptionOptionModerate.click();
    }

    private void selectAlcoholConsumptionHeavy() {
        alcoholConsumptionOptionHeavy.click();
    }

    private void selectExerciseHabitsSedentary() {
        exerciseHabitsOptionSedentary.click();
    }

    private void selectExerciseHabitsLight() {
        exerciseHabitsOptionLight.click();
    }

    private void selectExerciseHabitsModerate() {
        exerciseHabitsOptionModerate.click();
    }

    private void selectExerciseHabitsActive() {
        exerciseHabitsOptionActive.click();
    }

    private void selectDietaryHabitsUnhealthy() {
        dietaryHabitsOptionUnhealthy.click();
    }

    private void selectDietaryHabitsAverage() {
        dietaryHabitsOptionAverage.click();
    }

    private void selectDietaryHabitsHealthy() {
        dietaryHabitsOptionHealthy.click();
    }

    private void selectDietaryHabitsVeryHealthy() {
        dietaryHabitsOptionVeryHealthy.click();
    }

    // Dropdown items
    public void selectAnOptionDropdown() {
        selectAnOption.click();
    }

    private void selectPreExistingConditionsDropdownNo() {
        preExistingConditionsDropdownNo.click();
    }

    private void selectPreExistingConditionsDropdownYes() {
        preExistingConditionsDropdownYes.click();
    }

    private void selectCurrentMedicationsDropdownNo() {
        currentMedicationsDropdownNo.click();
    }

    private void selectCurrentMedicationsDropdownYes() {
        currentMedicationsDropdownYes.click();
    }

    private void selectRecentSurgeriesDropdownNo() {
        recentSurgeriesDropdownNo.click();
    }

    private void selectRecentSurgeriesDropdownYes() {
        recentSurgeriesDropdownYes.click();
    }

    private void selectFamilyMedicalHistoryDropdownNo() {
        familyMedicalHistoryDropdownNo.click();
    }

    private void selectFamilyMedicalHistoryDropdownYes() {
        familyMedicalHistoryDropdownYes.click();
    }

    public void selectHealthInsurance() {
        healthInsuranceOption.click();
    }

    public void selectAutoInsurance() {
        autoInsuranceOption.click();
    }

    public void selectHomeInsurance() {
        homeInsuranceOption.click();
    }

    public void selectGender() {
        selectGender.click();
    }

    public void selectMale() {
        maleOption.click();
    }

    public void selectFemale() {
        femaleOption.click();
    }

    public void selectOther() {
        otherOption.click();
    }

    public void selectRenting() {
        rentingOption.click();
    }

    public void selectOwning() {
        owningOption.click();
    }

    public void selectPreferNotToSay() {
        preferNotToSayOption.click();
    }

    public void selectSingle() {
        singleOption.click();
    }

    public void selectMarried() {
        marriedOption.click();
    }

    public void selectDivorced() {
        divorcedOption.click();
    }

    public void selectWidowed() {
        widowedOption.click();
    }

    public void selectPersonal() {
        personalOption.click();
    }

    public void selectCommute() {
        commuteOption.click();
    }

    public void selectBusiness() {
        businessOption.click();
    }

    private void selectOption() {
        selectOption.click();
    }

    public void clickGetRiskRatingButton() {
        action.moveToElement(submitButton).click().perform();
    }

    public boolean isRiskResponseValid(String rating) {
        // Low, Medium-Low, Medium, Medium-High, High
        String[] text = riskAssessmentResponse.getText().split("\\s+");
        String responseRating = text[0];
        return responseRating.equals(rating);
    }

}
