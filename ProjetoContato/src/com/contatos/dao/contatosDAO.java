package com.contatos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import projeto.ConnectionFactory;
import projeto.Contato;

public class contatosDAO {

	
	public void save(Contato contato) {
		
		String sql = "INSERT INTO contatos(nome, idade, telefone, email, dataNascimento) VALUES (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma preparedStatment, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//Adicionar valores que são esperados pela query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setInt(3, contato.getTelefone());
			pstm.setString(4, contato.getEmail());
			pstm.setDate(5, (Date) contato.getDataNascimento());
			
			pstm.execute();
			
			System.out.println("Contato salvo com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm!=null) {
					pstm.close();
				}
				
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
