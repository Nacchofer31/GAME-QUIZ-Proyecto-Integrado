package vista;

import java.awt.Color;

import com.thehowtotutorial.splashscreen.JSplash;



public class PantallaDeCarga {
	
	public PantallaDeCarga(){
		try {
			//Crea una pantalla de cargando.
			JSplash splash = new JSplash (PantallaDeCarga.class.getResource("/Welcome.png"),true,true,false,"GameQuiz-preAlpha 0.1",null,Color.RED,Color.BLACK);
			splash.splashOn();
			splash.setProgress(20,"Sacando de la caja...  (20%)");
			Thread.sleep(3000);
			splash.setProgress(40,"Enchufando a la corriente...  (40%)");
			Thread.sleep(2000);
			splash.setProgress(60,"Conectando los mandos...  (60%)");
			Thread.sleep(1000);
			splash.setProgress(80,"Soplando el cartucho...  (80%)");
			Thread.sleep(2000);
			splash.setProgress(100,"Encendiendo la consola  (99%)");
			Thread.sleep(1000);
			splash.splashOff();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
