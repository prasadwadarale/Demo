package com.microdream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");


        WebElement textInput = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]" ));


        textInput.sendKeys("Saucelab");


        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]"));

       searchButton.click();


       WebElement title = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div/span/a/h3"));
     title.click();

        WebElement requestDemo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/div/div[1]/div/div[4]/div[2]/a/button[2]"));

       Thread.sleep(700);





    }

}
