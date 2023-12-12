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

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet3() {

        homePage.enterJobTitle("Project Manager");
        homePage.enterLocation("leeds");
        homePage.selectDistance("7");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("300");
        homePage.enterMaxSalary("950");
        homePage.selectSalaryType("Per day");
        homePage.selectJobType("Contract");
        homePage.clickOnFindJobsButton();

        String actualText = resultPage.verifyTheResults();
        String ExpectedText = "Contract Project Manager jobs in Leeds";
        System.out.println(actualText);
        Assert.assertEquals(actualText, ExpectedText);

    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet4() {

        homePage.enterJobTitle("Software Engineer");
        homePage.enterLocation("Reading");
        homePage.selectDistance("50");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("24");
        homePage.enterMaxSalary("60");
        homePage.selectSalaryType("Per hour");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();

        String actualText = resultPage.verifyTheResults();
        String ExpectedText = "Permanent Software Engineer jobs in Reading";
        System.out.println(actualText);
        Assert.assertEquals(actualText, ExpectedText);

    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet5() {

        homePage.enterJobTitle("Risk Manager");
        homePage.enterLocation("London");
        homePage.selectDistance("2");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("1200");
        homePage.enterMaxSalary("2400");
        homePage.selectSalaryType("Per week");
        homePage.selectJobType("Temporary");
        homePage.clickOnFindJobsButton();

        String actualText = resultPage.verifyTheResults();
        String ExpectedText = "Temporary Risk Manager jobs in London";
        System.out.println(actualText);
        Assert.assertEquals(actualText, ExpectedText);

    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet6() {

        homePage.enterJobTitle("Aws Engineer");
        homePage.enterLocation("Manchester");
        homePage.selectDistance("75");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("4000");
        homePage.enterMaxSalary("8500");
        homePage.selectSalaryType("Per month");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();

        String actualText = resultPage.verifyTheResults();
        String ExpectedText = "Permanent Aws Engineer jobs in Manchester";
        System.out.println(actualText);
        Assert.assertEquals(actualText, ExpectedText);

    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet7() {

        homePage.enterJobTitle("SIA Guard");
        homePage.enterLocation("City of London");
        homePage.selectDistance("100");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("11");
        homePage.enterMaxSalary("17");
        homePage.selectSalaryType("Per hour");
        homePage.selectJobType("Part Time");
        homePage.clickOnFindJobsButton();

        String actualText = resultPage.verifyTheResults();
        String ExpectedText = "Part Time Sia Guard jobs in City of London";
        System.out.println(actualText);
        Assert.assertEquals(actualText, ExpectedText);

    }


}
