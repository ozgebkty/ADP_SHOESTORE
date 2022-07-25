package com.adp_shoestore.pages;

import com.adp_shoestore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Months {
    public Months(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[1]")
    public  WebElement January;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[2]")
    public  WebElement February;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[3]")
    public  WebElement March;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[4]")
    public  WebElement April;

    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[5]")
    public  WebElement May;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[6]")
    public  WebElement June;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[7]")
    public  WebElement July;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[8]")
    public  WebElement August;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[9]")
    public  WebElement  September;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[10]")
    public  WebElement October;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[11]")
    public  WebElement November;
    @FindBy(xpath = "//*[@id=\"header_nav\"]/nav/ul/li[12]")
    public  WebElement December;



    @FindBy(xpath = "//*[@id='header_nav']/nav/ul/li/a")
    public  List<WebElement> allmonths;

     @FindBy(xpath = "//*[@id='header_nav']/nav/ul/li[13]/a")
      public  WebElement allshoes;
}
