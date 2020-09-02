package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		Thread contagem = new Thread(new Contagem(frase));
		contagem.start();
		
		scanner.close();

	}

}
