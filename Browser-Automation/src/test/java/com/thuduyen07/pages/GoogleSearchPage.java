package com.thuduyen07.pages;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

    public final WebDriver driver = new ChromeDriver();

    public WebElement searchElement() {
        return driver.findElement(By.name("q"));
    }

    public void navigateToGooglePage(){
        driver.get("https://www.google.com/");
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

}
