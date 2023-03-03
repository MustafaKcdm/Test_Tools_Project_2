package Case_1;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Senaryo_1 extends BaseDriver{
    @Test

    public void senaryo1(){

        driver.get("https://demowebshop.tricentis.com");

        WebElement register=driver.findElement(By.className("ico-register"));
        Actions aksiyonlar=new Actions(driver);

        Action aksiyon= aksiyonlar.moveToElement(register).click().build();
        aksiyon.perform();

        WebElement radioButton = driver.findElement(By.cssSelector("input[id='gender-male']"));
        aksiyon = aksiyonlar.moveToElement(radioButton).click().build();
        aksiyon.perform();

        WebElement nameTB = driver.findElement(By.cssSelector("[id='FirstName']"));
        aksiyon = aksiyonlar.moveToElement(nameTB).click().sendKeys("Turgay").build();
        aksiyon.perform();

        WebElement lastTB = driver.findElement(By.xpath("//label[@for='LastName']"));
        aksiyon = aksiyonlar.moveToElement(lastTB).click().sendKeys("Demir").build();
        aksiyon.perform();

        WebElement emailTB = driver.findElement(By.cssSelector("input[id='Email']"));
        aksiyon = aksiyonlar.moveToElement(emailTB).click().sendKeys("studygroupuc3@gmail.com").build();
        aksiyon.perform();

        WebElement pwTB = driver.findElement(By.cssSelector("[id='Password']"));
        aksiyon = aksiyonlar.moveToElement(pwTB).click().sendKeys("123123").build();
        aksiyon.perform();

        WebElement confirmPwTB = driver.findElement(By.xpath("//label[@for='ConfirmPassword']"));
        aksiyon = aksiyonlar.moveToElement(confirmPwTB).click().sendKeys("123123").build();
        aksiyon.perform();

        WebElement registerButton=driver.findElement(By.xpath("//input[@id='register-button']"));
        aksiyon= aksiyonlar.moveToElement(registerButton).click().build();
        aksiyon.perform();

        WebElement result=driver.findElement(By.xpath("//div[@class='result']"));

        Assert.assertEquals("Kayıt Başarısız", "Your registration completed", result.getText());

        BekleKapat();



    }
}
