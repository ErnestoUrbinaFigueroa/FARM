package cl.empresa.qa.pages.sistema_horarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class LoginPage {
	// atributos
	private WebDriver driver;
	private ExtentTest test;
	private Boolean TAKE_SS;

	private By usuario;
	private By clave;
	private By botonIngresar;
	private By botonCancelar;

	// constructor
	public LoginPage(WebDriver driver, ExtentTest test, Boolean TAKE_SS) {
		// variables necesarias para la creación de reportes
		this.driver = driver;
		this.test = test;
		this.TAKE_SS = TAKE_SS;

		this.usuario = null;
		this.clave = null;
		this.botonIngresar = null;
		this.botonCancelar = null;

		this.usuario = By.id("ingreso_correo");
		this.clave = By.id("ingreso_clave");
		this.botonIngresar = By.xpath("//button[@type='submit']");
	}

	// metodos
	public void ingresarUserPass(String user, String pass, String subDir) {
		// TODO aca agregaremos el comportamiento correspondiente al ingreso
	}

	public void cancelarLogin() {
		// TODO aca agregaremos el comportamiento correspondiente a la cancelacion del
		// login
	}

	public void assertLoginCorrecto() {
		// TODO construir el assert de la validación del test
	}

}
