package serasa.sequenciais;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da parede: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da parede: "));
		
		double area = largura * altura;
		double tinta = area / 2;
		
		JOptionPane.showMessageDialog(null, " A área da sua parede é " + area + "m²" + "\n Você precisa de: "
		                               + tinta + " litros de tinta");
		

	}

}
