package com.lambdatest.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Component {

    protected WebDriverWait wait;

    public Component(final WebDriver driver) {
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }
}
