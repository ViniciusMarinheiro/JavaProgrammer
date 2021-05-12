package aula09.agenda;

public class Agenda {

	String nome;
	String telefone;
	String email;

	public Agenda(String nome, String telefone, String email) {

		this.nome = nome;
		this.telefone = telefone;
		this.email = email;

	}

	public Agenda(String nome, String telefone) {

		this.nome = nome;
		this.telefone = telefone;
	}

	public void incluir() {

	}

	public void listar() {
		
		System.out.println("\n------------- Dados do Contato -------------");
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("--------------------------------------------\n");

	}

}
