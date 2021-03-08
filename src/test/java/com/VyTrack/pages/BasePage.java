package com.VyTrack.pages;

import com.VyTrack.utilities.ConfigurationReader;
import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement usernameInputBox;

    @FindBy(id = "prependedInput2")
    public  WebElement passwordInputBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleetModule;

    public void login_as_a_driver_config(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        usernameInputBox.sendKeys(ConfigurationReader.getProperty("truckDriver1"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
}
