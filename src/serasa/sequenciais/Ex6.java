package serasa.sequenciais;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = scan.nextInt();
		
		int antecessor = num1--;
		int sucessor = num1++;
		
		System.out.println("----------------------------");
		System.out.println("Antecessor: " + (num1 - 1) + "Seu número: " + num1 + "Sucessor: " + (num1 + 1));
		System.out.println("----------------------------");
		System.out.println("Antecessor: " + antecessor + "Seu número: " + num1 + "Sucessor: " + sucessor);
		
	

	}

}
