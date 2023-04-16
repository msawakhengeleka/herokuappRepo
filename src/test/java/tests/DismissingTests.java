package tests;
import org.testng.annotations.Test;
import pages.ClickingPage;

import static configs.Base.seleniumControls;
public class DismissingTests
{
    ClickingPage clickingPage = new ClickingPage();

    @Test
    public void DismissAlert()throws InterruptedException
    {
        seleniumControls.startTheApplication();

        clickingPage.userClickJSConfirmButton();

        clickingPage.userDismissAlert();

        String expectedText = "You clicked: Cancel";
        clickingPage.userVerifyCorrectTextResult(expectedText);
    }
}
