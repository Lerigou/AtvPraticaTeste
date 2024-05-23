package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

    public void testeDropdown(){
        WebElement escolaridadeCombobox = driver.findElement(By.id("elementosForm:escolaridade"));
        Select select = new Select(escolaridadeCombobox);
        select.selectByIndex(6);
    }

    public void validarDropdown(){
        Assert.assertEquals("Mestrado", new Select(driver.findElement(By.id("elementosForm:escolaridade"))).getFirstSelectedOption().getText());
    }

    public void testeSelect(){
        WebElement esportesSelect = driver.findElement(By.id("elementosForm:esportes"));
        Select select = new Select(esportesSelect);
        select.selectByVisibleText("futebol");
        select.selectByVisibleText("natacao");
        select.selectByVisibleText("karate");
//      testar com o selectByValue
//        List<WebElement> selectedOptionList = select.getAllSelectedOptions();
    }

//    public void validarSelect(){
//        List<WebElement> selectedOptionList = select.getAllSelectedOptions();
//        Assert.assertEquals("futebol", driver.findElement(By.id("elementosForm:esportes"))
//                .getAttribute("value"));
//    }
//
//    public void testeSelectMultiplo(){
//
//    }

    public void testeButtonTks(){
        driver.findElement(By.id("buttonSimple")).click();
    }

    public void validarButtonTks(){
        Assert.assertEquals("Obrigado!", driver.findElement(By.id("buttonSimple")).getAttribute("value"));
    }

    public void testeLink(){
//        driver.findElement(By.tagName("a")).click();
        driver.findElement(By.linkText("Voltar")).click();
    }

    public void validarLink(){
        Assert.assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
    }

    public void fechaNavegador(){
        driver.quit();
    }
}
