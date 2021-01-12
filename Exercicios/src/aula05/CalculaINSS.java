package aula05;

import java.util.Scanner;

public class CalculaINSS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double hora;
		double valor;
		double salarioBruto;
		double valorINSS;
		double salarioLiq;


		System.out.print("Insira o valor da hora: ");
		valor = sc.nextDouble();

		System.out.print("Insira a quantidade de horas trabalhadas: ");
		hora = sc.nextDouble();

		salarioBruto = hora * valor;

		valorINSS = calculaINSS(salarioBruto);

		salarioLiq = salarioBruto - valorINSS;

		System.out.println("Salário Bruto R$" + salarioBruto);
		System.out.println("Valor do INSS R$" + valorINSS);
		System.out.println("Salário Líquido R$" + salarioLiq);

	}

	public static double calculaINSS(double base) {
		
		double aliquota = 0;
		double valorINSS;
		
		if(base > 6101.06) base = 6101.06;

		if (base <= 1045.00) {
			aliquota = (7.5 / 100);

		} else if (base <= 2089.60) {
			aliquota = (9. / 100);

		} else if (base <= 3134.40) {
			aliquota = (12.0 / 100);

		} else if (base <= 6101.06){
			aliquota = (14.0 / 100);
		}
		
		valorINSS = base * aliquota;
		
		valorINSS = Math.round ((valorINSS * 100) / valorINSS);
		
		return valorINSS;

	}

}
