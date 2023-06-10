package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver pDriver = new ChromeDriver(chromeOptions);

        pDriver.get("https://www.saucedemo.com/");
        pDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        pDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        pDriver.findElement(By.id("login-button")).click();

        pDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        pDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        pDriver.findElement(By.id("shopping_cart_container")).click();
        pDriver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        pDriver.findElement(By.id("react-burger-menu-btn")).click();
        pDriver.findElement(By.id("checkout")).click();

        pDriver.findElement(By.id("first-name")).sendKeys("Fernando");
        pDriver.findElement(By.id("last-name")).sendKeys("Pineda");
        pDriver.findElement(By.id("postal-code")).sendKeys("503");
        pDriver.findElement(By.id("continue")).click();



    }
}
