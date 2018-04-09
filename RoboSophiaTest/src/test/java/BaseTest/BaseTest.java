package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    //Método para abrir o navegador ()
    public void AbrirNavegador(){

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("www.tobiasdeaguiar.com.br");
    }

    //Método para fechar o navegador
    public void FecharNavegador(){
        driver.quit();
    }

}
