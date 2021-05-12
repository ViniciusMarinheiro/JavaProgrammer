package aula09.pacientes;

public class Paciente {

	String nome;
	int idade;
	double peso;
	double altura;

	public Paciente(String nome, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public Paciente(String nome) {
		super();
		this.nome = nome;
	}

	public void listar() {

		System.out.println("\n------------- Dados do Paciente -------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);

		System.out.println("A classificação do paciente é " + getIMC() + "\n");

	}

	public String getIMC() {
		double imc = peso / (altura * altura);
		String classe = aula04.ClasseIMC.classeIMC(imc);
		return classe;
	}

}
