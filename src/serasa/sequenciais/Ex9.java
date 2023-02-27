package serasa.sequenciais;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		double reais = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais você tem: "));
		
		double dolar = reais / 3.45;
		JOptionPane.showInternalMessageDialog(null, " Você tem R$ " + reais + " e pode comprar U$$ " + dolar);
		

	}

}
