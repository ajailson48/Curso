package serasa.condicionais;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		if(num%2 ==0) JOptionPane.showMessageDialog(null, "Numero Par");
		else JOptionPane.showInternalMessageDialog(null, "Número Impar");
		

	}

}
