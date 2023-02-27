package serasa.sequenciais;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		JOptionPane.showInternalMessageDialog(null, "O dobro de " + num + " é " + (num*2) 
				                              + " \n A terça parte de " + num + " é " + (num/3));

	}

}
