package Controller;
import java.util.Random;

public class ComputadorController {
	
	public int 	jogadaDoComputador() {
		Random gerador = new Random();
		return gerador.nextInt(3);
	}

}
