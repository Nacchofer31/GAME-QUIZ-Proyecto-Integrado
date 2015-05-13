import controlador.ManejoApis;
import controlador.ManejoVistas;


public class MainApp {

	public static void main(String[] args) {
		
		ManejoApis apis = new ManejoApis();
		ManejoVistas man = new ManejoVistas(apis);

	}

}
