package exercicio_2;

import javax.swing.JOptionPane;

public class Aluno {

	private String nome;
	private double n1, n2, n3;
	
	public void cadastrarAluno() {
		setNome(JOptionPane.showInputDialog("Nome"));
		setN1(Double.parseDouble(JOptionPane.showInputDialog("Primeira nota")));
		setN2(Double.parseDouble(JOptionPane.showInputDialog("Segunda nota")));
		setN2(Double.parseDouble(JOptionPane.showInputDialog("Terceira nota")));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	}
	
	



