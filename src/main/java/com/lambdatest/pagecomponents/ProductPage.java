package com.lambdatest.pagecomponents;

import com.lambdatest.common.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Component {
    public ProductPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//h4[normalize-space()='Laptops']")
    private WebElement laptop_button;

    public void clickOnSpecialButton() {


      this.laptop_button.click();
    }



}
