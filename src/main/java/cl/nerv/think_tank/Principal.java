package cl.nerv.think_tank;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Ejecutando al main.");
		FiguraGeometrica figura = new Cuadrado(4);

		System.out.println(figura.obtenerArea());
		System.out.println(figura.obtenerPerimetro());

		int valor;
		Random aleatorio = new Random();
		while ((valor = aleatorio.nextInt(20)) != 4) {
			System.out.println(valor);
		}

	}

}
