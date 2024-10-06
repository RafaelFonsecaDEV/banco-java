package Deposito;

import java.util.Locale;
import java.util.Scanner;

import banco.Banco;

public class Deposito {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Banco banco;

		System.out.print(" Enter account houlder");
		String nome = sc.nextLine();
		System.out.println("Enter account number");
		int conta = sc.nextInt();
		System.out.print("Is there an initial deposit (Y / N)");
		char resposta = sc.next().charAt(0);
		if (resposta == 'Y') {
			System.out.println("Enter initial deposit value ");
			double depositoinicial = sc.nextDouble();

			banco = new Banco(conta, nome, depositoinicial);

		}

		else {
			banco = new Banco(conta, nome);
		}

		System.out.println();
		System.out.println("account data");
		System.out.println(banco);

		System.out.println();
		System.out.print("Enter a deposit value:");
		double depositvalue = sc.nextDouble();
		banco.deposito(depositvalue);
		System.out.println("Update account data");
		System.out.println(banco);

		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdrawvalue = sc.nextDouble();
		banco.deposito(withdrawvalue);
		System.out.println("Update account data");
		System.out.println(banco);
		
		
		
		sc.close();
	}

}
