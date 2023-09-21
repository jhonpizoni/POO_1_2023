package exercicio_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	private static ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	public static void main(String[] args) {


		String menu = "1 - Cadastrar medicamento\n"
				+ "2 - Cadastrar pessoa\n"
				+ "3 - Prescrever\n"
				+ "4 - Listar pessoas e seus medicamentos\n\n"
				+ "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if(op == 1) {
				Medicamento med = new Medicamento();
				med.cadastrar();
				medicamentos.add(med);
				}
			if(op == 2) {
				Pessoa p = new Pessoa();
				p.cadastra();
				pessoas.add(p);
			}
	
		}while(op != 5);
}
}