package au.com.carguide.steps;

import au.com.carguide.pages.DealerPage;
import au.com.carguide.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class FindDealerSteps {
    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() throws InterruptedException {
        new Homepage().clickOnFindDealer();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealersName)  {
        Assert.assertTrue(new DealerPage().findDealer(dealersName),"dealer is not there");
    }
}
