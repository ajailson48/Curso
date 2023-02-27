package serasa.sequenciais;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distância em metros: "));
		
		double Km = distancia / 1000;
		double Hm = distancia / 100;
		double Dam = distancia / 10;
		double dm = distancia * 10;
		double cm = distancia * 100;
		double mm = distancia * 1000;
		
		JOptionPane.showMessageDialog(null, " A distância de " + distancia + "m" + " Corresponde a: \n" + Km + "Km \n" 
		                               + Hm + "Hm \n" + Dam + "Dam \n" + dm + "dm \n" + cm + "cm \n" + mm + "mm");
		
		

	}

}
