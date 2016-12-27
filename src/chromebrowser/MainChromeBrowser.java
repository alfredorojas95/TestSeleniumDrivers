package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MainChromeBrowser {

	public static void main(String[] args) throws InterruptedException{
	
		//Driver para Firefox ----------------------------------------------
		System.setProperty("webdriver.gecko.driver","C:\\Users\\wilfr\\Documents\\GitHub\\TestSeleniumDrivers\\recursosSelenium\\FirefoxDriver\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("http://glasgow.ceisufro.cl/geonodoadm30/");
		//--------------------------------------------------------------------
		
		//driver para Google Chrome-------------------------------------------
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\wilfr\\Documents\\GitHub\\TestSeleniumDrivers\\recursosSelenium\\ChromeDriver\\chromedriver.exe");
//		WebDriver driverChrome = new ChromeDriver();
//		driverChrome.get("http://glasgow.ceisufro.cl/geonodoadm30/");
		//-------------------------------------------------------------------
		
		autentificarse(driverFirefox, "Alfredo", "123456");
		seleccionarGrupoyPerfil(driverFirefox, "G1429", "Administrador IDE");
		
		
		
	}
	
	public static void autentificarse(WebDriver driver, String nombreUsuario, String contraseñaUsuario){
		
		//buscar el elemento con id #LoginForm_usuario para tipear nombre de usuario
		driver.findElement(By.cssSelector("#LoginForm_usuario")).sendKeys(nombreUsuario);
		//buscar el elemento con id #LoginForm_password para tipear la contraseña de usuario
		driver.findElement(By.cssSelector("#LoginForm_password")).sendKeys(contraseñaUsuario);
		//buscar elemento con id btnLogin para iniciar sesión
		driver.findElement(By.cssSelector("#btnLogin")).click();
	}
	
	public static void seleccionarGrupoyPerfil(WebDriver driver, String nombreGrupo, String nombrePerfil) throws InterruptedException{
		
		Select selectGrupo = new Select(driver.findElement(By.id("LoginForm_grupo")));
		//selectGrupo.selectByVisibleText(nombreGrupo);
		selectGrupo.selectByValue("32");
		
		Thread.sleep(1000);
		Select selectPerfil = new Select(driver.findElement(By.id("profilUser")));
		selectPerfil.selectByVisibleText(nombrePerfil);
		driver.findElement(By.cssSelector("#btnAceptarLogin")).click();
	}

}
