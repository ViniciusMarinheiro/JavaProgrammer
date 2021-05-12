package model;

import java.util.Date;

import javax.swing.table.DefaultTableModel;

import dao.SaidasDAO;
import util.Converte;

public class Saida extends Kardex {

	private Cliente cliente;

	public Saida() {
		super();
	}

	public Saida(int id, Produto produto, Cliente cliente, Date data, String doc, int qtde, double valor) {

		super(id, produto, data, doc, qtde, valor);
		setCliente(cliente);
		produto.saida(this);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		if (cliente == null) {
			throw new IllegalArgumentException("Cliente não pode ser nulo!");
		}
		this.cliente = cliente;
	}

	public static DefaultTableModel getTableModel() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("ID");
		modelo.addColumn("Produto");
		modelo.addColumn("Cliente");
		modelo.addColumn("Data");
		modelo.addColumn("Docto");
		modelo.addColumn("Qtde");
		modelo.addColumn("Valor");
		SaidasDAO dao = new SaidasDAO();
		for (Saida e: dao.select()) {
			String[] row = { String.valueOf(e.getId()),
							 e.getProduto().getNome(),
							 e.getCliente().getNome(),
							 Converte.date2dmy(e.getData()),
							 e.getDoc(),
							 String.valueOf(e.getQtde()),
							 String.valueOf(e.getValor())
							};
			modelo.addRow(row);
		}
		return modelo;
	}
	
	public String toString() {
		return "Saida [id=" + getId() + ", produto=" + getProduto().getNome() + ", data=" + getData() + ", qtde=" + getQtde()
				+ ", valor=" + getValor() + ", Cliente=" + getCliente().getNome() + "]";
	}

}
