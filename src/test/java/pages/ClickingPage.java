package pages;

import configs.Base;
import controls.SeleniumControls;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ClickingPage
{
    String jsAlertBtnXpath = "//*[@id=\"content\"]/div/ul/li[1]/button";
    String jsConfirmBtnXpath = "//*[@id=\"content\"]/div/ul/li[2]/button";
    String jsPromptBtnXpath = "//*[@id=\"content\"]/div/ul/li[3]/button";
    String textResultXpath = "//*[@id=\"result\"]";

    SeleniumControls seleniumControls = new SeleniumControls();

    public void userClickJSButton() throws InterruptedException {
        Thread.sleep(1000);
        try{
            seleniumControls.click(By.xpath(jsAlertBtnXpath));
        }catch (Exception e){
            System.out.println("Issue Trying to Click the Click for JS Alert Button......");
            e.printStackTrace();
        }

        Thread.sleep(2000);
    }

    public void userClickJSConfirmButton() throws InterruptedException {
        Thread.sleep(1000);
        try{
            seleniumControls.click(By.xpath(jsConfirmBtnXpath));
        }catch (Exception e){
            System.out.println("Issue Trying to Click the Click for JS Confirm Button......");
            e.printStackTrace();
        }

        Thread.sleep(2000);
    }

    public void userClickJSPromptButton() throws InterruptedException {
        Thread.sleep(1000);
        try{
            seleniumControls.click(By.xpath(jsPromptBtnXpath));
        }catch (Exception e){
            System.out.println("Issue Trying to Click the Click for JS Prompt Button......");
            e.printStackTrace();
        }

        Thread.sleep(2000);
    }

    public void userAcceptAlert() throws InterruptedException {
        Thread.sleep(2000);
        seleniumControls.switchToAlertAndAccept();
    }

    public void userDismissAlert() throws InterruptedException
    {
        Thread.sleep(2000);
        seleniumControls.switchToAlertAndDismiss();
    }

    public void userSendTextOnAlert(String textToSend) throws InterruptedException
    {
        Thread.sleep(2000);
        seleniumControls.switchToAlertAndSendText(textToSend);
    }


    public void userVerifyCorrectTextResult(String expectedText){
        String actualTextResult="";
        actualTextResult = seleniumControls.readText(By.xpath(textResultXpath));

        //Assert.assertEquals(actualTextResult,expectedText);

        if(expectedText.equals(actualTextResult)){
            System.out.println("Test Pass::Correct Text Results");
        }else {
            System.out.println("Test Fail:: Incorrect Text Results");
        }
    }




}
