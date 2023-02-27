package serasa.condicionais;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano"));
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0 )) {
			JOptionPane.showMessageDialog(null, ano + " = é Bissexto");
		}
		
		else {
			JOptionPane.showMessageDialog(null, ano + " = Não é Bissexto");
			
		}
	}

}
