package Case_4;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Senaryo_4 extends BaseDriver {
    @Test
    public void Senaryo4(){
        driver.get("https://demowebshop.tricentis.com");
        WebElement loginB=driver.findElement(By.xpath("//a[@class='ico-login']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(loginB).click().build();
        aksiyon.perform();
        WebElement emailTB = driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyon = aksiyonlar.moveToElement(emailTB).click().sendKeys("studygroupuc@gmail.com").build();
        aksiyon.perform();
        WebElement pwTB = driver.findElement(By.id("Password"));
        aksiyon = aksiyonlar.moveToElement(pwTB).click().sendKeys("1233123").build();
        aksiyon.perform();
        WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        aksiyon= aksiyonlar.moveToElement(loginButton).click().build();
        aksiyon.perform();
        WebElement error=driver.findElement(By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        Assert.assertTrue("Login Başarısız",error.isDisplayed());





    }
}
