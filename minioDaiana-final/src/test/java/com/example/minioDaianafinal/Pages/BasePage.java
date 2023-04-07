package com.example.minioDaianafinal.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    By btnRegister = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegister(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(btnRegister).click();
    }
}
