package Case_5;

import Utility.BaseDriver;
import Utility.My_Func;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Senaryo_5 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demowebshop.tricentis.com");
        WebElement loginB=driver.findElement(By.xpath("//a[@class='ico-login']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(loginB).click().build();
        aksiyon.perform();
        WebElement emailTB = driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyon = aksiyonlar.moveToElement(emailTB).click().sendKeys("studygroupuc@gmail.com").build();
        aksiyon.perform();
        WebElement pwTB = driver.findElement(By.id("Password"));
        aksiyon = aksiyonlar.moveToElement(pwTB).click().sendKeys("123123").build();
        aksiyon.perform();
        WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        aksiyon= aksiyonlar.moveToElement(loginButton).click().build();
        aksiyon.perform();
        WebElement computers = driver.findElement(By.cssSelector("ul[class='top-menu']>li>a[href='/computers']"));
        aksiyon= aksiyonlar.moveToElement(computers).click().build();
        aksiyon.perform();
        WebElement notebooks = driver.findElement(By.cssSelector(" h2>[href='/notebooks']"));
        aksiyon= aksiyonlar.moveToElement(notebooks).click().build();
        aksiyon.perform();
        WebElement addToCart = driver.findElement(By.cssSelector("[value='Add to cart']"));
        aksiyon= aksiyonlar.moveToElement(addToCart).click().build();
        aksiyon.perform();
        My_Func.Bekle(1);
        WebElement warning = driver.findElement(By.cssSelector("[class='bar-notification success']"));
        Assert.assertTrue("Satın Alma Başarısız", warning.isDisplayed());
        WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        aksiyon= aksiyonlar.moveToElement(shoppingCart).click().build();
        aksiyon.perform();
        WebElement product = driver.findElement(By.cssSelector("[class='product-name']"));
        Assert.assertTrue("Satın Alma Başarısız", product.isDisplayed());
        WebElement agreeCheck = driver.findElement(By.cssSelector(" [id='termsofservice']"));
        aksiyon= aksiyonlar.moveToElement(agreeCheck).click().build();
        aksiyon.perform();
        WebElement checkOut = driver.findElement(By.cssSelector("[id='checkout']"));
        aksiyon= aksiyonlar.moveToElement(checkOut).click().build();
        aksiyon.perform();
        WebElement newDD = driver.findElement(By.cssSelector("select[name='billing_address_id']"));
        Select ddMenu = new Select(newDD);
        ddMenu.selectByVisibleText("New Address");
        WebElement company = driver.findElement(By.cssSelector("[id='BillingNewAddress_Company']"));
        aksiyon = aksiyonlar.moveToElement(company).click().sendKeys("TechnoStudy").build();
        aksiyon.perform();
        WebElement countryDD = driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));
        Select ddMenu2 = new Select(countryDD);
        ddMenu2.selectByVisibleText("Turkey");
        WebElement city = driver.findElement(By.cssSelector("[id='BillingNewAddress_City']"));
        aksiyon = aksiyonlar.moveToElement(city).click().sendKeys("Çanakkale").build();
        aksiyon.perform();
        WebElement address1 = driver.findElement(By.cssSelector("[id='BillingNewAddress_Address1']"));
        aksiyon = aksiyonlar.moveToElement(address1).click().sendKeys("Çanakkale/Biga").build();
        aksiyon.perform();
        WebElement pCode = driver.findElement(By.cssSelector("[id='BillingNewAddress_ZipPostalCode']"));
        aksiyon = aksiyonlar.moveToElement(pCode).click().sendKeys("17000").build();
        aksiyon.perform();
        WebElement phone = driver.findElement(By.cssSelector("[id='BillingNewAddress_PhoneNumber']"));
        aksiyon = aksiyonlar.moveToElement(phone).click().sendKeys("021651312").build();
        aksiyon.perform();
        WebElement continue1 = driver.findElement(By.cssSelector("[title='Continue'][onclick='Billing.save()']"));
        aksiyon= aksiyonlar.moveToElement(continue1).click().build();
        aksiyon.perform();
        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Continue'][onclick='Shipping.save()']")));
       // My_Func.Bekle(2);
        WebElement continue2 = driver.findElement(By.cssSelector("[title='Continue'][onclick='Shipping.save()']"));
        aksiyon= aksiyonlar.moveToElement(continue2).click().build();
        aksiyon.perform();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='button'][onclick='ShippingMethod.save()']")));
       // My_Func.Bekle(2);
        WebElement continue3 = driver.findElement(By.cssSelector("[type='button'][onclick='ShippingMethod.save()']"));
        aksiyon= aksiyonlar.moveToElement(continue3).click().build();
        aksiyon.perform();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='button'][onclick='PaymentMethod.save()']")));
        //My_Func.Bekle(2);
        WebElement continue4 = driver.findElement(By.cssSelector("[type='button'][onclick='PaymentMethod.save()']"));
        aksiyon= aksiyonlar.moveToElement(continue4).click().build();
        aksiyon.perform();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='button'][onclick='PaymentInfo.save()']")));
        //My_Func.Bekle(1);
        WebElement continue5 = driver.findElement(By.cssSelector("[type='button'][onclick='PaymentInfo.save()']"));
        aksiyon= aksiyonlar.moveToElement(continue5).click().build();
        aksiyon.perform();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='button'][onclick='ConfirmOrder.save()']")));
        // My_Func.Bekle(1);
        WebElement continue6 = driver.findElement(By.cssSelector("[type='button'][onclick='ConfirmOrder.save()']"));
        aksiyon= aksiyonlar.moveToElement(continue6).click().build();
        aksiyon.perform();
        WebElement text = driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!'] "));
        Assert.assertTrue("Test Başarısız", text.isDisplayed());
        BekleKapat();


























    }
}
