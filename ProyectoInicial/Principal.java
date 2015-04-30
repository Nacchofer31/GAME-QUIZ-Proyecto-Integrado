package proyecto.Usuario;

import java.awt.Color;

import com.thehowtotutorial.splashscreen.JSplash;

import proyecto.vistas.PantMenu;

public class Principal {


	public static void main(String[] args) {
		pantallaCarga();
		PantMenu frame = new PantMenu();
		frame.setVisible(true);
	}
	
	/**
	 * MÉTODO PARA DEFINIR LA PANTALLA DE CARGA DE INICIO.
	 */
	public static void pantallaCarga(){
		try {
			//Crea una pantalla de cargando.
			JSplash splash = new JSplash (Principal.class.getResource("/Welcome.png"),true,true,false,"GameQuiz-preAlpha 0.1",null,Color.RED,Color.BLACK);
			splash.splashOn();
			splash.setProgress(20,"Iniciando...  (20%)");
			Thread.sleep(3000);
			splash.setProgress(40,"Ejecutando librerías...  (40%)");
			Thread.sleep(2000);
			splash.setProgress(60,"Ejecutando interfaces...  (60%)");
			Thread.sleep(1000);
			splash.setProgress(80,"Cargando base de datos...  (80%)");
			Thread.sleep(2000);
			splash.setProgress(100,"Iniciando aplicación  (99%)");
			Thread.sleep(1000);
			splash.splashOff();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
