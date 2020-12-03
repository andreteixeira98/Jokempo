package Controller;

import Model.Jogador;

public class PlacarController {
	public String Placar(Jogador jogador1, Jogador jogador2) {
		
		return "Humano" + jogador1.getQtdVitorias() + "X" + jogador2.getQtdVitorias() + "Computador";
	}
}
