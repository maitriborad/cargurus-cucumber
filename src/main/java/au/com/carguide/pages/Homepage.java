package au.com.carguide.pages;

import au.com.carguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buySell;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCar;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement used;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealer;

    public void mouseHoverOnBuySell(){
        mouseHoverToElement(buySell);
    }
    public void clickOnSearchCar() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(searchCar);
        log.info("Click on : " + searchCar.toString());
    }
    public void clickOnUsed() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(used);
        log.info("Click on : " + used.toString());
    }
    public void clickOnFindDealer() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(findDealer);
    }
}
