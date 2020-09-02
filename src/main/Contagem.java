package main;

import java.text.Normalizer;

public class Contagem implements Runnable {

	private String frase;
	private int numVogal;
	private int numConsoante;

	public Contagem(String frase) {
		this.frase = frase;
		this.numVogal = 0;
		this.numConsoante = 0;
	}

	@Override
	public void run() {
		
		frase = frase.toLowerCase();
		
		//Tirando os acentos das letras
		String str = Normalizer.normalize(frase, Normalizer.Form.NFD);
	    str = str.replaceAll("[^\\p{ASCII}]", "");
	    
		
		for(int i = 0; i < str.length(); i++) {
			char letra = str.charAt(i);
			// Para ignorar os espaços
			if(letra == 32) {
				continue;
			}
			// Para contar as vogais
			if(letra == 97 || letra == 101 || letra == 105 || letra == 111 || letra == 117) {
				numVogal++;
				continue;
			}
			// Para contar as consoantes
			if(letra >= 98 && letra <= 122) {
				numConsoante++;
			}
		}
		
		System.out.println("Quantidade de Consoantes: " + numConsoante);
		System.out.println("Quantidade de Vogais: " + numVogal);
		
	}
	
}
