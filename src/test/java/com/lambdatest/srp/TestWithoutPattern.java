package com.lambdatest.srp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWithoutPattern {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C://Users//Sri Priya P Kulkarni//Softwares//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ecommerce-playground.lambdatest.io/");
        waitTime();

        driver.findElement(By.cssSelector("div[id='entry_217822'] input[placeholder='Search For Products']"))
                .sendKeys("Canon EOS 5D");

        // click on search button
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

        waitTime();

        // click on Home button
        driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();

        driver.findElement(By.cssSelector("div[id='entry_217822'] input[placeholder='Search For Products']"))
                .sendKeys("iPod Nano");

        // click on search button
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

        //click on Special button
        driver.findElement(By.xpath("//ul[@class='navbar-nav horizontal']//span[@class='title'][normalize-space()='Special']")).click();

        //print the title of the Special Page
        String actualTitle="";
        actualTitle=driver.getTitle();
        System.out.println(actualTitle);


    }
    public static void waitTime(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
