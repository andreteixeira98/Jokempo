package Controller;

import Model.Jogador;

public class JogadorController {
	public void UpdatePalpiteJogador(Jogador jogador, int palpite) {
		jogador.setPalpite(palpite);
	}
 public void UpdateVitoriasJogador(Jogador jogador) {
	 jogador.setQtdVitorias(jogador.getQtdVitorias() + 1 );
 }
 public void UpdateDerrotasJogador(Jogador jogador) {
	 jogador.setQtdDerrotas(jogador.getQtdDerrotas() + 1);
 }
 
}
