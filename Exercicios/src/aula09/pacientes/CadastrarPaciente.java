package aula09.pacientes;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarPaciente {

	static ArrayList<Paciente> pacientes = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Menu de Opções: ");
			System.out.println("\t1 - Incluir um paciente");
			System.out.println("\t2 - Listar pacientes");
			System.out.println("\t3 - Sair");

			System.out.print("\t\t\tOpção: ");
			int opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				digitaDados();
				break;
			case 2:
				listaDados();
				break;
			case 3:
				System.exit(0);
				break;
			}
		}

	}

	public static void listaDados() {

		for (Paciente pc : pacientes) {
			pc.listar();
		}

	}

	public static void digitaDados() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do paciente: ");
		String nome = sc.nextLine();

		System.out.print("Digite a idade do paciente: ");
		int idade = sc.nextInt();

		System.out.print("Digite o peso do paciente em kg: ");
		double peso = sc.nextDouble();

		System.out.print("Digite a altura do paciente em metros: ");
		double altura = sc.nextDouble();

		Paciente pc1 = new Paciente(nome, idade, peso, altura);
		pacientes.add(pc1);

		return;
	}

}
