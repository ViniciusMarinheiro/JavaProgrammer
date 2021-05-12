package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Fornecedor;

/**
 * A clase FornecedorDAO prov� a comunica��o da classe model.fornecedor com o
 * banco de dados � respons�vel tamb�m pelo mapeamento O/R da classe.
 * 
 * @author Vinicius Marinheiro
 * @see model.Fonecedor
 * @see <a href=
 *      "http://www.conectadamente.com/pages/java/javaOOPPersistencia.html">
 *      Mapeamento Objeto Relacional </a>
 *
 */

public class FornecedorDAO {

	/**
	 * Gera a persist�ncia do fornecedor r no banco de dados.
	 * 
	 * @param r Um objeto da classe Fornecedor
	 */

	public void insert(Fornecedor r) {

		/**
		 * O Connection � respons�vel pela conex�o do banco de dados.
		 */
		Connection con = null; // conex�o com o bd
		PreparedStatement pst = null; // statement sql
		ResultSet rs = null; // retorno do bd
		String sql = "INSERT INTO fornecedor " + "(cnpj,nome,telefone,email) " + "VALUES (?,?,?,?)"; // comando para
																									// inser��o
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, r.getCnpj());
			pst.setString(2, r.getNome());
			pst.setString(3, r.getTelefone());
			pst.setString(4, r.getEmail());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con, pst, rs);
		}
	}

	/**
	 * Retorna a lista de Fornecedores cadastrados no Banco de Dados.
	 * 
	 * @return O ArrayList com objetos Fornecedor
	 */

	public ArrayList<Fornecedor> select() {
		ArrayList<Fornecedor> lista = new ArrayList<>();
		Connection con = null; // conex�o com o bd
		PreparedStatement pst = null; // statement sql
		ResultSet rs = null; // retorno do bd
		String sql = "SELECT id,cnpj,nome,telefone,email " + " FROM fornecedor";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int codigo = rs.getInt(1);
				String cnpj = rs.getString(2);
				String nome = rs.getString(3);
				String telefone = rs.getString(4);
				String email = rs.getString(5);
				lista.add(new Fornecedor(codigo, cnpj, nome, telefone, email));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con, pst, rs);
		}
		return lista;
	}

	/**
	 * Pesquisa o fornecedor com C�digo informado no Banco de Dados. Se encotrar
	 * retorna um objeto do tipo Fornecedor. Caso o c�digo n�o exista no banco de
	 * dados retorna null.
	 * 
	 * @param id
	 * @return um objeto do tipo Fornecedor
	 */

	/**
	 * Pesquisa o fornecedor com c�digo informado no banco de dados. Se encontrar,
	 * retorna um objeto do tipo Fornecedor. Caso o c�digo n�o existe no banco de
	 * dados, retorna null.
	 * 
	 * @return Um objeto do tipo Fornecedor
	 */
	public Fornecedor select(int id) {
		Fornecedor fornecedor = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT id,cnpj,nome,telefone,email " + "FROM fornecedor " + "WHERE id = ? ";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				int codigo = rs.getInt(1);
				String cnpj = rs.getString(2);
				String nome = rs.getString(3);
				String telefone = rs.getString(4);
				String email = rs.getString(5);
				fornecedor = new Fornecedor(codigo, cnpj, nome, telefone, email);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con, pst, rs);
		}
		return fornecedor;
	}

}