package controller;

public class InversaoCaracController {
	public InversaoCaracController() {
		super();
	}
	
	public void inversaoCarac(String texto,int posini,int posfin) {
		if (posini == posfin) {
			return;
			//Quando a posição inicial passar da posição final do String.
		} else {
			inversaoCarac(texto, posini + 1, posfin);
			System.out.print(texto.substring(posini, posini+1));
			//Progressivamente verifica o próximo caractere e vai até o fim do string, printando em ordem decrescente ao retornar.
		}
		
	}
	
}
