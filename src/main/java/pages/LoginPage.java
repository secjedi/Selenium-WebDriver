package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernamefield = By.id("username");
    private By passwordfield = By.id("password");
    private By loginBtn = By.cssSelector("#password");


    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
    public void  setUsername(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }
    public  SecureAreaPage clickLoginButton(){
        driver.findElement(loginBtn).click();
        return  new SecureAreaPage(driver);
    }
}
