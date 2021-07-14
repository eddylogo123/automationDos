package com.automationpractice.test;

import com.automationpractice.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifEmailTest {

    WebDriver webDriver;
    MainPage mainPage;

    //AddToCartPage page;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://reqres.in/");
        webDriver.manage().window().maximize();
        mainPage = new MainPage(webDriver);
    }

    @Test
    public void validateAddoCart(){
        System.out.println("Saludos");
        Assert.assertTrue(mainPage.validateEmailAdress(webDriver));
    }

}
