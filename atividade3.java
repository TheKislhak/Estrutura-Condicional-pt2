package exCondicional;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		
		System.out.println("Quantos anos você trabalha na empresa?: ");
		a = ler.nextDouble();
		
		if (a == 3) {
			System.out.println("Você recebeu 5% de bônus!");
		} else if (a >= 4) {
			System.out.println("Você recebeu 7% de bônus!");
		}
		else {
			System.out.println("Você não receu nada :(");
		}
		
		ler.close();

	}

}
