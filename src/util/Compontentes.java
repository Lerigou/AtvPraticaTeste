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
    public Select combo;

    public void incializa(){
        String chromeDriver = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Drivers/componentes.html");
    }

    public void testeTextField(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Marcia");
    }

    public void validaTextField(){
        Assert.assertEquals("Marcia", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testeTextFieldSobrenome(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Ravadelli");
    }

    public void validaTextFieldSobrenome(){
        Assert.assertEquals("Ravadelli", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    public void testeTextArea(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Não tenho sugestões");
    }

    public void validaTextArea(){
        Assert.assertEquals("Não tenho sugestões",driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
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
        select.selectByIndex(4);
    }

    public void validarDropdown() {
        Assert.assertEquals("Superior", new Select(driver.findElement(By.id("elementosForm:escolaridade"))).getFirstSelectedOption().getText());
    }


    public void testeSelect(){
        WebElement esportesCombobox = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(esportesCombobox);
        combo.selectByVisibleText("Corrida");
    }

    public void validarSelect(){
        List<WebElement> allSelectOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(1, allSelectOptions.size());
    }

    public void testeButtonTks(){
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void validarButtonTks(){
        Assert.assertEquals("Obrigado!", driver.findElement(By.id("buttonSimple")).getAttribute("value"));
    }

    public void testeButtonCadastro(){
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void validarButtonCadastro(){
// aqui eu digo se o resultado é diferente de Status: Nao cadastrado
        Assert.assertNotEquals("Status: Nao cadastrado", driver.findElement(By.id("resultado")).getText());
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

//    Trabalho avaliativo
    public void validarCadastro(){
        String resultado = driver.findElement(By.id("resultado")).getText();
        Assert.assertTrue("O cadastro não foi realizado corretamente.", resultado.contains("Cadastrado!"));

        Assert.assertTrue(resultado.contains("Nome: Marcia"));
        Assert.assertTrue(resultado.contains("Sobrenome: Ravadelli"));
        Assert.assertTrue(resultado.contains("Sexo: Feminino"));
        Assert.assertTrue(resultado.contains("Comida: Frango"));
        Assert.assertTrue(resultado.contains("Escolaridade: superior"));
        Assert.assertTrue(resultado.contains("Esportes: Corrida"));
        Assert.assertTrue(resultado.contains("Sugestoes: Não tenho sugestões"));
    }
}
