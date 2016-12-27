package test;

import autentificacion.Conexion;
import autentificacion.LoginTest;
import org.openqa.selenium.WebDriver;

public class MainChromeBrowser {

	public static void main(String[] args) throws InterruptedException{
		
		Conexion conexion = new Conexion("webdriver.chrome.driver", "C:\\Users\\wilfr\\Documents\\GitHub\\TestSeleniumDrivers\\recursosSelenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = conexion.retornarDriver();
		
		LoginTest login = new LoginTest(driver);
		login.autentificar("Alfredo", "123456");
		login.seleccionarGrupoyPerfil("G1429", "Administrador IDE");
		
//		GestionAdmin admin = new GestionAdmin(driver);
//		admin.


	}
	
}
