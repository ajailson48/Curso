package serasa.condicionais;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		int anoAtual = data.get(Calendar.YEAR);
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento"));
		
		int idade = anoAtual - anoNascimento;
		
		if (idade == 18) {
			JOptionPane.showMessageDialog(null, " Você tem " + idade + " anos. \n Aliste-se já: ");
		}
		
		if (idade > 18) {
			int idadeMaior = idade - 18;
			JOptionPane.showInternalMessageDialog(null, " Você tem " + idade + " anos. \n Passou " 
			                                       + idadeMaior + " anos do seu Alistamento");
		}
		
		if (idade < 18) {
			int idadeMenor = 18 - idade;
			JOptionPane.showInternalMessageDialog(null, " Você tem " + idade + " anos. \n Só pode se alistar daqui a " 
			                                       + idadeMenor + " anos");
		}

	}

}
