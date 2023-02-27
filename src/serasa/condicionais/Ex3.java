package serasa.condicionais;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeita nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = scan.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if(media > 7.0) {
			System.out.println("Aluno Aprovado");
		}
		else System.out.println("Aluno Reprovado");
		
		System.out.println("Média: " + media);
		System.out.println("--------------------------------");
		
		scan.close();

	}

}
