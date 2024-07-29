package xadrez.pecas;

import jogotabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecasXadrez;

public class Torre extends PecasXadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
