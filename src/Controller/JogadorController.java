package Controller;
//sajsa
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
 public String tipoDePalpite(int palpite) {
		if(palpite == 0) return "pedra";
		
		else if(palpite == 1) return "papel";
		
		else return "tesoura";
	}
 
}
