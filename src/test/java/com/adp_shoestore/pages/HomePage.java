package com.adp_shoestore.pages;


import com.adp_shoestore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='home_link_div']/a")
    public WebElement homebutton;

    @FindBy(id = "remind_email_input")
    public WebElement emailentry;

    @FindBy(id = "remind_email_submit")
    public WebElement submitbutton;

    @FindBy(xpath = "//*[@id='flash']/div")
    public WebElement successmessage;



}