package autentificacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conexion {

	private String nombreDriver;
	private String rutaDriver;
	private WebDriver driver;

	public Conexion(String nombreDriver, String rutaDriver) {
		this.nombreDriver = nombreDriver;
		this.rutaDriver = rutaDriver;

		// startFirefox();
		startChrome();
	}

	public void startFirefox() {
		System.setProperty(this.nombreDriver, this.rutaDriver);
		this.driver = new FirefoxDriver();
		this.driver.get("http://glasgow.ceisufro.cl/geonodoadm30/");
	}

	public void startChrome() {
		System.setProperty(this.nombreDriver, this.rutaDriver);
		this.driver = new ChromeDriver();
		this.driver.get("http://glasgow.ceisufro.cl/geonodoadm30/");
	}
	
	public WebDriver retornarDriver(){
		return this.driver;
	}

}
