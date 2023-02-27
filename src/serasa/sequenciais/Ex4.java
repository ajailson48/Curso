package serasa.sequenciais;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		System.out.println("soma: " + soma);
		System.out.println("---------------------------------------");
		System.out.println("soma: " + (num1 + num2));
		
		scan.locale();
		

	}

}
