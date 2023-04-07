package com.example.minioDaianafinal.Test;

import com.example.minioDaianafinal.Pages.AccountPage;
import com.example.minioDaianafinal.Pages.BasePage;
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
class TestRegister {
    WebDriver driver;

    BasePage home;
    RegisterPage registerPage;

    AccountPage accountPage;

    @BeforeAll
    public void setup() {

        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void testRegister() {
    //Test de registro de usuario
        home = new BasePage(driver);
        home.clickRegister();
        registerPage = new RegisterPage(driver);
        registerPage.enterFirstName("Steel");
        registerPage.enterLastname("Gray");
        registerPage.enteraddress("Calle falsa 123");
        registerPage.enterCity("Bs as");
        registerPage.enterState("Bs As");
        registerPage.enterZipCode("1842BB");
        registerPage.enterPhone("18777535441");
        registerPage.enterSNN("asdasd");
        registerPage.enterUser("steely");
        registerPage.enterPassword("abc123");
        registerPage.confirmPassword("abc123");
        registerPage.btnRegister();
        String result = registerPage.checkMessage();
        assertTrue(result.contains("Your account was created successfully. You are now logged in."));

        System.out.println("Resultado obtenido: " + result);
    }

    /*@Test
    public void testAccount(){
        //Test para crear una nueva cuenta
        accountPage = new AccountPage(driver);
        accountPage.btnNewAccount();
        accountPage.btnOptionType();
        accountPage.btnOptionSavings();
        accountPage.btnOpenAccount();
        String results = accountPage.checkMessage2();
        assertTrue(results.contains("Congratulations, your account is now open."));
    }

    @Test
    public void testFunds(){
        //Test para transferir fondos
        accountPage = new AccountPage(driver);
        accountPage.btnTransferFunds();
        String resultado = accountPage.checkMessage3();
        assertTrue(resultado.contains("Transfer Funds"));
        accountPage.enterImport("20");
        accountPage.optionAccount();
        accountPage.btnTransfer();
        String resultado2 = accountPage.checkMessage4();
        assertTrue(resultado2.contains("Transfer Complete!"));
    }*/

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }
}
