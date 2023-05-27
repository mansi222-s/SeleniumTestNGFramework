package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    WebElement Email= driver.findElement(By.xpath("//input[@name='email']"));
    WebElement Password= driver.findElement(By.xpath("//input[@name='password']"));

    public void setLogin(String email,String password){

        Email.sendKeys(email);
        Password.sendKeys(password);

    }
}
