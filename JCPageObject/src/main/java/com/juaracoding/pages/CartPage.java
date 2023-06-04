package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    WebElement btnQA;
    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement btnGet;
    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement btnC;
    @FindBy(xpath = "//*[@id=\"pa_color\"]/option[2]")
    WebElement btnSc;
    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement btnSz;
    @FindBy(xpath = "//*[@id=\"pa_size\"]/option[2]")
    WebElement btnCz;
    @FindBy(xpath = "//*[@id=\"product-1491\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnAdd;

    public void cart() {
        btnQA.click();
        btnGet.click();
        btnC.click();
        btnSc.click();
        btnSz.click();
        btnCz.click();
        btnAdd.click();
    }
}
