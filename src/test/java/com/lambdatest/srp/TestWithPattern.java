package com.lambdatest.srp;

import com.lambdatest.base.BaseTest;
import com.lambdatest.mainpageobjects.LambdaTestHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class TestWithPattern extends BaseTest {



    private LambdaTestHomePage lambdatestHomePage;
    @BeforeTest
    public void setupPages() {
        this.lambdatestHomePage = new LambdaTestHomePage(driver);

    }

    @Test
    public void TestFlow() throws InterruptedException {

        lambdatestHomePage.goTo();

        lambdatestHomePage.navigateTo().goToSearchField();

        lambdatestHomePage.navigateTo().clickOnSearchButton();

        lambdatestHomePage.navigateTo().clickOnHomeButton();
        lambdatestHomePage.navigateTo().clickOnSearchButton();
        lambdatestHomePage.navigateTo().SearchField();

        lambdatestHomePage.goTo();


        lambdatestHomePage.productpage().clickOnSpecialButton();

        //print the title of the Special Page
        String actualTitle="";
        actualTitle=driver.getTitle();
        System.out.println(actualTitle);



    }




}
