package com.thuduyen07.steps;

import com.thuduyen07.pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class ExampleSteps extends GoogleSearchPage {

    public void navigateTo(String linkPage){
        driver.get(linkPage);
    }

    public void searchFor(String query){
        searchElement().sendKeys(query);
        searchElement().submit();
    }

    public void waitForPageLoad(String keyword){
        final String gaugau = keyword;
        new WebDriverWait(driver, ofSeconds(10))
                .until(
                        new ExpectedCondition<Boolean>() {
                            public Boolean apply(WebDriver d) {
                                return d.getTitle().toLowerCase().startsWith(gaugau);
                            }
                        }
                );
    }


}
