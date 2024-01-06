package ebayHomePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ebayHomePageWebElements.WebElements.*;


public class EbayHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = inputSearchFieldXpath)
    public WebElement searchFieldWebElement;

    @FindBy(how = How.XPATH, using = submitButtonXpath)
    public WebElement submitButtonWebElement;

    @FindBy(how = How.ID, using = backToHomePageLogoID)
    public WebElement backToHomePageLogo;

    @FindBy(how = How.XPATH, using = collectibleTabXpath)
    public WebElement collectibleTab;

    @FindBy(how = How.XPATH, using = stampOptionXpath)
    public WebElement stampOption;

    @FindBy(how = How.ID, using = signInButtonID)
    public WebElement signInButton;

    @FindBy(how = How.XPATH, using = twitterLinkXpath)
    public WebElement twitterLink;

    @FindBy(how = How.XPATH, using = helpAndSupportXpath)
    public WebElement helpAndSupport;


    public void inputSearchField() {
        searchFieldWebElement.click();
        searchFieldWebElement.sendKeys("shirts");

    }

    public void submit() {
        submitButtonWebElement.click();

    }

    public void signInClick() {

        signInButton.click();
    }


    public void searchItem() {
        inputSearchField();
        submit();

    }

    public void clickOnTwitterLink() {

        scrollDownVertically();
        //scrollUpDownByHeight();
        twitterLink.click();
    }


    public void mouseOverOnCollectibleTabAndSelectStamp() {

        Actions actions = new Actions(driver);
        actions.moveToElement(collectibleTab).build().perform();
        stampOption.click();


    }

    public void clickOnHelpAndSupport() {

        scrollDownVertically();
        helpAndSupport.isDisplayed();
        helpAndSupport.click();


    }


    public void getUrl() throws InterruptedException {
        getCurrentUrl();
        Thread.sleep(4000);
    }
}
