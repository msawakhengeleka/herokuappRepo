package tests;

import controls.SeleniumControls;
import org.testng.annotations.Test;
import pages.ClickingPage;

import static configs.Base.seleniumControls;

public class ClickingTests
{
    ClickingPage clickingPage = new ClickingPage();

    @Test
    public void ClickTest() throws InterruptedException {
        seleniumControls.startTheApplication();

        clickingPage.userClickJSButton();

        clickingPage.userAcceptAlert();

        String expectedText = "You successfully clicked an alert";
        clickingPage.userVerifyCorrectTextResult(expectedText);
    }
}
