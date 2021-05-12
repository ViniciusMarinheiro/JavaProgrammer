package aula08;

public class Triangulo {

	double a;
	double b;
	double c;

	public Triangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	/**
	 * Calcula o per�metro do triangulo.
	 * 
	 * @return o per�metro do triangulo
	 */
	public double getPerimetro() {
		double perimetro = a + b + c;
		return perimetro;
	}

	/**
	 * Calcula a �rea do triangulo pelo m�todo de Her�n.
	 * 
	 * @return a �rea do triangulo
	 */
	public double getArea() {
		double p = (a + b + c) / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}

}
