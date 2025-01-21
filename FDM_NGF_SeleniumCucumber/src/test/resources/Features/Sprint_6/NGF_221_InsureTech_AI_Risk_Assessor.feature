# Author: Umaid Malik
@Sprint6
 Feature: User tries features in the InsureTech AI Risk Assessor submodule
   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

     Scenario: User navigates to the AI Risk Assessor submodule
       Given User should be logged in and see the homepage
       When User clicks explore InsureTech button
       And User clicks explores AI Risk Assessor button
       Then User is on the AI Risk Assessor submodule

     Scenario Outline: User requests risk rating on the AI Risk Assessor for health insurance
       Given User should be logged in and see the homepage
       And User clicks explore InsureTech button
       And User clicks explores AI Risk Assessor button
       And User clicks on health insurance for AI risk rating
       When User enters age for AI risk rating '<age>'
       And User selects gender for AI risk rating '<gender>'
       And User enters height for AI risk rating '<height>'
       And User selects weight status for AI risk rating '<weight>'
       And User enters occupation for AI risk rating '<occupation>'
       And User selects pre existing conditions for AI risk rating '<pre_existing_conditions>'
       And User selects family medical history for AI risk rating '<family_medical_history>'
       And User selects recent surgeries for AI risk rating '<recent_surgeries>'
       And User selects current medications for AI risk rating '<current_medications>'
       And User selects smoking status for AI risk rating '<smoking_status>'
       And User selects alcohol consumption for AI risk rating '<alcohol_consumption>'
       And User selects exercise habits for AI risk rating '<exercise_habits>'
       And User selects dietary habits for AI risk rating '<dietary_habits>'
       And User clicks get risk rating button for AI risk rating
       Then User should see the risk rating level response for the AI risk rating '<tier>'
       Examples:
         | gender | age | height | weight | occupation        | pre_existing_conditions | family_medical_history | recent_surgeries | current_medications | smoking_status | alcohol_consumption | exercise_habits | dietary_habits | tier        |
         | Male   | 20  | 180    | 70     | Engineer          | No                      | No                     | No               | No                  | Never          | None                | Very Active     | Healthy        | Low         |
         | Female | 36  | 162    | 52     | Software Engineer | No                      | No                     | No               | No                  | Light          | Moderate            | Sedentary       | Unhealthy      | Medium-High |

   Scenario Outline: User requests risk rating on the AI Risk Assessor for auto insurance
       Given User should be logged in and see the homepage
       And User clicks explore InsureTech button
       And User clicks explores AI Risk Assessor button
       And User clicks on auto insurance for AI risk rating
       When User enters age for AI risk rating '<age>'
       And User selects gender for AI risk rating '<gender>'
       And User enters zip code for AI risk rating '<zip_code>'
       And User selects marital status for AI risk rating '<marital_status>'
       And User enters vehicle make and model for AI risk rating '<vehicle_make_model>'
       And User enters vehicle year of manufacture for AI risk rating '<vehicle_year>'
       And User selects vehicle usage for AI risk rating '<vehicle_usage>'
       And User enters annual mileage for AI risk rating '<annual_mileage>'
       And User enters years driving for AI risk rating '<years_driving>'
       And User enters number of accidents for AI risk rating '<accidents>'
       And User clicks get risk rating button for AI risk rating
       Then User should see the risk rating level response for the AI risk rating '<tier>'
       Examples:
         | gender | age | zip_code | marital_status | vehicle_make_model | vehicle_year | vehicle_usage | annual_mileage | years_driving | accidents | tier        |
         | Male   | 20  | 12345    | Single         | Toyota Corolla     | 2015         | Personal      | 10000          | 5             | 0         | Medium      |
         | Female | 36  | 54321    | Married        | Tesla Model 3      | 2024         | Business      | 15000          | 10            | 1         | Medium-High |

   Scenario Outline: User requests risk rating on the AI Risk Assessor for health insurance with options as Yes and text input for each box
     Given User should be logged in and see the homepage
     And User clicks explore InsureTech button
     And User clicks explores AI Risk Assessor button
     And User clicks on health insurance for AI risk rating
     When User enters age for AI risk rating '<age>'
     And User selects gender for AI risk rating '<gender>'
     And User enters height for AI risk rating '<height>'
     And User selects weight status for AI risk rating '<weight>'
     And User enters occupation for AI risk rating '<occupation>'
     And User selects pre existing conditions for AI risk rating '<pre_existing_conditions>'
        And User enters text input for pre existing conditions for AI risk rating '<pre_existing_conditions_text>'
     And User selects family medical history for AI risk rating '<family_medical_history>'
        And User enters text input for family medical history for AI risk rating '<family_medical_history_text>'
     And User selects recent surgeries for AI risk rating '<recent_surgeries>'
        And User enters text input for recent surgeries for AI risk rating '<recent_surgeries_text>'
     And User selects current medications for AI risk rating '<current_medications>'
        And User enters text input for current medications for AI risk rating '<current_medications_text>'
     And User selects smoking status for AI risk rating '<smoking_status>'
     And User selects alcohol consumption for AI risk rating '<alcohol_consumption>'
     And User selects exercise habits for AI risk rating '<exercise_habits>'
     And User selects dietary habits for AI risk rating '<dietary_habits>'
     And User clicks get risk rating button for AI risk rating
     Then User should see the risk rating level response for the AI risk rating '<tier>'
     Examples:
       | gender | age | height | weight | occupation        | pre_existing_conditions | pre_existing_conditions_text | family_medical_history | family_medical_history_text | recent_surgeries | recent_surgeries_text | current_medications | current_medications_text | smoking_status | alcohol_consumption | exercise_habits | dietary_habits | tier        |
       | Male   | 20  | 180    | 70     | Engineer          | Yes                     | epilepsy                     | Yes                    | Type I Diabetes             | Yes              | Gallbladder removal   | Yes                 | Ibuprofen                | Never          | None                | Very Active     | Healthy        | Medium-Low  |
       | Female | 36  | 162    | 52     | Software Engineer | Yes                     | diabetes                     | Yes                    | Heart Disease               | Yes              | Gastric Bypass        | Yes                 | Azithromycin             | Light          | None                | Sedentary       | Unhealthy      | Medium-High |