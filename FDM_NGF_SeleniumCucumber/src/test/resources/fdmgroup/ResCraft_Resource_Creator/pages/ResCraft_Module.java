package com.fdmgroup.ResCraft_Resource_Creator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResCraft_Module {

    public static WebElement welcomeMessage(WebDriver driver) {
        return driver.findElement(By.xpath("//h3[normalize-space(text())='Resource Creator Module']"));
    }

    public static WebElement body(WebDriver driver) {
        return driver.findElement(By.xpath("//h3[text()='Resource Creator Module']/following-sibling::p"));
    }

    public static WebElement body2(WebDriver driver){
        return driver.findElement(By.xpath("(//h3[text()='Resource Creator Module']/following-sibling::p)[2]"));
    }

}
