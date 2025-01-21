package com.fdmgroup.data;

import com.fdmgroup.data.Login.Login_data;

public class PageURLs {
    protected static final String username = Login_data.UserName;
    
    public final static String HomePage = "http://localhost:4200/";
    
    public final static String OnboardingNavigator = "http://localhost:4209/";
    
    public final static String LoginPage = "http://localhost:4200/login";
    
    public final static String GlossaryPage = "http://localhost:4209/assets/html/glossary.html";
    
    public final static String AboutPage = "http://localhost:4200/about";
    
    public final static String CommunitySpacePage = "http://localhost:4200/community-space";

    public final static String RegisterPage = "http://localhost:4200/register";

    public final static String FinancialAdvisor = "http://localhost:4201/?username="+username;

    public final static String BudgetCalculatorWelcomePage = "http://localhost:4203/?username="+username;

    public final static String BudgetCalculatorForm = "http://localhost:4203/form";

    public final static String MortgageAdvisor = "http://localhost:4210/?username="+username;

    public final static String MockExam = "http://localhost:4204/?username="+username;

    public final static String InterviewGuidanceDashboard = "http://localhost:4202/?username="+username;
    
    public final static String InterviewTips = "http://localhost:4202/interview-tips";
    
    public final static String NetworkingTips = "http://localhost:4202/networking-tips";

    public final static String MockInterviewDashboard = "http://localhost:4206/?username="+username;
    
    public final static String MockInterview = "http://localhost:4206/mock-interview";
    
    public final static String ScheduleInterview = "http://localhost:4206/schedule-interview";

    public final static String CodeAssistant = "http://localhost:4208/?username="+username;

    public final static String AIRiskAssesor = "http://localhost:4207/?username="+username;

    public static String VirtualNetworkingEvents= "https://engage.cloud.microsoft/main/feed";







}