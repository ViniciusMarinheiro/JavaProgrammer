package aula05;

import java.util.Scanner;

public class ResumoFolha {
	
	/* leia nome, valor da hora, qntd de horas trabalhadas
	 * sa�da: resumo da folha
	 * Exemplo:
	 * 		Nome: 
	 * 		Sal�rio Bruto:
	 * 		INSS:
	 * 	 	IRPF:
	 * 		Sal�rio L�quido: 
	 * Equa��es:
	 * 		salarioBruto  = valorHora * qtdHoras
	 * 		salarioLiquido = salarioBruto - valorINSS - valorIRPF
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double hora;
		double valor;
		double salarioBruto;
		double valorINSS;
		double valorIR;
		double salarioLiq;
		
		

		System.out.print("Digite o nome do funcion�rio: ");
		nome = sc.nextLine();

		System.out.print("Insira o valor da hora: ");
		valor = sc.nextDouble();

		System.out.print("Insira a quantidade de horas trabalhadas: ");
		hora = sc.nextDouble();

		salarioBruto = hora * valor;

		valorINSS = CalculaINSS.calculaINSS(salarioBruto);

		valorIR =  CalculaIRPF.calculaIR(salarioBruto - valorINSS);
		
		salarioLiq = salarioBruto - valorINSS - valorIR;

		System.out.println("Out: " + "\n \tNome: " + nome);
		System.out.println("\tSal�rio Bruto R$" + salarioBruto);
		System.out.println("\tValor do INSS R$" + valorINSS);
		System.out.println("\tValor do IRPF R$" + valorIR);
		System.out.println("\tSal�rio L�quido R$" + salarioLiq);
		
		
		
	}

}
