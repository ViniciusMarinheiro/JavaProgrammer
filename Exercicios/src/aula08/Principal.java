package aula08;

public class Principal {

	public static void main(String[] args) {
		
		// "new" -  instanciando (criando um objeto da classe)
		
		Triangulo t1 = new Triangulo(5,3,4);	
		
		System.out.println("Per�metro do t1 = " + t1.getPerimetro());
		System.out.println("�rea do t1 = " + t1.getArea());
		
		
		Quadrado q1 = new Quadrado(5);
		System.out.println("\nPer�metro do q1 = " + q1.getPerimetro());
		System.out.println("�rea do q1 = " + q1.getArea());
		
		Retangulo r1 = new Retangulo(5, 6);
		System.out.println("\nPer�metro do r1 = " + r1.getPerimetro());
		System.out.println("�rea do r1 = " + r1.getArea());		

	}

}
