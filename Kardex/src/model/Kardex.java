package model;

import java.util.Date;

public abstract class Kardex {

	private int id;
	private Produto produto;
	private Date data;
	private String doc;
	private int qtde;
	private double valor;

	public Kardex() {
		super();
	}

	public Kardex(int id, Produto produto, Date data, String doc, int qtde, double valor) {
		super();
		setId(id);
		setProduto(produto);
		setDoc(doc);
		setData(data);
		setQtde(qtde);
		setValor(valor);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		if (produto == null) {
			throw new IllegalArgumentException("Produto NULO não permitido");
		} else {
			this.produto = produto;
		}
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		if (doc.isBlank()) {
			throw new IllegalArgumentException("O documento não pode ter apenas espaços em branco");
		} else if ((doc.length() < 3) && (!doc.isEmpty())) {
			throw new IllegalArgumentException("O documento não pode ser menor que 3 caracteres");
		} else {
			this.doc = doc;
		}

	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		if ((qtde < 1) || (qtde > 1000)) {
			throw new IllegalArgumentException("Quantidade deve ser entre 1 e 1000");
		} else {
			this.qtde = qtde;
		}

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if ((valor < 0.01) || (valor > 10_000.00)) {
			throw new IllegalArgumentException("Valor deve ser entre 0,01 e 10.000,00 reais");
		} else {
			this.valor = valor;
		}
	}

	@Override
	public String toString() {
		return "Kardex [id=" + id + ", produto=" + produto.getNome() + ", data=" + data + ", qtde=" + qtde + ", valor="
				+ valor + "]";
	}

}
