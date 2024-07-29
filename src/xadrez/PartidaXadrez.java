package xadrez;

import jogotabuleiro.Posicao;
import jogotabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicioPartida();
	}
	
	public PecasXadrez[][] getPecas (){
		PecasXadrez[][] mat = new PecasXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++ ) {
				mat[i][j] = (PecasXadrez) tabuleiro.peca(i, j);
			}
		}
		
		return mat;
	}
	
	private void inicioPartida() {
		tabuleiro.pecaLugar(new Torre(tabuleiro, Cor.WHITE), new Posicao(2, 1));
		tabuleiro.pecaLugar(new Rei(tabuleiro, Cor.BLACK), new Posicao(0, 4));
		tabuleiro.pecaLugar(new Rei(tabuleiro, Cor.WHITE), new Posicao(7, 4));
	}

}
