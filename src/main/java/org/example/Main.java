package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        String url = "https://ya.ru/";

        WebDriver chromeDriver = new ChromeDriver();
        openWebsite(chromeDriver, url);

        WebDriver edgeDriver = new EdgeDriver();
        openWebsite(edgeDriver, url);

        WebDriver firefoxDriver = new FirefoxDriver();
        openWebsite(firefoxDriver, url);
    }
 public static void openWebsite(WebDriver driver, String url) {
        try {
            driver.get(url);
            Thread.sleep(4500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
 }

}