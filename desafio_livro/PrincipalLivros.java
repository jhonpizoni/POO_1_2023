package desafio_livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalLivros {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		ArrayList<Autor> autores = new ArrayList<Autor>();
		String menu = "1 - Cadastrar livro\n"
				+ "2 - Cadastrar autor\n"
				+ "3 - Listar livros cadastrados\n"
				+ "4 - Listar autores\n"
				+ "5 - Pesquisar livro por preço\n"
				+ "6 - Listar livros cujo autores sejam crianças\n"
				+ "7 - Listar livros por gênero de autor\n"
				+ "8 - Sair";
		
		int op = 0;
		
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				Livro l = new Livro();
				l.cadastrar();
				livros.add(l);
	}
			if(op == 2) {
				Autor a = new Autor();
				a.cadastrarAutor();
				autores.add(a);
			}
			
		if (op == 3) {
			String result = "Livros cadastrados\n\n";
			for(Livro l: livros) {
				result += l.exibirLivros();
			}
			JOptionPane.showMessageDialog(null, result);
		}
		}while(op != 8 );
	}
}
