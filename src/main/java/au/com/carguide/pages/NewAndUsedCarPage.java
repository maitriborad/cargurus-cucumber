package au.com.carguide.pages;

import au.com.carguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement newAndUsedCarText;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement selectMake;
    @CacheLookup
    @FindBy(id = "models")
    WebElement selectModel;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement selectLocation;
    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement selectPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findButton;

    public String getTextNewAndUsedCar(){
        log.info("Get text : " + newAndUsedCarText.toString());
        return getTextFromElement(newAndUsedCarText);
    }
    public void setSelectMake(String make){
        selectByVisibleTextFromDropDown(selectMake,make);
        log.info("Select : " + selectMake.toString());
    }
    public void setSelectModel(String model){
        selectByVisibleTextFromDropDown(selectModel,model);
        log.info("Select : " + selectModel.toString());
    }
    public void setSelectLocation(String location){
        selectByVisibleTextFromDropDown(selectLocation,location);
        log.info("Select : " + selectLocation.toString());
    }
    public void setSelectPrice(String price){
        selectByVisibleTextFromDropDown(selectPrice,price);
        log.info("Select : " + selectPrice.toString());
    }
    public void clickOnFindButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(findButton);
        log.info("Click on : " + findButton.toString());
    }
}
