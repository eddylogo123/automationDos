package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumImplementation.SeleniumImplementation;

public class MainPage {


    //*[@id="console"]/div[2]/div[1]/p/strong/a/span

    SeleniumImplementation seleniumImplementation;

    //@FindBy(xpath="*[@id=\"console\"]/div[2]/div[1]/p/strong/a/span")
    @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[1]/p/strong/a/span")
    WebElement btnSeleccionarOpcion;

    @FindBy(xpath="/html/body/pre")
    WebElement txtSeleccionado;




    public MainPage(WebDriver webDriver){
        //System.out.println("**********************");
        PageFactory.initElements(webDriver, this);
        seleniumImplementation = new SeleniumImplementation();
    }

    public boolean validateEmailAdress(WebDriver webDriver){
        //System.out.println("******************************* Ingresar al Metodo ********************************");
        //System.out.println("btnSeleccionarOpcion"+ btnSeleccionarOpcion.getTagName());
        seleniumImplementation.click(btnSeleccionarOpcion);
        return (seleniumImplementation.validateTextIntoText(webDriver, txtSeleccionado, "michael.lawson@reqres.in"));
        //return false;
    }

}
