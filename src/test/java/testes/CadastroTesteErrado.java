package testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CadastroTesteErrado {
    WebDriver driver = null;

    @Test
    public void validarObrigatoriedadeCampoPosition(){
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.soapui.org/downloads/thank-you-for-downloading-soapui.html");
        driver.findElement(By.id("Email")).sendKeys("teste@teste.com");
        driver.findElement(By.id("FirstName")).sendKeys("Lucilene");
        driver.findElement(By.id("LastName")).sendKeys("SoftDesign");
        driver.findElement(By.id("Company")).sendKeys("SoftDesign");
        //TO DO
        // driver.findElement(By.id("Position_Role__c")).;
        driver.findElement(By.className("mktoButton")).click();
    }

    @Test
    public void validarObrigatoriedadeCampoCountry(){
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.soapui.org/downloads/thank-you-for-downloading-soapui.html");
        driver.findElement(By.id("Email")).sendKeys("teste@teste.com");
        driver.findElement(By.id("FirstName")).sendKeys("Lucilene");
        driver.findElement(By.id("LastName")).sendKeys("SoftDesign");
        driver.findElement(By.id("Company")).sendKeys("SoftDesign");
        //TO DO
        // driver.findElement(By.id("Position_Role__c")).;
        driver.findElement(By.className("mktoButton")).click();
    }
}
