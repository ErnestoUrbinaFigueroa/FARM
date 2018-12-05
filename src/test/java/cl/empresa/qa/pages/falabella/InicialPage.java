package cl.empresa.qa.pages.falabella; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class InicialPage {
	private WebDriver driver;
	private ExtentTest test;
	private Boolean TAKE_SS;

	private By buscador;
	private By inicioSesion;
	private By menuPrincipal;
	private By subMenu;

	public InicialPage(WebDriver driver, ExtentTest test, Boolean TAKE_SS) {
		this.driver = driver;
		this.test = test;
		this.TAKE_SS = TAKE_SS;

		this.buscador = null;
		this.inicioSesion = null;
	}

	public void iniciarSesion() {
		// TODO construir
	}

	public void realizarBusqueda(String objeto) {
		// TODO construir
	}

	public void seleccionarMenu(String menuPpal, String menuSec) {
		// TODO construir
	}

}
