package desafio_livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Autor {

	private String nome;
	private String sexo;
	private int idade;
	
	void cadastrarAutor() {
		setNome (JOptionPane.showInputDialog("Nome do Autor:"));
		setSexo (JOptionPane.showInputDialog("Sexo:"));
		setIdade (Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
