package uk.co.library.pages;

import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    By jobTitleField = By.xpath("//input[@id='keywords']");
    By locationField = By.xpath("//input[@id='location']");
    By distanceDropDown = By.xpath("//select[@id='distance']");
    By moreSearchOptionsLink = By.xpath("//button[@id='toggle-hp-search']");
    By salaryMin = By.xpath("//input[@id='salarymin']");
    By salaryMax = By.xpath("//input[@id='salarymax']");
    By salaryTypeDropDown = By.xpath("//select[@id='salarytype']");
    By jobTypeDropDown = By.xpath("//select[@id='tempperm']");
    By findJobsButton = By.xpath("//input[@id='hp-search-btn']");

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
    }

    public void selectDistance(String distance) {
        sendTextToElement(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String salaryType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
    }

    public void selectJobType(String jobType) {
        sendTextToElement(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsButton);
    }
}
