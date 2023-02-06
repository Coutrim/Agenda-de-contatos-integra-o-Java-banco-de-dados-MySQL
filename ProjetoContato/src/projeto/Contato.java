package projeto;

import java.util.Date;

import com.contatos.dao.contatosDAO;


public class Contato {
	public int idade;
	public String nome;
	public int telefone;
	public String email;
	public Date dataNascimento;
	
	contatosDAO contatosDAO = new contatosDAO();

	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date date) {
		this.dataNascimento = date;
	}
	
	public void inserirContato() {
		
	}	
	public void listarContato() {
		
	}
	
	public void deleteContato() {
		
	}
	
	public void atualizarContato(){
		
	}
	

}
