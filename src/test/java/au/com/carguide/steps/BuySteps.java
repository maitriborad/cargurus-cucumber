package au.com.carguide.steps;

import au.com.carguide.pages.Homepage;
import au.com.carguide.pages.NewAndUsedCarPage;
import au.com.carguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new Homepage().mouseHoverOnBuySell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() throws InterruptedException {
        new Homepage().clickOnSearchCar();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String expected) {
        Assert.assertTrue(new NewAndUsedCarPage().getTextNewAndUsedCar().contains(expected),"User is not navigated");
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarPage().setSelectMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarPage().setSelectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarPage().setSelectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarPage().setSelectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() throws InterruptedException {
        new NewAndUsedCarPage().clickOnFindButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
       Assert.assertTrue(new ResultPage().getMakeText().contains(make),"selection is not matching");
    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() throws InterruptedException {
        new Homepage().clickOnUsed();
    }
}
