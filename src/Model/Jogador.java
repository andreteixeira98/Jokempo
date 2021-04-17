package Model;

public class Jogador {
	//dsilsdds
	public Jogador(int palpite, int qtdVitorias, int qtdDerrotas) {
		super();
		this.palpite = palpite;
		this.qtdVitorias = qtdVitorias;
		this.qtdDerrotas = qtdDerrotas;
	}
	public Jogador() {
		super();
		this.palpite = -1;
		this.qtdVitorias =0;
		this.qtdDerrotas = 0;
		// TODO Auto-generated constructor stub
	}
	private int palpite;
	private int qtdVitorias,qtdDerrotas;
	public int getPalpite() {
		return palpite;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setPalpite(int palpite) {
		this.palpite = palpite;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}

}
