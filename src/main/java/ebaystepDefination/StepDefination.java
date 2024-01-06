package ebaystepDefination;

import common.WebAPI;
import ebayHomePage.EbayHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StepDefination extends WebAPI {

    @Before
    public void envAndDriverSetup() throws IOException {
        setUp(false,
                "browserstack",
                "OS X", "ventura",
                "chrome", "119",
                "https://www.ebay.com/");
    }

    @After
    public void closeBrowser(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            captureScreenshot(scenario, driver, scenario.getName());
        }
        cleanUp();
    }

    static EbayHomePage homePage;

    public static void getInitElements(){

        homePage= PageFactory.initElements(driver,ebayHomePage.EbayHomePage.class);

    }

    @Given("User is an ebay HomePage")
    public void user_is_an_ebay_HomePage() {
        getInitElements();
       // throw new io.cucumber.java.PendingException();
    }

    @When("User Click on Search Field")
    public void User_Click_on_Search_Field(){
        getInitElements();
        homePage.searchFieldWebElement.click();
    }

    @Given("User inputs {string} on search bar field")
    public void user_inputs_on_search_bar_field(String string) {
        getInitElements();
        homePage.inputSearchField();
    }

    @When("User hits enter")
    public  void User_hits_enter(){
        getInitElements();
        homePage.searchFieldWebElement.submit();
    }

    @Then("User landing on a search result page")
    public void User_landing_on_a_search_result_page(){
        getInitElements();
    }



}
