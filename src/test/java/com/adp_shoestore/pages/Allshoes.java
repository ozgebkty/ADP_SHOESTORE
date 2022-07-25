package com.adp_shoestore.pages;

import com.adp_shoestore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Allshoes {
    public Allshoes() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = " //*[@id='header_nav']/nav/ul/li[13]/a")
    public WebElement allshoesiconindashboard;


    @FindBy(xpath = "//tbody/tr[1]")
    public List<WebElement> specificbrandnamesunderallshoes;

    @FindBy(xpath = "//tbody/tr[3]")
    public List<WebElement> specificbrandprice;

    @FindBy(xpath = " //div/table/tbody/tr[2]/td[1]")

    public List<WebElement> Nametextunderallshoe;

    @FindBy(xpath = "/html/body/div[2]/h2")

    public WebElement allshoestitleunderdashboard;




}
