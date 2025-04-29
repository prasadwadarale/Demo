package com.microdream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

  //Login with valid phone number and password


//        WebElement phoneNumberArea= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//         phoneNumberArea.sendKeys("7411938815");
//
//     WebElement passwordAre= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre.sendKeys("cre0530!");
//
//       Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();


         //     Login with incorrect phone number and correct password


//        WebElement phoneNumberArea1= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        phoneNumberArea1.sendKeys("74119315");
//
//        WebElement passwordAre1= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre1.sendKeys("cre0530!");
//
//  Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();



       // login with correct phone number and incorrect password


//        WebElement phoneNumberArea2= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        phoneNumberArea2.sendKeys("7411938815");
//
//        WebElement passwordAre2= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre2.sendKeys("0530!");
//
//        Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();



          // login with unregistered phone number


//        WebElement phoneNumberArea3= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        phoneNumberArea3.sendKeys("9421457490");
//
//        WebElement passwordAre3= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre3.sendKeys("cre0530!");
//
//        Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();



        //leave both phone number and password filed empty


   //     WebElement phoneNumberArea4= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        phoneNumberArea4.sendKeys("");
//
//        WebElement passwordAre4= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre4.sendKeys("");
//
//        Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();


         // leave phone number field empty and enter the password


//             WebElement phoneNumberArea5= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        phoneNumberArea5.sendKeys("");
//
//        WebElement passwordAre5= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre5.sendKeys("cre0530!");
//
//        Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();



        //leave password field empty and enter phone number

 //                   WebElement phoneNumberArea6= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        phoneNumberArea6.sendKeys("7411938815");
//
//        WebElement passwordAre6= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre6.sendKeys("");
//
//        Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();



        //enter improper phone number


        //             WebElement phoneNumberArea7= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        phoneNumberArea7.sendKeys("741-193-8815");
//
//        WebElement passwordAre7= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//
//        passwordAre7.sendKeys("cre0530!");
//
//        Thread.sleep(700);
//
//        WebElement loginButton = driver.findElement(By.name("login"));
//        loginButton.click();




    }
}
