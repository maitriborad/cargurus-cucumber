package au.com.carguide.pages;

import au.com.carguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(DealerPage.class.getName());

    public DealerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']")
    List <WebElement> dealerName;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement next;

    public boolean findDealer(String dealersName){
        boolean productfound = false;
        while (!productfound) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            List<WebElement> listOfDealer = getListOfElements(dealerName);
        ArrayList<String> dealers = new ArrayList<>();
        for (WebElement f : listOfDealer) {
            dealers.add(f.getText());
            System.out.println(dealers);
        for (String name : dealers) {
            if (name.equalsIgnoreCase(dealersName)) {
                productfound = true;
                break;
            }
        }}
        if (!productfound && !dealers.contains(dealersName)) {
            clickOnElement(next);
        } else {
            break;
        }
    }
        return productfound;
    }
}
