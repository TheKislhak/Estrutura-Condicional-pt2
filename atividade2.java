package exCondicional;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		double a;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		a = ler.nextDouble();
		
		String msg = a % 5 == 0 ? "é multiplo de 5":"não é multiplo de 5";
		System.out.println(msg);
		
		ler.close();

	}

}
