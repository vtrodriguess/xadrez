package xadrez;

import jogotabuleiro.Peca;
import jogotabuleiro.Tabuleiro;

public class PecasXadrez extends Peca {
	
	private Cor cor;

	public PecasXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
	

}
