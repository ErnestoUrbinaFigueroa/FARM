package cl.nerv.think_tank;

public class Cuadrado extends FiguraGeometrica {
	private double medidaLado;

	public Cuadrado(double medidaLado) {
		super(4);
		this.medidaLado = medidaLado;
		super.setArea(medidaLado * medidaLado);
		super.setPerimetro(medidaLado * 4);
	}

	public String obtenerArea() {
		return "El area del cuadrado es: " + this.getArea();
	}

	public String obtenerPerimetro() {
		return "El perimetro del cuadrado es: " + this.getPerimetro();
	}

}
