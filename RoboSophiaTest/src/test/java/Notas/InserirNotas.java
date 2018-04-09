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
        AbrirNavegador("chrome");
    }

    @After
    public void FinalizaTest(){
        FecharNavegador();
    }


    @Rule
    public TestName testName = new TestName();

    @Test
    public void inserirNotas(){



        assertEquals("","");
    }

}
