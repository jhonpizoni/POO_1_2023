package exercicio_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private String sintoma;
	private ArrayList<String> cond = new ArrayList<String>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome:"));
		setSintoma(JOptionPane.showInputDialog("Sintoma:"));
		String conds = "";
		do {
			String condicao = new String();
			condicao = JOptionPane.showInputDialog("Condição de saúde:");
			cond.add(condicao);
			conds = JOptionPane.showInputDialog("Incluir mais condições? (S ou N)");
		}while(conds.equalsIgnoreCase("S"));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public ArrayList<String> getCond() {
		return cond;
	}
	public void setCond(ArrayList<String> cond) {
		this.cond = cond;
	}
	
	
}
