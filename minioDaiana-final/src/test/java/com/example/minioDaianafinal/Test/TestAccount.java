package com.example.minioDaianafinal.Test;

import com.example.minioDaianafinal.Pages.AccountPage;
import com.example.minioDaianafinal.Pages.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestAccount {

    WebDriver driver;

    AccountPage accountPage;

    @BeforeAll
    public void setup() {

        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/overview.htm");
    }

    @Test
    public void testAccount(){
        //Test para crear una nueva cuenta
        accountPage = new AccountPage(driver);
        accountPage.enterusername("seb123");
        accountPage.enterpss("seb123");
        accountPage.btnLogin();
        accountPage.btnNewAccount();
        accountPage.btnOptionType();
        accountPage.btnOptionSavings();
        accountPage.btnOpenAccount();
        String results20 = accountPage.checkMessage2();
        assertTrue(results20.contains("Congratulations, your account is now open."));
    }

    @Test
    public void testFunds(){
        //Test para transferir fondos
        accountPage = new AccountPage(driver);
        accountPage.enterusername("seb123");
        accountPage.enterpss("seb123");
        accountPage.btnLogin();
        accountPage.btnTransferFunds();
        String resultado = accountPage.checkMessage3();
        assertTrue(resultado.contains("Transfer Funds"));
        accountPage.enterImport("20");
        accountPage.optionAccount();
        accountPage.btnTransfer();
        String resultado2 = accountPage.checkMessage4();
        assertTrue(resultado2.contains("Transfer Complete!"));
    }

    @Test
    public void testOverview(){
        //Test de la actividad de la cuenta
        accountPage = new AccountPage(driver);
        accountPage.btnAccOverview();
        String texto = accountPage.checkText();
        assertTrue(texto.contains("*Balance includes deposits that may be subject to holds"));
        accountPage.btnCuenta();
        String texto2 = accountPage.checkText2();
        assertTrue(texto2.contains("Account Details"));
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }
}
