package controller;

import java.util.ArrayList;
import java.util.Date;

import model.Cliente;
import model.Entrada;
import model.Fornecedor;
import model.Kardex;
import model.Produto;
import model.Saida;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = seedProduto();
		Produto p = produtos.get(2);

		
		/*
		 * alterar fornecedor e cliente
		 * para gerar 3 registros de cada
		 */
		ArrayList<Fornecedor> fornecedores = seedFornecedor();
		Fornecedor f = fornecedores.get(0);
		
		ArrayList<Cliente> clientes = seedCliente();
		Cliente c = clientes.get(0);
		
		System.out.println(p + "\n");
		Entrada e = seedEntrada(p, f);
		System.out.println(e);
		System.out.println(p + "\n");
		Saida s = seedSaida(p, c);
		System.out.println(s);
		System.out.println(p);

	}

	public static Saida seedSaida(Produto p, Cliente c) {
		int id = 1;
		Date data = new Date("21/01/2021");
		String doc = "NF 888";
		int qtde = 5;
		double valor = 450.00;

		Saida s = new Saida(id, p, c, data, doc, qtde, valor);

		return s;

	}

	public static Entrada seedEntrada(Produto p, Fornecedor f) {

		int id = 1;
		Date data = new Date("20/01/2021");
		String doc = "NF 999";
		int qtde = 20;
		double valor = 350.00;

		Entrada e = new Entrada(id, p, f, data, doc, qtde, valor);

		return e;
	}

	public static ArrayList<Cliente> seedCliente() {
		ArrayList<Cliente> lista = new ArrayList<>();
		
		int id = 1;
		String cpf = "452.005.150-92";
		String nome = "Bill Gates";
		String celular = "(11) 91234-5678)";
		String email = "gates@bill.com";

		Cliente c = new Cliente(id, cpf, nome, celular, email);
		lista.add(c);
		
		lista.add( new Cliente(2,"419.901.860-33", "Ronnie Von", "(91) 99999-8888", "ronnie@von.com"));
		lista.add( new Cliente(3,"233.116.460-61", "fulano", "(16) 98888-9999", "fu@lano.com"));

		return lista;
	}

	public static ArrayList<Fornecedor> seedFornecedor() {
		ArrayList<Fornecedor> lista = new ArrayList<>();
		
		int id = 1;
		String cnpj = "94.555.714/0001-00";
		String nome = "Microsoft Corporation";
		String telefone = "1112345678";
		String email = "vendas@microsoft.com";

		Fornecedor f = new Fornecedor(id, cnpj, nome, telefone, email);
		
		lista.add(f);
		
		lista.add( new Fornecedor(02,"59.360.000/0001-45", "MSI :)", "1112345678", "msi@hardware.com"));
		lista.add( new Fornecedor(03,"10.481.999/0001-91", "GALAX", "1112345678", "galax@hardware.com"));

		
		return lista;
	}

	public static ArrayList<Produto> seedProduto() {
		
		ArrayList<Produto> lista = new ArrayList<>();
		
		int id = 1;
		String nome = "Pente de Memória 16 GB DDR4 2666Mhz";
		String localizacao = "Prateleira 3 Caixa 5";
		int qtdeMaxima = 100;
		int qtdeMinima = 20;
		int qtdeEstoque = 80;
		
		Produto p = new Produto(id, nome, localizacao, qtdeMaxima, qtdeMinima, qtdeEstoque);
		
		lista.add(p);
		
		lista.add( new Produto(2, "Teclado ABNT para Notebook", "Prateleira 4, Caixa 2", 200, 10, 10));
		lista.add( new Produto(3, "Monitor Full HD IPS 23.4", "Prateleira 7", 50, 05, 05));
		lista.add( new Produto(4, "Mouse Gamer 2400 5 botões", "Prateleira 4, Caixa 5", 200, 10, 30));
		lista.add( new Produto(2, "Headeset BM800", "Prateleira 2, Caixa 10", 100, 10, 20));

		return lista;
	}

}
