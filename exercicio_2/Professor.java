package exercicio_2;

import javax.swing.JOptionPane;

public class Professor {

	private String nome;
	private String formacao;
	
	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Nome:"));
		setFormacao(JOptionPane.showInputDialog("Formação: (1 - graduação, 2 - especialização, 3 - pós graduação"));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	
}
