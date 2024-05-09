package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compontentes {

    private WebDriver driver;

    public void incializa(){
        String chromeDriver = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Drivers/componentes.html");
    }

    public void testeTextField(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
    }

    public void validaTextField(){
        Assert.assertEquals("Batatinha", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testeTextArea(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("batatinha batatinha batatinha");
    }

    public void validaTextArea(){
        Assert.assertEquals("batatinha batatinha batatinha",driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    public void testeCheckbox(){
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
    }

    public boolean validarCheckbox(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
        return true;
    }

    public void testeRadio(){
        driver.findElement(By.id("elementosForm:sexo:1")).click();
    }

    public boolean validarRadio(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
        return true;
    }

    public void fechaNavegador(){
        driver.quit();
    }
}
