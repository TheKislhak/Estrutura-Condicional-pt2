package exCondicional;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, n4;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextDouble();
		System.out.println("Digite a quarta nota: ");
		n4 = ler.nextDouble();
		
		String msg = n1+n2+n3+n4 / 4 >= 7 ? "Aprovado":"Reprovado";
		System.out.println(msg);
		ler.close();
		}
}
