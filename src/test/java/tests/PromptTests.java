package tests;
import org.testng.annotations.Test;
import pages.ClickingPage;

import static configs.Base.seleniumControls;

public class PromptTests {
    ClickingPage clickingPage = new ClickingPage();

    @Test
    public void EnterTextOnPrompt()throws InterruptedException
    {
        seleniumControls.startTheApplication();

        clickingPage.userClickJSPromptButton();

        String textToSend = "test";
        clickingPage.userSendTextOnAlert(textToSend);

        String expectedText = "You entered: "+textToSend;
        clickingPage.userVerifyCorrectTextResult(expectedText);
    }
}
