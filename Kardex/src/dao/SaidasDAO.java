package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import model.Cliente;
import model.Produto;
import model.Saida;
import util.Converte;

public class SaidasDAO implements DAO<Saida>{

	
	/**
	 * A classe SaidaDAO provê a comunicação da classe model.Saida com o banco
	 * de dados. É responsável também pelo mapeamento O/R da classe.
	 * 
	 * @author Vinicius Marinheiro
	 * @see model.Saida
	 * @see <a href="http://conectadamente.com/pages/java/javaOOPPersistencia.html">
	 *      Mapeamento Objeto Relacional</a>
	 * 
	 */
	@Override
	public void insert(Saida r) {
	
		Connection con = null; // conexão com o bd
		PreparedStatement pst = null; // statement sql
		ResultSet rs = null; // retorno do bd
		String sql = "INSERT INTO Saida " + 
					 "(Produto_id, Fornecedor_id ,data, doc, qtde, valor) " + 
					 "VALUES (?,?,?,?,?,?) ";																							// inserção
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setInt(1, r.getProduto().getId());
			pst.setInt(2, r.getCliente().getId());
			pst.setString(3, Converte.date2bd(r.getData()));
			pst.setString(4, r.getDoc());
			pst.setInt(5, r.getQtde());
			pst.setDouble(6, r.getValor());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con, pst, rs);
		}
		
	}
	
	/**
	 * Retorna lista de entradas
	 * no banco de dados.
	 * @param r Um objeto da classe Saida
	 */
	

	@Override
	public ArrayList<Saida> select () {
		ArrayList<Saida> lista = new ArrayList<>();
		Connection con = null;  // conexão com o bd
		PreparedStatement pst = null;  // statement sql
		ResultSet rs = null;  // retorno do bd
		String sql = "SELECT id, Produto_id, Fornecedor_id ,data, doc, qtde, valor " +
					 " FROM Saida ";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				int codProduto = rs.getInt(2);
				int codCliente = rs.getInt(3);
				String dtStr = rs.getString(4);
				Date data = Converte.str2date(dtStr);
				String doc = rs.getString(5);
				int qtde = rs.getInt(6);
				double valor = rs.getDouble(7);
				Produto produto = new ProdutoDAO().select(codProduto);
				Cliente cliente = new ClienteDAO().select(codCliente);
				
				lista.add(new Saida(id,produto,cliente,data,doc,qtde, valor));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		return lista;
		
	}

}
