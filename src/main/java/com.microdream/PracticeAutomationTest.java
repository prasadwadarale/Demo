package com.microdream;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PracticeAutomationTest {


    @Test
    public void testValidateUserNameAndPassword() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        //valid user name and valid password

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("student");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Password123");

        Thread.sleep(800);

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton.click();

        Assert.assertEquals(userName.getText(),"student");
        Assert.assertEquals(password.getText(),"Password123");

        WebElement logOutButton = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
        logOutButton.click();
        driver.close();
    }



    //valid user name and invalid password
    @Test
    public void invalidPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");




        WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("student");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Password123");

        Thread.sleep(800);

        Assert.assertEquals(userName.getText(),"student");
        Assert.assertEquals(password.getText(),"Password123");

        WebElement submitButton1 = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton1.click();
        driver.close();
    }


// invalid user name and valid password
@Test
public void invalidUser() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");


        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("student");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Password123");

    Assert.assertEquals(userName.getText(),"student");
    Assert.assertEquals(password.getText(),"Password123");

    WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    submitButton.click();
    driver.close();
}

//valid user name and blank password
@Test
public void blankPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("student");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("");

    Assert.assertEquals(userName.getText(),"student");
    Assert.assertEquals(password.getText(),"Password123");

    WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    submitButton.click();
    driver.close();
}

// blank user name and valid password
@Test
public void blankUser() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Password123");

    Assert.assertEquals(userName.getText(),"student");
    Assert.assertEquals(password.getText(),"Password123");

    WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    submitButton.click();
    driver.close();
}

//invalid user name and blank password
@Test
public void invalidUserBlankPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("addff");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("");

    Assert.assertEquals(userName.getText(),"student");
    Assert.assertEquals(password.getText(),"Password123");

    WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    submitButton.click();
    driver.close();
}

// blank user name and invalid password
@Test
public void BlankUserInvalidPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("123");

    Assert.assertEquals(userName.getText(),"student");
    Assert.assertEquals(password.getText(),"Password123");

    WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    submitButton.click();
    driver.close();
}

//blank user name amd blank password
@Test
public void blankUserAndPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("");

    Assert.assertEquals(userName.getText(),"student");
    Assert.assertEquals(password.getText(),"Password123");

    WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    submitButton.click();
    driver.close();
}

}



