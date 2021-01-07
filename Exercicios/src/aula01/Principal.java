package aula01;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Alô Mundo!");
		aula01.Principal.variaveis();
	}

	// imprimir as operações:
	//     soma
	//     subtração
	//     multiplicação
	//     divisão
	//
	public static void variaveis() {
		int n1,n2,total;    // criação das variáveis
		n1 = 10;			// atribuição de valores
		n2 = 3; 
		// soma
		total = n1 + n2;    // atribuição de cálculo
		System.out.println("Soma = " + total);   // saída
		// subtração
		total = n1 - n2;
		System.out.println("Subtração = " + total);
		// multiplicação
		total = n1 * n2;
		System.out.println("Multiplicação = " + total);
		// divisão
		total = n1 / n2;
		System.out.println("Divisão = " + total);
	}
	
	public static void println() {
		System.out.println("Método println da classe Principal.");
	}

}