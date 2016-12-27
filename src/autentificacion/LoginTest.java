package autentificacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {

	private WebDriver driver;
	
	public LoginTest(WebDriver driver) {
		this.driver = driver;
	}

	public void autentificar(String nombreUsuario, String contrasenaUsuario) {

		// buscar el elemento con id #LoginForm_usuario para tipear nombre de
		// usuario
		this.driver.findElement(By.cssSelector("#LoginForm_usuario")).sendKeys(
				nombreUsuario);
		// buscar el elemento con id #LoginForm_password para tipear la
		// contraseña de usuario
		this.driver.findElement(By.cssSelector("#LoginForm_password")).sendKeys(
				contrasenaUsuario);
		// buscar elemento con id btnLogin para iniciar sesión
		this.driver.findElement(By.cssSelector("#btnLogin")).click();
	}
	
	public void seleccionarGrupoyPerfil(String nombreGrupo, String nombrePerfil) throws InterruptedException{
		
		Thread.sleep(1000);
		Select selectGrupo = new Select(this.driver.findElement(By.id("LoginForm_grupo")));
		selectGrupo.selectByVisibleText(nombreGrupo);
//		selectGrupo.selectByIndex(1);
//		selectGrupo.selectByValue("32");
		
		Thread.sleep(1000);
		Select selectPerfil = new Select(this.driver.findElement(By.id("profilUser")));
		selectPerfil.selectByVisibleText(nombrePerfil);
		this.driver.findElement(By.cssSelector("#btnAceptarLogin")).click();		
	}

}
