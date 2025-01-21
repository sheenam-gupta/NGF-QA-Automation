package com.fdmgroup.Main_Dashboard.step_definitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.TaskManagerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaskManagerStepDefinition {
	
	private final TaskManagerPage taskManager = new TaskManagerPage();
    private final HomePage homePage = new HomePage();
	
	@Given("User is on the task manager page")
	public void user_is_on_the_task_manager_page() {
		homePage.clickTaskManagerButton();
	}

	@When("User clicks on Add Task")
	public void user_clicks_on_add_task() {
		taskManager.clickAddTaskButton();
	}

	@When("User enters {string} as the title")
	public void user_enters_as_the_title(String taskTitle) {
		taskManager.inputTaskTitle(taskTitle);
	}

	@When("User enters {string} as the description")
	public void user_enters_as_the_description(String taskDescription) {
		taskManager.inputTaskDescription(taskDescription);
	}

	@When("User selects start time as {string}")
	public void user_selects_start_time_as(String startTime) {
		taskManager.inputTaskStartTime(startTime);
	}

	@When("User selects end time as {string}")
	public void user_selects_end_time_as(String endTime) {
		taskManager.inputTaskEndTime(endTime);
	}

	@When("User clicks on Save button")
	public void user_clicks_on_save_button() {
	    taskManager.clickSaveTaskButton();
	}

	@Then("The task should be added to the task list")
	public void the_task_should_be_added_to_the_task_list() {
	    assertTrue(taskManager.isTaskAdded());
	}
	

	@When("User clicks on the Edit button of a task")
	public void user_clicks_on_the_button_for_a_task() {
		taskManager.clickEditTaskButton();
	}

	@Then("The task should be updated with {string}, {string}, {string} in the task list")
	public void the_task_should_be_updated_with_in_the_task_list(String taskTitle, String startDate, String endDate) {
		String taskDetails = taskManager.getCalenderTaskView();
		
		assertTrue(taskDetails.contains(startDate));
	    assertTrue(taskDetails.contains(endDate));
	    assertTrue(taskDetails.contains(taskTitle));
	}
	
	@When("User clicks on the Delete button for a task")
	public void user_clicks_on_the_delete_button_for_a_task() {
		taskManager.clickDeleteTaskButton();
	}

	@Then("The task should be removed from the task list")
	public void the_task_should_be_removed_from_the_task_list() {
		assertFalse(taskManager.isTaskPresent());
	}
	
	@Then("A red line should indicate the current time")
	public void a_red_line_should_indicate_the_current_time() {
		
		assertTrue(taskManager.getCurrentTimeMarker().isDisplayed());
		
		String topPositionString = taskManager.getCurrentTimeMarker().getCssValue("top");
        int actualTopPosition = Integer.parseInt(topPositionString.replace("px", ""));

        int expectedTopPosition = taskManager.getCurrentTopPosition();

        int tolerance = 5;

        assertTrue(Math.abs(actualTopPosition - expectedTopPosition) <= tolerance);
	}
	
	@Then("Calendar should be displayed in the hourly view")
	public void calendar_should_be_displayed_in_the_hourly_view() {		
		assertTrue(taskManager.isHourlyViewVisible());
	}
	
	@When("User clicks on the calendar dropdown")
	public void user_clicks_on_the_calendar_dropdown() {
		taskManager.clickDatePickerButton();
	}

	@When("User selects year {string} and month {string}")
	public void user_selects_year_and_month(String year, String month) {
		taskManager.changeMonthAndYear(month, year);
	}

	@When("User selects {string} date")
	public void user_selects_date(String date) {
		taskManager.changeDate(date);
	}

	@Then("Calendar should be displayed for {string}")
	public void calendar_should_be_displayed_for(String date) {
		assertTrue(taskManager.isCalendarViewShowsDate(date));
	}

}
