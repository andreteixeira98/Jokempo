package Controller;

public class PalpiteController {
	public String tipoDePalpite(int palpite) {
		if(palpite == 0) return "pedra";
		
		else if(palpite == 1) return "papel";
		
		else return "tesoura";
	}
}
