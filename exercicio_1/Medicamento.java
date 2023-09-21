package exercicio_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Medicamento {

	private String nome;
	private String adm;
	private ArrayList<String> contra = new ArrayList<String>();
	private ArrayList<String> ind = new ArrayList<String>();
	
	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Nome do medicamento:"));
		setAdm(JOptionPane.showInputDialog("Administração (Oral, injetável ou tópico"));
		String continua1 = "";
		do {
			String c = new String();
			c = JOptionPane.showInputDialog("Contraindicação:");
			contra.add(c);
			continua1 = JOptionPane.showInputDialog("Incluir mais constraindicações? (S ou N)");
		}while(continua1.equalsIgnoreCase("S"));
	
		String continua2 = "";
		do {
			String i = new String();
			i = JOptionPane.showInputDialog("Indicação:");
			ind.add(i);
			continua2 = JOptionPane.showInputDialog("Incluir mais indicações? (S ou N)");
		}while(continua2.equalsIgnoreCase("S"));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAdm() {
		return adm;
	}
	public void setAdm(String adm) {
		this.adm = adm;
	}

	public ArrayList<String> getContra() {
		return contra;
	}

	public void setContra(ArrayList<String> contra) {
		this.contra = contra;
	}

	public ArrayList<String> getInd() {
		return ind;
	}

	public void setInd(ArrayList<String> ind) {
		this.ind = ind;
	}

	
}
