package com.lambdatest.mainpageobjects;

import com.lambdatest.pagecomponents.NavigationBar;
import com.lambdatest.pagecomponents.SpecialLinkBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LambdaTestHomePage {
    private WebDriver driver;
    private  NavigationBar navigationBar;
    private  SpecialLinkBar specialLinkBar;

    public LambdaTestHomePage(final WebDriver driver) {
        this.driver = driver;

      this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        this.specialLinkBar=PageFactory.initElements(driver, SpecialLinkBar.class);
    }



    public void goTo() {
        this.driver.get("https://ecommerce-playground.lambdatest.io/");
    }

    public NavigationBar navigateTo() {
        return navigationBar;
    }
    public SpecialLinkBar specialLinkBar() {
        return specialLinkBar;
    }

}
