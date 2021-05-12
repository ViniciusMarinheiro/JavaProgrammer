package aula08;


/*
 * Implementar a classe quadrado com:
 * 		contrutor: recebe 1 double - lado
 * 		getPerimetro(); 4 * lado
 * 		getArea(); lado * lado
 */
public class Quadrado {
	double a;
	
	public Quadrado(double a) {
		this.a = a;
	}
	
	public double getArea() {
		double area = a * a;
		return area;
	}
	
	public double getPerimetro() {
		double perimetro = 4*a;
		return perimetro;
	}

}
