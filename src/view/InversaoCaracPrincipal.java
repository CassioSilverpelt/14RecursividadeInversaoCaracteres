package view;

import javax.swing.JOptionPane;

import controller.InversaoCaracController;

public class InversaoCaracPrincipal {
	public static void main (String[] args) {
		InversaoCaracController invCon = new InversaoCaracController();
		String texto = JOptionPane.showInputDialog("Insira o texto a ser invertido: ");
		invCon.inversaoCarac(texto, 0, texto.length());
	}
}
