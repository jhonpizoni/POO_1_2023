package exercicio_condominio;


import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		Condominio condominio = new Condominio();
		
		String menu = "1 - Cadastrar apartamento\n"
				+ "2 - Cadastrar despesa\n"
				+ "3 - Valor devido por proprietário\n"
				+ "4 - Extrato do apartamento\n"
				+ "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
				case 1: 
					condominio.cadastraApartamento();
					break;
				case 2: 
					condominio.cadastrarDespesa();
					break;
				case 3:
					condominio.valorAPagar();
					break;
				case 4: 

					break;
				case 5:
					
                    break;
			}
		} while (op != 5);
	}

}