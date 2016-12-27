package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainChromeBrowser {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://glasgow.ceisufro.cl/geonodoadm30/");
		
		autentificarse(driver, "Alfredo", "123456");
		seleccionarGrupoyPerfil(driver, "G1429", "Administrador IDE");
		
		
		
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
		selectGrupo.selectByVisibleText("G1429");
		
		Thread.sleep(1000);
		Select selectPerfil = new Select(driver.findElement(By.id("profilUser")));
		selectPerfil.selectByVisibleText("Administrador IDE");
		driver.findElement(By.cssSelector("#btnAceptarLogin")).click();
	}

}
