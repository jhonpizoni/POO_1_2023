package exercicio_condominio;

public class Apartamento {
	
	private int numero;
	private String bloco;
	private double metros;
	private String proprietario;
	private final double taxa = 5.00;
	
	public double taxarMetros() {
		return taxa*metros;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public double getMetros() {
		return metros;
	}
	public void setMetros(double metros) {
		this.metros = metros;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public double getTaxa() {
		return taxa;
	}
	
	

}
