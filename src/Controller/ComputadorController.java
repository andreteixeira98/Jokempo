package Controller;
import java.util.Random;
//djd
public class ComputadorController {
	
	public int 	jogadaDoComputador() {
		Random gerador = new Random();
		return gerador.nextInt(3);
	}

}
