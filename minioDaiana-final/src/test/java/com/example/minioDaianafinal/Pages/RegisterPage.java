package com.example.minioDaianafinal.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String name) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.firstName")));
        WebElement nameInput = driver.findElement(By.id("customer.firstName"));
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterLastname(String lastName) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.lastName")));
        WebElement lastNameInput = driver.findElement(By.id("customer.lastName"));
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    public void enteraddress(String address) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.address.street")));
        WebElement addressInput = driver.findElement(By.id("customer.address.street"));
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void enterCity(String city) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.address.city")));
        WebElement cityInput = driver.findElement(By.id("customer.address.city"));
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    public void enterState(String state) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.address.state")));
        WebElement stateInput = driver.findElement(By.id("customer.address.state"));
        stateInput.clear();
        stateInput.sendKeys(state);
    }

    public void enterZipCode(String zipcode) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.address.zipCode")));
        WebElement zipcodeInput = driver.findElement(By.id("customer.address.zipCode"));
        zipcodeInput.clear();
        zipcodeInput.sendKeys(zipcode);
    }

    public void enterPhone(String phone) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.phoneNumber")));
        WebElement phoneInput = driver.findElement(By.id("customer.phoneNumber"));
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }

    public void enterSNN(String snn) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.ssn")));
        WebElement snnInput = driver.findElement(By.id("customer.ssn"));
        snnInput.clear();
        snnInput.sendKeys(snn);
    }

    public void enterUser(String username) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.username")));
        WebElement userInput = driver.findElement(By.id("customer.username"));
        userInput.clear();
        userInput.sendKeys(username);
    }

    public void enterPassword(String password) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.password")));
        WebElement passwordInput = driver.findElement(By.id("customer.password"));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void confirmPassword(String password) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("repeatedPassword")));
        WebElement pass2Input = driver.findElement(By.id("repeatedPassword"));
        pass2Input.clear();
        pass2Input.sendKeys(password);
    }

    public void btnRegister() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")));
        WebElement btnRegister = driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
        btnRegister.click();
    }

    public String checkMessage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/p")));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
        String message2 = message.getText();
        return message2;
    }

}
