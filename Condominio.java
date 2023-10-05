package exercicio_condominio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Condominio {

	private ArrayList<Apartamento> aps = new ArrayList<Apartamento>();
	private ArrayList<Despesa> despesas = new ArrayList<Despesa>();

	
	
	public void cadastraApartamento() {
		Apartamento ap = new Apartamento();
		ap.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número do apartamento:")));
		ap.setBloco(JOptionPane.showInputDialog("Bloco:"));
		ap.setMetros(Double.parseDouble(JOptionPane.showInputDialog("Metros quadrados do apartamento:")));
		ap.setProprietario(JOptionPane.showInputDialog("Nome do proprietário:"));
		aps.add(ap);
}
	public void cadastrarDespesa() {
		Despesa d = new Despesa();
		d.setNome(JOptionPane.showInputDialog("Nome da despesa:"));
		d.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mês da despesa:")));
		d.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano da despesa")));
		d.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa:")));
		despesas.add(d);
	}
	private double calcularDespesaTotal(int ano, int mes) {
		double valortdespesas = 0;
		for (Despesa d : despesas) {
			if (d.getAno() == ano && d.getMes() == mes) {
				valortdespesas += d.getValor() / aps.size();
			}
		} return valortdespesas;
	}
	public void valorAPagar() {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano a consultar:"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês a consultar:"));
		String valoresDevidos = "Valores a serem pagos pelos proprietários:\n";
		
		for (Apartamento ap : aps) {
			double valorap = ap.taxarMetros();
			double valordp = calcularDespesaTotal(ano, mes);
			double valortotal = valorap + valordp;
			valoresDevidos +=  ap.getProprietario() + " deve R$: " + valortotal + "\n";
		}
		JOptionPane.showMessageDialog(null, valoresDevidos);
	}
		
		
}
