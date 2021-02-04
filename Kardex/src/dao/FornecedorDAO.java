package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Fornecedor;

public class FornecedorDAO {
	
	public void insert(Fornecedor r) {
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "insert into fornecedor (cnpj, nome, telefone, email) "
				+ "values (?,?,?,?) ";
		
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

}
