package xadrez.pecas;

import jogotabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecasXadrez;

public class Rei extends PecasXadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
