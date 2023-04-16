package controls;
import configs.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

import static browserFactory.DriverFactory.openBrowser;


public class SeleniumControls extends Base
{
    public void startTheApplication()
    {
        openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public void click(By element){driver.findElement(element).click();}

    public void switchToAlertAndAccept()
    {
        driver.switchTo().alert().accept();
    }

    public void switchToAlertAndDismiss()
    {
        driver.switchTo().alert().dismiss();
    }

    public void switchToAlertAndSendText(String textToSend)
    {
        driver.switchTo().alert().sendKeys(textToSend);
    }

    public String readText(By element){
        String textResult = driver.findElement(element).getText();
        return textResult;
    }

    public void waitThread(int TimeInSeconds) throws InterruptedException {
        Thread.sleep(TimeInSeconds);
    }


    public void closeBrowser(){driver.close();}

}
