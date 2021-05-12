package aula08;

/*Implementar a classe retangulo com:
	 * 		contrutor: recebe base e altura
	 * 		getPerimetro(); 2 * (base + altura)
	 * 		getArea(); lado * lado
	 */

public class Retangulo {
	double base;
	double altura;

	public Retangulo(double a, double b) {
		altura = a;
		base = b;

	}
	
	public double getArea() {
		return base * altura;
	}
	
	public double getPerimetro() {
		return (2 * (base + altura));
		
	}

}
