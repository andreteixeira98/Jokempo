package View;
//vskalçdkjsallsafd

import java.util.Scanner;

import Controller.ComputadorController;
import Controller.JogadorController;
import Controller.PartidaController;
import Controller.PlacarController;
import Model.Jogador;

public class Jogo {
	private static Jogador Computador;
	private static Jogador Humano;
	private static PlacarController controladorDePlacar = new PlacarController();
	private static JogadorController controladorDeJogador = new JogadorController();
	private static ComputadorController controladorDeComputador = new ComputadorController();
	private static PartidaController controladorDePartida = new  PartidaController();
	private static Scanner entrada = new Scanner(System.in);
	
	public void GUI() {
		Humano = new Jogador();
		Computador = new Jogador();
		while(true) {
			
			
			System.out.println("Iniciando Jogo...");//TODO
			System.out.println(controladorDePlacar.Placar(Humano.getQtdVitorias(), Computador.getQtdVitorias()));
			System.out.println("Humano digite [0]Pedra/ [1]Papel/ [2]Tesoura:");
			controladorDeJogador.UpdatePalpiteJogador(Humano,entrada.nextInt() );
			entrada.nextLine();
			controladorDeJogador.UpdatePalpiteJogador(Computador, controladorDeComputador.jogadaDoComputador());
			
			System.out.println("Humano: "+controladorDeJogador.tipoDePalpite(Humano.getPalpite())+" VS " + controladorDeJogador.tipoDePalpite(Computador.getPalpite()) +": Computador");
			
			int vencedor = controladorDePartida.vencedor(Humano.getPalpite(), Computador.getPalpite());
			
			switch (vencedor) {
			case 1:
				controladorDeJogador.UpdateVitoriasJogador(Humano);
				System.out.println("Humano você venceu parabens !!!!!");
				break;
			case 2:
				controladorDeJogador.UpdateVitoriasJogador(Computador);
				System.out.println("Humano você perdeu para mim :)!!");
				break;
			case 0: 
				System.out.println("Humano nos Empatamos !");
				break;

			default:
				System.out.println("jogada invalida!");
				break;
			}
			
			System.out.println(controladorDePlacar.Placar(Humano.getQtdVitorias(), Computador.getQtdVitorias()));
			System.out.println("Deseja Jogar novamente? [Y/N]:");
			String jogarNovamente = entrada.nextLine();
			
			if(!jogarNovamente.equalsIgnoreCase("Y")) {
				System.exit(0);
			}
		}
	}
}
