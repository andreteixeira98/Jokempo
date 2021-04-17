package Controller;

public class PartidaController {
//dsaflksak
	
	public int vencedor(int palpiteJog1, int palpiteJog2) {
		
		//TODO
		if(palpiteJog1 != 0 && palpiteJog1 !=1 && palpiteJog1 != 2) {
			return -1;
		}
		else if(palpiteJog1 == palpiteJog2) {
			return 0;
		}
		
		else if(palpiteJog1 == 0) {
			if(palpiteJog2 == 1) return 2;
			
			else return 1;
			
		}
		else if(palpiteJog1 == 1) {
			if(palpiteJog2 == 0) return 1;
			
			else return 2;
		}
		
		else {
			if(palpiteJog2 == 0) return 2;
			
			else return 1;
		}
	}
}
