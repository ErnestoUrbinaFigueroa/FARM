package cl.nerv.think_tank;

public class FiguraGeometrica {
	private double area;
	private double perimetro;
	private int cantidadLados;

	public FiguraGeometrica() {
		this.area = 0;
		this.perimetro = 0;
		this.cantidadLados = 0;
	}

	public FiguraGeometrica(int cantidadLados) {
		this.cantidadLados = cantidadLados;
	}

	public String obtenerArea() {
		return "El area de la figura es: " + this.area;
	}

	public String obtenerPerimetro() {
		return "El perimetro de la figura es: " + this.perimetro;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return this.area;
	}

	public double getPerimetro() {
		return this.perimetro;
	}

}
