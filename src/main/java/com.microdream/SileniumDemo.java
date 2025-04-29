package com.microdream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SileniumDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");



        WebElement textInput = driver.findElement(By.xpath("//*[@id=\"my-text-id\"]"));

        textInput.sendKeys("Shivprasad");
        Thread.sleep(700);

        WebElement passwordAre = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));

        passwordAre.sendKeys("7411");

        Thread.sleep(700);

        WebElement textArea = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[3]/textarea"));

        textArea.sendKeys("Hii im shivprasad");

        Thread.sleep(700);

        WebElement dropDown = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select"));

        dropDown.click();

        dropDown.isSelected();

        WebElement submitButton= driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button"));

        submitButton.click();

















//       driver.get("https://www.google.com/");
//
//WebElement googleTextArea = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//
//googleTextArea.sendKeys("Mumbai city marin drive pics");
//
//WebElement googleSearchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
//
//googleSearchButton.click();
//
//Thread.sleep(8689939);


//
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//
//        driver.getTitle();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//
//        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"my-text-id\"]"));
//
//        textBox.sendKeys("Siva prasad");
//
//
//        WebElement passwordElement = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));
//        passwordElement.sendKeys("siva");
//
//        WebElement submitButton = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button"));
//
//        Thread.sleep(800);
//
//        submitButton.click();
//
//
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        message.getText();
//
//        driver.quit();





















    }
}