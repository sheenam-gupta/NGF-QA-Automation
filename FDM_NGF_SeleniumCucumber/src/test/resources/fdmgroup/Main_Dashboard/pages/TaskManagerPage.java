package com.fdmgroup.Main_Dashboard.pages;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.Utilities.BrowserUtilities;

public class TaskManagerPage extends BrowserUtilities {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	static Actions action = new Actions(driver);

	@FindBy(xpath = "//button[@class='addTaskBtn' and contains(@style, '--addBtnColor: #C5FF00;')]")
	private WebElement addTaskButton;

	@FindBy(xpath = "//input[@type='text' and @placeholder='Task Title' and @name='taskTitle']")
	private WebElement inputTaskTitle;

	@FindBy(xpath = "//textarea[@placeholder='Add a Description' and @name='taskDescription']")
	private WebElement inputTaskDescription;

	@FindBy(xpath = "//input[@type='time' and @name='tastStartTime']")
	private WebElement inputTaskStartTime;

	@FindBy(xpath = "//input[@type='time' and @name='tastEndTime']")
	private WebElement inputTaskEndTime;

	@FindBy(xpath = "//button[@type='submit' and contains(@class, 'saveBtn')]")
	private WebElement saveTaskButton;

	@FindBy(xpath = "(//div[contains(@class, 'cal-event-container')])[1]")
	private WebElement task1;

	@FindBy(xpath = "//a[@class='cal-event-action ng-star-inserted' and @role='button']/i[@class='bi bi-pencil-fill']")
	private WebElement editTaskButton;

	@FindBy(xpath = "//div[@class='cal-event ng-star-inserted']")
	private WebElement calenderTaskView;

	@FindBy(xpath = "//a[contains(@class, 'cal-event-action') and .//i[contains(@class, 'bi-trash3-fill')]]")
	private WebElement deleteTaskButton;

	@FindBy(css = ".cal-current-time-marker")
	private WebElement currentTimeMarker;

	@FindBy(xpath = "//mwl-calendar-week-view-hour-segment[1]/div/div[contains(text(), 'AM')] | //mwl-calendar-week-view-hour-segment[1]/div/div[contains(text(), 'PM')]")
	private List<WebElement> hourlyViewVisible;

	@FindBy(css = "ngb-datepicker-month")
	private WebElement datePicker;

	@FindBy(xpath = "//button[contains(@class, 'bi-arrow-down-square')]")
	private WebElement datePickerButton;

	public TaskManagerPage() {
		PageFactory.initElements(driver, this);
		setExplicitWait(10);
	}

	public void clickAddTaskButton() {
		addTaskButton.click();
	}

	public void inputTaskTitle(String taskTitle) {
		inputTaskTitle.clear();
		inputTaskTitle.sendKeys(taskTitle);
	}

	public void inputTaskDescription(String taskDescription) {
		inputTaskDescription.clear();
		inputTaskDescription.sendKeys(taskDescription);
	}

	public void inputTaskStartTime(String startTime) {
		inputTaskStartTime.sendKeys(startTime);
	}

	public void inputTaskEndTime(String endTime) {
		inputTaskEndTime.sendKeys(endTime);
	}

	public void clickSaveTaskButton() {
		saveTaskButton.click();
	}

	public Boolean isTaskAdded() {
		return task1.isDisplayed();
	}

	public void clickEditTaskButton() {
		editTaskButton.click();
	}

	public String getCalenderTaskView() {
		String task = calenderTaskView.getAttribute("aria-label");
		task = task.replaceAll("\\s+", " ").trim();
		return task;
	}

	public void clickDeleteTaskButton() {
		deleteTaskButton.click();
	}

	public boolean isTaskPresent() {
		try {
			driver.findElement(By.xpath("(//div[contains(@class, 'cal-event-container')])[1]"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public int getCurrentTopPosition() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", currentTimeMarker);
		Date now = new Date();
		SimpleDateFormat sdfHour = new SimpleDateFormat("HH");
		SimpleDateFormat sdfMinute = new SimpleDateFormat("mm");

		int currentHour = Integer.parseInt(sdfHour.format(now));
		int currentMinute = Integer.parseInt(sdfMinute.format(now));

		int heightOfHourBlock = 60;
		int heightOfMinuteBlock = 1;

		int expectedTopPosition = (int) ((currentHour * heightOfHourBlock) + (currentMinute * heightOfMinuteBlock));
		return expectedTopPosition;
	}

	public WebElement getCurrentTimeMarker() {
		return currentTimeMarker;
	}

	public Boolean isHourlyViewVisible() {
		return hourlyViewVisible.stream().anyMatch(e -> {
			try {
				String text = e.getText().trim();
				String numericText = text.split("\\D+")[0];
				int hour = Integer.parseInt(numericText);
				return hour >= 1 && hour <= 12;
			} catch (NumberFormatException ex) {
				return false;
			}
		});
	}

	public void clickDatePickerButton() {
		datePickerButton.click();
	}

	public void changeMonthAndYear(String month, String year) {

		WebElement monthDropdown = driver
				.findElement(By.xpath("//select[@aria-label='Select month' and @title='Select month']"));

		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByVisibleText(month);

		WebElement yearDropdown = driver
				.findElement(By.xpath("//select[@aria-label='Select year' and @title='Select year']"));

		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(year);

	}

	public void changeDate(String date) {
		String xpath = String.format("//div[@role='gridcell' and @aria-label='%s']/div", date);
		WebElement button_to_click = driver.findElement(By.xpath(xpath));

		button_to_click.click();
	}

	public boolean isCalendarViewShowsDate(String date) {

		String xpath = String.format("//button[contains(@ng-reflect-view-date, '%s')]", date);
		WebElement calendarView = driver.findElement(By.xpath(xpath));
		
		return calendarView.isDisplayed();
	}
}
