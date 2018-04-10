package Notas;

import javafx.scene.web.WebEngine;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    JavascriptExecutor js;

    public BaseTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    //Método para abrir o navegador ()
    protected void AbrirNavegador(){

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://srvcta.ddns.net/sg_web/acesso.aspx?escola=3147");
    }

    //Método para fechar o navegador
    protected void FecharNavegador(){
        driver.quit();
    }

    //Método para aguardar o carregamento da tela
    protected void EsperaCarregar(long tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            String erro = e.getMessage();
            e.printStackTrace();
        }
    }

    //Rolando a tela para Baixo
    protected void RolandoTelaScrollDown(int parametro_Y){
        js.executeScript("window.scrollBy(0,"+parametro_Y+")");
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    //Rolando a tela para cima
    protected void RolandoTelaScrollUp(){
        js.executeScript("window.scrollBy(0,-250)");
    }
}
