package cl.nerv.think_tank;

public class Cuadrado extends FiguraGeometrica {
	private double medidaLado;

	public Cuadrado(double medidaLado) {
		super(4);
		this.medidaLado = medidaLado;
		super.setArea(0);
		super.setPerimetro(0);
	}

}
