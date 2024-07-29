package application;

import jogotabuleiro.Posicao;
import jogotabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartidaXadrez partidaxadrez = new PartidaXadrez();
		
		UI.printTabuleiro(partidaxadrez.getPecas());

	}

}
