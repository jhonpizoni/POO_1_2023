package desafio_livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {

	private String titulo;
	private double preco;
	private int numautores;
	private String autor;
	
	void cadastrar() {
		setTitulo (JOptionPane.showInputDialog("Titulo:"));
		setPreco (Double.parseDouble(JOptionPane.showInputDialog("Preço:")));
		setNumautores (Integer.parseInt("Número de autores:"));
		setAutor (JOptionPane.showInputDialog("Nome do autor:"));
	}


	public int getNumautores() {
		return numautores;
	}

	public void setNumautores(int numautores) {
		this.numautores = numautores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
