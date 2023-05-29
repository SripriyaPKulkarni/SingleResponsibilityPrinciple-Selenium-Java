package com.lambdatest.pagecomponents;

import com.lambdatest.common.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialLinkBar extends Component {
    public SpecialLinkBar(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//ul[@class='navbar-nav horizontal']//span[@class='title'][normalize-space()='Special']")
    private WebElement specialbutton;

    public void clickOnSpecialButton() {
        this.specialbutton.click();
    }
}
