package com.fdmgroup.iprep.pages;


import static com.fdmgroup.data.IPrep_Datafile.*;

public class NetworkingTipsPage extends Interview {

    public NetworkingTipsPage() {
        super();
    }


    @Override
    public void clickOnDropdown(String dropdown) {
        switch (dropdown) {
            case SUBJECT -> clickSubjectDropdown();
            case ROLE -> clickRoleDropdown();
        }
    }

    @Override
    public void clickOnDropDownItem(String item) {
        switch (item) {
            case DEVELOPMENT -> clickDevelopmentButton();
            case FRONTEND -> clickFrontendButton();
            case BACKEND -> clickBackendButton();
            case FULL_STACK -> clickFullStackButton();
            case RPA -> clickRpaButton();
            case QUALITY_ASSURANCE -> clickQualityAssuranceButton();
            case MANUAL_TESTING -> clickManualTestingButton();
            case QA_ANALYST -> clickQaAnalystButton();
            case QA_ENGINEER -> clickQaEngineerButton();
            case SDET -> clickSdetButton();
            case DATA_ENGINEERING -> clickDataEngineeringButton();
            case DATA_ANALYST -> clickDataAnalystButton();
            case DATA_ENGINEER -> clickDataEngineerButton();
            case AI_ENGINEER -> clickAiEngineerButton();
            case ML_ENGINEER -> clickMlEngineerButton();
            case BA_PM -> clickBusinessAnalystButton();
            case PRODUCT_OWNER -> clickProductOwnerButton();
            case SCRUM_MASTER -> clickScrumMasterButton();
            case BUSINESS_ANALYST -> clickBusiness_AnalystButton();
            case SYSTEMS_ANALYST -> clickSystemsAnalystButton();
            case DEV_OPS -> clickDevOpsButton();
            case DEVOPS_ENGINEER -> clickDevopsEngineerButton();
            case CLOUD_ENGINEER -> clickCloudEngineerButton();
            case RELEASE_ENGINEER -> clickReleaseEngineerButton();
            case DEVOPS_ARCHITECT -> clickDevopsArchitectButton();
            case TECH_OPS -> clickTechOpsButton();
            case SYSTEMS_ADMIN -> clickSystemsAdminButton();
            case DATABASE_ADMIN -> clickDatabaseAdminButton();
            case NETWORK_ADMIN -> clickNetworkAdminButton();
            case IT_OPERATIONS_ANALYST -> clickItOperationsAnalystButton();
        }
    }

}
