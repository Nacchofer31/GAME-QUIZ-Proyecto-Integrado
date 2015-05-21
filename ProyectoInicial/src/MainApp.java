import controlador.ManejoApis;
import controlador.ManejoVistas;


public class MainApp {
	private ManejoApis apis;
	private ManejoVistas man;

	public static void main(String[] args) {
		
		ManejoApis apis = new ManejoApis();
		ManejoVistas man = new ManejoVistas(apis);

	}

}
