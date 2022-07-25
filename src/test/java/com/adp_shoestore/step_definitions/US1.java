package com.adp_shoestore.step_definitions;

import com.adp_shoestore.pages.Allshoes;
import com.adp_shoestore.pages.HomePage;
import com.adp_shoestore.pages.Months;
import com.adp_shoestore.pages.NavigationBar;
import com.adp_shoestore.utilities.BrowserUtils;
import com.adp_shoestore.utilities.ConfigurationReader;
import com.adp_shoestore.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US1 {

    HomePage homepage = new HomePage();
    Allshoes allshoes = new Allshoes();
    Months months = new Months();
    NavigationBar navbar=new NavigationBar();

    @Given("User on the main page")
    public void userOnTheMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Then("Verify header title")
    public void verifyHeaderTitle() {
        BrowserUtils.waitForPageToLoad(5);
        String actualTittle = Driver.getDriver().getTitle();
        Assert.assertEquals("Shoe Store: Welcome to the Shoe Store", actualTittle);
    }

  @Then("Verify User clicks month icon")
    public void verifyUserClicksMonthIcon() {

        for (WebElement each : months.allmonths) {
            each.click();
           System.out.println(Driver.getDriver().getTitle());

        }

    }
        @And("the user clicks All Shoes icon")
        public void theUserClicksAllShoesIcon() {

        allshoes.allshoesiconindashboard.click();

        }

    @And("the user sees All shoes tittle")
    public void theUserSeesAllShoesTittle() {
       String actualTitle=  Driver.getDriver().getTitle();
       String expectedTitle="Shoe Store:";
       Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Then("verify   prices are displayed")
    public void verifyPricesAreDisplayed() {
        BrowserUtils.getElementsText(allshoes.specificbrandprice);
        List<String> actualBrandPrice = new ArrayList<>();
        allshoes.specificbrandprice.forEach(p->actualBrandPrice.add(p.getText()));
        System.out.println("Brand Prices = " + actualBrandPrice);

    }


    @Given("User Click AllShoes")
    public void userClickAllShoes() {
        months.allshoes.click();


    }

    @Then("Verify   following brands is displayed")
    public void verify_following_brands_is_displayed() {
        List<String> actualBrandNames = new ArrayList<>();
        allshoes.specificbrandnamesunderallshoes.forEach(p->actualBrandNames.add(p.getText()));
        System.out.println("Actual Brand Names = " + actualBrandNames);


    }

    @Then("Verify  User Click month and  brands will displayed under each month")
    public void verifyUserClickMonthAndBrandsWillDisplayedUnderEachMonth() {
         BrowserUtils.waitFor(2);
        List<String> JanuaryBrandNames= new ArrayList<>();
         months.January.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->JanuaryBrandNames.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> FebruaryBrandNames= new ArrayList<>();
        months.January.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->JanuaryBrandNames.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> March= new ArrayList<>();
        months.March.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->March.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> April= new ArrayList<>();
        months.April.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->April.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> May= new ArrayList<>();
        months.May.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p-> May.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> June= new ArrayList<>();
        months.June.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->June.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> July= new ArrayList<>();
        months.January.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->JanuaryBrandNames.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> August= new ArrayList<>();
        months.August.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->August.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> September= new ArrayList<>();
        months.September.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->September.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> October= new ArrayList<>();
        months.October.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->October.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String>  November= new ArrayList<>();
        months.November.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->November.add(p.getText()));

        BrowserUtils.waitFor(2);
        List<String> December= new ArrayList<>();
        months.December.click();
        allshoes.specificbrandnamesunderallshoes.forEach(p->December.add(p.getText()));






        System.out.println(JanuaryBrandNames);
        System.out.println(FebruaryBrandNames);
        System.out.println(March);
        System.out.println(April);
        System.out.println(May);
        System.out.println(June);
        System.out.println(July);
        System.out.println(September);
        System.out.println(October);
        System.out.println(November);
        System.out.println(December);


    }



        }

