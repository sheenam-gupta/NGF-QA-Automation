package com.fdmgroup.onboardingnavigator.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlossaryPage {
    

public static List<WebElement> glossaryTermDropdown(WebDriver driver) {
    return driver.findElements(By.xpath("//select[@id='glossary-dropdown']"));
}

public static WebElement definitionBox(WebDriver driver) {
    return driver.findElement(By.xpath("//div[@id='definition-box']"));
}

public static WebElement welcomeMessage(WebDriver driver) {
    return driver.findElement(By.xpath("/html/body/main/div/div[1]/em"));
}

}
