package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifEmailTest {
    WebDriver driver;

    //AddToCartPage page;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.get("https://reqres.in/");
        driver.manage().window().maximize();

        //*[@id="console"]/div[2]/div[1]/p/strong/a/span
        //page = new AddToCartPage(driver);

    }

    @Test
    public void validateAddoCart(){
        System.out.println("Saludos");
        //Assert.assertTrue(page.validateAddToCart(driver));
    }

}
