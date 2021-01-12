package aula05;

import java.util.Scanner;

public class CalculaIRPF {
	
	/*Entrada e saída de dadso 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hora;
		double valor;
		double salarioBruto;
		double valorIR;
		double salarioLiq;

		System.out.print("Insira o valor da hora: ");
		valor = sc.nextDouble();
		
		System.out.print("Insira a quantidade de horas trabalhadas: ");
		hora = sc.nextDouble();
		
		salarioBruto = hora * valor;
		
		valorIR = calculaIR(salarioBruto);
		
		salarioLiq = salarioBruto - valorIR;
		
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("Valor do IRPF: R$" + valorIR);
		System.out.println("Salário Bruto: R$" + salarioLiq);
				
	}
	
	public static double calculaIR(double base) {
		
		double aliquota = 0;
		double parcelaDeduzir = 0;
		double valorIR = 0;
		
		if (base <= 1903.98) {
			aliquota = 0;
			parcelaDeduzir = 0;
			
		} else if (base >= 1903.98 && base <= 2826.65) {
			aliquota = 7.5/100;
			parcelaDeduzir = 142.8;
			
		} else if (base >= 2826.66 && base <= 3751.05) {
			aliquota = 15/100;
			parcelaDeduzir = 354.8;
			
		} else if (base >= 3751.05 && base <= 4664.68) {
			aliquota = 22.5/100;
			parcelaDeduzir = 636.13;
			
		} else if (base > 664.68){
			aliquota = 27.5/100;
			parcelaDeduzir = 869.36;
		}
		
		valorIR = base * aliquota - parcelaDeduzir;
		valorIR = Math.round(valorIR*100) / 100.0;
		return valorIR;	
		
	}
	
}
