package test;

import test.LoginTest;

public class MainChromeBrowser {

	public static void main(String[] args) throws InterruptedException{
		
		LoginTest testUsuario = new LoginTest("webdriver.chrome.driver", "C:\\Users\\wilfr\\Documents\\GitHub\\TestSeleniumDrivers\\recursosSelenium\\ChromeDriver\\chromedriver.exe");
		//LoginTest testUsuario = new LoginTest("webdriver.gecko.driver", "C:\\Users\\wilfr\\Documents\\GitHub\\TestSeleniumDrivers\\recursosSelenium\\FirefoxDriver\\geckodriver.exe");
		
		testUsuario.autentificar("Alfredo", "123456");
		//testUsuario.autentificar("testing", "123456");
		//testUsuario.seleccionarGrupoyPerfil("G1429", "Administrador IDE");//Usuario Normal
		testUsuario.seleccionarGrupoyPerfil("G1429", "Administrador de Grupo");//Usuario Administrador



	}
}
