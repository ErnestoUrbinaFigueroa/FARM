package cl.empresa.pages.sistema_horario;

import org.openqa.selenium.By;

public class LoginPage {
	// atributos
	private By usuario;
	private By clave;
	private By botonIngresar;
	private By botonCancelar;

	// constructor
	LoginPage() {
		this.usuario = null;
		this.clave = null;
		this.botonIngresar = null;
		this.botonCancelar = null;
	}

	// metodos
	public void ingresarUserPass(String user, String pass) {
		// TODO aca agregaremos el comportamiento correspondiente al ingreso
	}

	public void cancelarLogin() {
		// TODO aca agregaremos el comportamiento correspondiente a la cancelacion del
		// login
	}

}
