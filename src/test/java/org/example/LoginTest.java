package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.page.LoginPage;
import org.page.OpenBrowser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.page.LoginPage;

import java.time.Duration;

public class LoginTest{

  static WebDriver driver;

    @Parameters("browser")
    @Test()
        public void setUpBrowser(String browser) {
        driver = OpenBrowser.OpenBrowser(driver, browser,"https://ui.cogmento.com/");
        System.out.println(browser);
        System.out.println(Thread.currentThread().getId());
        System.out.println(driver.getTitle());

  // LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
   //loginPage.setLogin("mansisinghal28@gmail.com", "80584698@Ma");

       By Email = By.xpath("//input[@name='email']");
       WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email));


       driver.findElement(Email).sendKeys("mansisinghal28@gmail.com");
       Password.sendKeys("80584698@Ma");

        //  LoginPage login= new LoginPage(driver);
        // login.setLogin("mansisinghal28@gmail.com","80584698@Ma");
        // OpenBrowser.CloseBrowser(driver);
        //  System.out.println("Browser closed");
    }
/**
    @Test
    public void Login(){
        LoginPage loginPage= new LoginPage(this.driver);
        loginPage.setLogin("mansisinghal28@gmail.com","******");
    }
*/
    @AfterTest
    public void closeBrowser(){
        OpenBrowser.CloseBrowser(driver);
        System.out.println("Browser closed");
    }


}
