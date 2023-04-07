package com.example.minioDaianafinal.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {
    WebDriver driver;
    WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterusername(String user) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")));
        WebElement userInput = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
        userInput.clear();
        userInput.sendKeys(user);
    }

    public void enterpss(String pss) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")));
        WebElement pssInput = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
        pssInput.clear();
        pssInput.sendKeys(pss);
    }

    public void btnLogin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")));
        WebElement btnLog = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        btnLog.click();
    }
    public void btnNewAccount() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")));
        WebElement btnAccount = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
        btnAccount.click();
    }

    public void btnOptionType() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"type\"]")));
        WebElement btnType = driver.findElement(By.xpath("//*[@id=\"type\"]"));
        btnType.click();
    }

    public void btnOptionSavings() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"type\"]/option[2]")));
        WebElement btnSavings = driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]"));
        btnSavings.click();
    }

    public void btnOpenAccount() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("INPUT")));
        WebElement btnOpenA = driver.findElement(By.tagName("INPUT"));
        btnOpenA.click();
    }

    public String checkMessage2() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("P")));
        WebElement message = driver.findElement(By.tagName("P"));
        String message3 = message.getText();
        return message3;
    }

    public void btnTransferFunds() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")));
        WebElement btnTransfer = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a"));
        btnTransfer.click();
    }

    public String checkMessage3() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1"));
        String message4 = message.getText();
        return message4;
    }

    public void enterImport(String importe) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("amount")));
        WebElement importInput = driver.findElement(By.id("amount"));
        importInput.clear();
        importInput.sendKeys(importe);
    }

    public void optionAccount() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"toAccountId\"]/option[2]")));
        WebElement optionAc = driver.findElement(By.xpath("//*[@id=\"toAccountId\"]/option[2]"));
        optionAc.click();
    }

    public void btnTransfer() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")));
        WebElement btnTransferencia = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input"));
        btnTransferencia.click();
    }

    public String checkMessage4() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1"));
        String message5 = message.getText();
        return message5;
    }

    public void btnAccOverview() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")));
        WebElement btnOverview = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a"));
        btnOverview.click();
    }

    public String checkText() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1"));
        String text1 = message.getText();
        return text1;
    }

    public void btnCuenta() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a")));
        WebElement btnCuenta = driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"));
        btnCuenta.click();
    }

    public String checkText2() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/h1")));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/h1"));
        String text2 = message.getText();
        return text2;
    }
}
