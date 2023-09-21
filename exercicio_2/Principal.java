package exercicio_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Principal {

	private static ArrayList<Professor> professores = new ArrayList<Professor>();
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar professor\n"
				+ "2 - Cadastrar aluno\n"
				+ "3 - Cadastrar disciplina\n"
				+ "4 - Matricular\n"
				+ "5 - Informar notas\n"
				+ "6 - Listar disciplina com média\n"
				+ "7 - Listar disciplinas lecionadas por professores pós graduados\n\n"
				+ "8 - Sair";
		
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if(op == 1) {
				Professor p = new Professor();
				p.cadastrar();
				professores.add(p);
				}
			if(op == 2) {
				Aluno a = new Aluno();
				a.cadastrarAluno();
				alunos.add(a);
			}
			if(op == 3) {
				Disciplina d = new Disciplina();
				d.cadastra();
				disciplinas.add(d);
			}
	
		}while(op != 8);
}
	}

