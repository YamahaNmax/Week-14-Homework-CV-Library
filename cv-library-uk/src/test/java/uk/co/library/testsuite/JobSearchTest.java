package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Test

    public void verifyJobSearchResultUsingDifferentDataSet1() {

        homePage.enterJobTitle("Tester");
        homePage.enterLocation("Harrow");
        homePage.selectDistance("up to 5 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("30000");
        homePage.enterMaxSalary("500000");
        homePage.selectSalaryType("Per annum");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();

        String actualText = resultPage.verifyTheResults();
        String ExpectedText = "Permanent Tester jobs in Harrow";
        System.out.println(actualText);
        Assert.assertEquals(actualText, ExpectedText);

    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet2() {

        homePage.enterJobTitle("Automation Tester");
        homePage.enterLocation("London");
        homePage.selectDistance("15");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("5000");
        homePage.enterMaxSalary("9500");
        homePage.selectSalaryType("Per month");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();

        String actualText = resultPage.verifyTheResults();
        String ExpectedText = "Permanent Automation Tester jobs in London";
        System.out.println(actualText);
        Assert.assertEquals(actualText, ExpectedText);

    }

}
