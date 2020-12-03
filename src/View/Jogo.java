package View;

import java.util.Scanner;

import Controller.ComputadorController;
import Controller.PartidaController;
import Controller.JogadorController;
import Controller.JogoController;
import Controller.PalpiteController;
import Controller.PlacarController;
import Model.Jogador;

public class Jogo {
	public static Jogador Computador;
	public static Jogador Humano;
	public static JogoController controladorDeJogo = new JogoController();
	public static PlacarController controladorDePlacar = new PlacarController();
	public static JogadorController controladorDeJogador = new JogadorController();
	public static ComputadorController controladorDeComputador = new ComputadorController();
	public static PartidaController controladorDePartida = new  PartidaController();
	public static PalpiteController controladorDePalpite = new PalpiteController();
	public static Scanner entrada = new Scanner(System.in);
	
	public void GUI() {
		Humano = new Jogador();
		Computador = new Jogador();
		while(true) {
			
			
			System.out.println("Iniciando Jogo...");
			System.out.println(controladorDePlacar.Placar(Humano, Computador));
			System.out.println("Humano digite [0]Pedra/ [1]Papel/ [2]Tesoura:");
			controladorDeJogador.UpdatePalpiteJogador(Humano,entrada.nextInt() );
			entrada.nextLine();
			controladorDeJogador.UpdatePalpiteJogador(Computador, controladorDeComputador.jogadaDoComputador());
			
			System.out.println("Humano: "+controladorDePalpite.tipoDePalpite(Humano.getPalpite())+" VS " + controladorDePalpite.tipoDePalpite(Computador.getPalpite()) +": Computador");
			
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
			
			System.out.println(controladorDePlacar.Placar(Humano, Computador));
			System.out.println("Deseja Jogar novamente? [Y/N]:");
			String jogarNovamente = entrada.nextLine();
			
			if(!jogarNovamente.equalsIgnoreCase("Y")) {
				break;
			}
		}
	}
}
