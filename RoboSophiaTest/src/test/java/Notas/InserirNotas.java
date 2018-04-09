package Notas;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.*;

public class InserirNotas extends BaseTest{


    @Before
    public void SetUp(){
        AbrirNavegador();
    }

    @After
    public void FinalizaTest(){
        FecharNavegador();
    }

    @Rule
    public TestName testName = new TestName();

    @Test
    public void inserirNotas(){

        //Acessar a área restrita clicando no link com id "comp-je9zdg8tlink"
        //driver.findElement(By.id("comp-je9zdg8tlink")).click();

        //Inserir usuário no campo de texto com id "txtCodigo" com o usuário "030"
        driver.findElement(By.id("txtCodigo")).sendKeys("030");

        //Inserir senha no campo de texto com id "txtSenha" com a senha "208955"
        driver.findElement(By.id("txtSenha")).sendKeys("208955");

        //Clicar no botão com id "btnEntrar"
        driver.findElement(By.id("btnEntrar")).click();

        //Clicar no link com id "ctl00_liNotas"
        driver.findElement(By.id("ctl00_liNotas")).click();

        //Selecionar a combo Turmas id "ctl00_ContentPlaceHolder1_turmasDropDownList_primaDropDownList" e escolher a opção de turma
        WebElement listaTurma  = driver.findElement(By.id("ctl00_ContentPlaceHolder1_turmasDropDownList_selectSpan"));
        List<WebElement>opcoes = listaTurma.findElements(By.tagName("option"));
        for (WebElement elemento:opcoes){
            String textoTurma = elemento.getText();
            if ("2º Médio A".equalsIgnoreCase(textoTurma)){
                //new Select(elemento).selectByValue(textoTurma);
                elemento.click();
                break;
            }
        }



        //Selecionar a combo Etapas id "ctl00_ContentPlaceHolder1_etapasDropDownList_primaDropDownList" e escolher a opção de etapa

        //Clicar no botão "Buscar" id "ctl00_ContentPlaceHolder1_listarButton"

        assertEquals("","");
    }

}
