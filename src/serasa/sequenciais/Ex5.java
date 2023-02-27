package serasa.sequenciais;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeita nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = scan.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media);
		
		scan.close();

	}

}
