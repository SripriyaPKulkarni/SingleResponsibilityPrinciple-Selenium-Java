package com.lambdatest.mainpageobjects;

import com.lambdatest.pagecomponents.NavigationBar;
import com.lambdatest.pagecomponents.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LambdaTestHomePage {
    private WebDriver driver;
    private  NavigationBar navigationBar;
    private ProductPage productpage;


    public LambdaTestHomePage(final WebDriver driver) {
        this.driver = driver;

      this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        this.productpage = PageFactory.initElements(driver, ProductPage.class);

    }



    public void goTo() {
        this.driver.get("https://ecommerce-playground.lambdatest.io/");
    }

    public NavigationBar navigateTo() {
        return navigationBar;
    }

    public ProductPage productpage() {
        return productpage;
    }



}
