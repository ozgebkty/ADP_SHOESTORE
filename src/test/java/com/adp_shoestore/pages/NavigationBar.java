package com.adp_shoestore.pages;

import com.adp_shoestore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NavigationBar {

    public NavigationBar() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = " //header/div/nav/ul")
    public List<WebElement>  navigationbar;

    @FindBy(xpath = " //header/div/nav/ul")
    public List<WebElement>  allUsersIcon;


}
