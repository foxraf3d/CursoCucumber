package Notas;

import com.google.common.collect.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        List<WebElement>opcoesTurma = listaTurma.findElements(By.tagName("option"));
        for (WebElement elemento:opcoesTurma){
            String textoTurma = elemento.getText();
            if ("2º Médio A".equalsIgnoreCase(textoTurma)){
                elemento.click();
                EsperaCarregar(1000);
                break;
            }
        }

        //Selecionar a combo Etapas id "ctl00_ContentPlaceHolder1_etapasDropDownList_primaDropDownList" e escolher a opção de etapa
        WebElement listaEtapas = driver.findElement(By.id("ctl00_ContentPlaceHolder1_etapasDropDownList_primaDropDownList"));
        List<WebElement>opcoesEtapas = listaEtapas.findElements(By.tagName("option"));
        for (WebElement elemento:opcoesEtapas) {
            String textoEtapa = elemento.getText();
            if ("4° bimestre".equalsIgnoreCase(textoEtapa)){
                elemento.click();
                EsperaCarregar(1000);
                break;
            }
        }

        //Clicar no botão "Buscar" id "ctl00_ContentPlaceHolder1_listarButton"
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_listarButton")).click();
        EsperaCarregar(12000);

        //Rolar a tela para baixo
        RolandoTelaScrollDown(1000);

        //Rolar a grid de notas id grid de notas = "ctl00_ContentPlaceHolder1_LancamentoTabContainer_NotasTabPanel_tbLancNotas"
        //WebElement gridNotas = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LancamentoTabContainer_NotasTabPanel"));
        List<WebElement>tb_rows = driver.findElements(By.tagName("tr"));
        for (WebElement elemento:tb_rows){
            String ele = elemento.getTagName();
        }




        assertEquals("","");
    }


}
