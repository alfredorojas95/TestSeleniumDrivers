package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {

	private WebDriver driver;
	private String nombreDriver;
	private String rutaDriver;

	public LoginTest(String nombreDriver, String rutaDriver) {
		this.nombreDriver = nombreDriver;
		this.rutaDriver = rutaDriver;
		
		//startFirefox();
		startChrome();
	}

	public void startFirefox() {
		System.setProperty(this.nombreDriver, this.rutaDriver);
		driver = new FirefoxDriver();
		driver.get("http://glasgow.ceisufro.cl/geonodoadm30/");
	}
	
	public void startChrome() {
		System.setProperty(this.nombreDriver, this.rutaDriver);
		driver = new ChromeDriver();
		driver.get("http://glasgow.ceisufro.cl/geonodoadm30/");
	}

	public void autentificar(String nombreUsuario, String contraseñaUsuario) {

		// buscar el elemento con id #LoginForm_usuario para tipear nombre de
		// usuario
		driver.findElement(By.cssSelector("#LoginForm_usuario")).sendKeys(
				nombreUsuario);
		// buscar el elemento con id #LoginForm_password para tipear la
		// contraseña de usuario
		driver.findElement(By.cssSelector("#LoginForm_password")).sendKeys(
				contraseñaUsuario);
		// buscar elemento con id btnLogin para iniciar sesión
		driver.findElement(By.cssSelector("#btnLogin")).click();
	}
	
	public void seleccionarGrupoyPerfil(String nombreGrupo, String nombrePerfil) throws InterruptedException{
		
		Thread.sleep(1000);
		Select selectGrupo = new Select(driver.findElement(By.id("LoginForm_grupo")));
		selectGrupo.selectByVisibleText(nombreGrupo);
//		selectGrupo.selectByIndex(1);
//		selectGrupo.selectByValue("32");
		
		Thread.sleep(1000);
		Select selectPerfil = new Select(driver.findElement(By.id("profilUser")));
		selectPerfil.selectByVisibleText(nombrePerfil);
		driver.findElement(By.cssSelector("#btnAceptarLogin")).click();
	

		
	}

}
