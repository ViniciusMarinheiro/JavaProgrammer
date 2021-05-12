package model;

import java.util.ArrayList;

import dao.ClienteDAO;
import util.Verifica;

public class Cliente {

	private int id;
	private String cpf;
	private String nome;
	private String celular;
	private String email;
	private static ArrayList<Cliente> clientes = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(String cpf, String nome, String celular, String email) {
		super();
		setId(0);
		setCpf(cpf);
		setNome(nome);
		setCelular(celular);
		setEmail(email);
		gravar();
	}

	public Cliente(int id,String cpf, String nome, String celular, String email) {
		super();
		setId(id);
		setCpf(cpf);
		setNome(nome);
		setCelular(celular);
		setEmail(email);
	}
	
	private void gravar() {
		
		new ClienteDAO().insert(this);
	}

	public static ArrayList<Cliente> getLista() {
		
		ClienteDAO dao = new ClienteDAO();
		return dao.select();
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (Verifica.isCPF(cpf))
			this.cpf = cpf;
		else {
			throw new IllegalArgumentException("CPF inválido.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (nome.isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser vazio");
		} else if (nome.isBlank()) {
			throw new IllegalArgumentException("Nome não pode ser em branco");
		} else if (nome.length() < 5) {
			throw new IllegalArgumentException("Nome deve ter mais que 4 letras");
		} else {
			this.nome = nome;
		}
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		if (celular.isBlank()) {
			throw new IllegalArgumentException("O celular não pode ter apenas espaços em branco");
		} else if ((celular.length() != 16) && (!celular.isEmpty())) {
			throw new IllegalArgumentException("O celular deve ser no formato (xx) x xxxx-xxxx");
		} else {
			this.celular = celular;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + "]";
	}

}
