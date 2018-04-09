package Notas;

import BaseTest.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

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


        //Inserir usuário no campo de texto com id "txtCodigo"


        //Inserir senha no campo de texto com id "txtSenha"


        //Clicar no botão com id "btnEntrar"

        //Clicar no link com id "ctl00_liNotas"

        //

        assertEquals("","");
    }

}
