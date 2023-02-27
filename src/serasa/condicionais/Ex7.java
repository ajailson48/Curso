package serasa.condicionais;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		Object[] opcoes = {"Masculino", "Feminino"};
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo: \n", "Pesquise", 
				        JOptionPane.PLAIN_MESSAGE, null, opcoes, "Masculino");
		
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));
		
		
		if(sexo == "Feminino") {
			double valorDescontoF = valorCompra - valorCompra * 13/100;
			JOptionPane.showInternalMessageDialog(null, "Valor da compra com desconto: " + valorDescontoF);
			
		}
		else {
			double valorDescontoM = valorCompra - valorCompra * 5/100;
			JOptionPane.showMessageDialog(null, "Valor da compra com desconto: " + valorDescontoM);
			
			
		}
	}
}

