package com.contatos.aplicacao;

import java.util.Date;

import com.contatos.dao.contatosDAO;

import projeto.Contato;

public class Main {

	public static void main(String[] args) {
		
		//Instancia as duas classes para chamar os m�todos delas
		contatosDAO contatosDAO = new contatosDAO();
		Contato contato = new Contato();
	
		//Chama o m�todo inserir contato
		contato.setNome("Henrique");
		contato.setIdade(23);
		contato.setEmail("teste@gmail.com");
		contato.setDataNascimento(new Date());
		
		contatosDAO.save(contato);
	}

}
