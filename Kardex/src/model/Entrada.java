package model;

import java.util.Date;

import javax.swing.table.DefaultTableModel;

import dao.EntradasDAO;
import util.Converte;

public class Entrada extends Kardex {

	private Fornecedor fornecedor;

	public Entrada(Produto produto, Fornecedor fornecedor, Date data, String doc, int qtde, double valor) {
		super(0, produto, data, doc, qtde, valor);
		setFornecedor(fornecedor);
		gravar();
		produto.entrada(this);
	}

	public Entrada(int id, Produto produto, Fornecedor fornecedor, Date data, String doc, int qtde, double valor) {
		super(id, produto, data, doc, qtde, valor);
		setFornecedor(fornecedor);
		produto.entrada(this);
	}

	private void gravar() {
		new EntradasDAO().insert(this);
	}

	public static Entrada getEntrada(int id) {
		Entrada e = new EntradasDAO().select(id);
		return e;
	}

	public void update() {
		new EntradasDAO().update(this);
	}

	public void delete() {
		new EntradasDAO().delete(this);
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		if (fornecedor == null) {
			throw new IllegalArgumentException("Fornecedor não pode ser nulo!");
		}
		this.fornecedor = fornecedor;
	}

	public static DefaultTableModel getTableModel() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("ID");
		modelo.addColumn("Produto");
		modelo.addColumn("Fornecedor");
		modelo.addColumn("Data");
		modelo.addColumn("Docto");
		modelo.addColumn("Qtde");
		modelo.addColumn("Valor");
		EntradasDAO dao = new EntradasDAO();
		for (Entrada e : dao.select()) {
			String[] row = { String.valueOf(e.getId()), e.getProduto().getNome(), e.getFornecedor().getNome(),
					Converte.date2dmy(e.getData()), e.getDoc(), String.valueOf(e.getQtde()),
					String.valueOf(e.getValor()) };
			modelo.addRow(row);
		}
		return modelo;
	}

	@Override
	public String toString() {
		return "Entrada [id=" + getId() + ", produto=" + getProduto().getNome() + ", fornecedor=" + fornecedor.getNome()
				+
				// ", data=" + getData() +
				", qtde=" + getQtde() + ", valor=" + getValor() + "]";
	}

}
