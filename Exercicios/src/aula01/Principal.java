package aula01;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Al� Mundo!");
		aula01.Principal.variaveis();
	}

	// imprimir as opera��es:
	//     soma
	//     subtra��o
	//     multiplica��o
	//     divis�o
	//
	public static void variaveis() {
		int n1,n2,total;    // cria��o das vari�veis
		n1 = 10;			// atribui��o de valores
		n2 = 3; 
		// soma
		total = n1 + n2;    // atribui��o de c�lculo
		System.out.println("Soma = " + total);   // sa�da
		// subtra��o
		total = n1 - n2;
		System.out.println("Subtra��o = " + total);
		// multiplica��o
		total = n1 * n2;
		System.out.println("Multiplica��o = " + total);
		// divis�o
		total = n1 / n2;
		System.out.println("Divis�o = " + total);
	}
	
	public static void println() {
		System.out.println("M�todo println da classe Principal.");
	}

}