package com.adp_shoestore.step_definitions;

import com.adp_shoestore.pages.HomePage;
import com.adp_shoestore.utilities.BrowserUtils;
import com.adp_shoestore.utilities.ConfigurationReader;
import com.adp_shoestore.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2 {
      HomePage homePage=new HomePage();
    @Given("user on the main page")
    public void user_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitForPageToLoad(5);
        String actualTittle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTittle.contains("Shoe Store:"));
    }
    @When("user enters valid email {string} to email area")
    public void user_enters_valid_email_to_email_area(String string ) {
        homePage.emailentry.sendKeys(string);

    }
    @When("user click the submit button")
    public void user_click_the_submit_button() {
        homePage.submitbutton.click();
    }
    @Then("verify the user should be able to see information massage")
    public void verify_the_user_should_be_able_to_see_information_massage() {

        String actualresult=  homePage.successmessage.getText();
        String expectedresult="Thanks! We will notify you of our new shoes at this email: bektayozge@gmail.com";

        System.out.println(homePage.successmessage.getText());


        Assert.assertEquals(actualresult,expectedresult);



    }


}
