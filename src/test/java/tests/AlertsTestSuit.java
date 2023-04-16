package tests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ClickingPage;

import static configs.Base.seleniumControls;

public class AlertsTestSuit {
    ClickingPage clickingPage = new ClickingPage();

    @BeforeClass
    public void initiateTesting(){
        seleniumControls.startTheApplication();
    }

    @Test
    public void ClickTest() throws InterruptedException {

        clickingPage.userClickJSButton();

        clickingPage.userAcceptAlert();

        String expectedText = "You successfully clicked an alert";
        clickingPage.userVerifyCorrectTextResult(expectedText);
    }
    @Test
    public void DismissAlert()throws InterruptedException
    {
        clickingPage.userClickJSConfirmButton();

        clickingPage.userDismissAlert();

        String expectedText = "You clicked: Cancel";
        clickingPage.userVerifyCorrectTextResult(expectedText);
    }
    @Test
    public void EnterTextOnPrompt()throws InterruptedException
    {
        clickingPage.userClickJSPromptButton();

        clickingPage.userSendTextOnAlert("test");

        String expectedText = "You entered: test";
        clickingPage.userVerifyCorrectTextResult(expectedText);
    }

    @AfterSuite
    public void closeBrowser()
    {
        seleniumControls.closeBrowser();
    }
}
