package com.lambdatest.pagecomponents;

import com.lambdatest.common.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends Component {
    public NavigationBar(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = "div[id='entry_217822'] input[placeholder='Search For Products']")
    private WebElement searchfield;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement searchbutton;

    @FindBy(xpath = "//span[normalize-space()='Home']")
    private WebElement homebutton;



    public void goToSearchField() {
        this.searchfield.sendKeys("Canon EOS 5D");
    }

    public void clickOnSearchButton() {
        this.searchbutton.click();
    }

    public void clickOnHomeButton() {
        this.homebutton.click();
    }



    public void SearchField() {
        this.searchfield.sendKeys("iPod Nano");
    }

}
