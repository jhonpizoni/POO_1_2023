package exercicio_2;


import javax.swing.JOptionPane;

public class Disciplina {

	private String nome;
	private double cargah;
	private String professor;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome:"));
		setCargah(Double.parseDouble(JOptionPane.showInputDialog("Carga horária:")));
		setProfessor(JOptionPane.showInputDialog("Professor"));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCargah() {
		return cargah;
	}
	public void setCargah(double cargah) {
		this.cargah = cargah;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	
}
