package modelo;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class ApiJSONConsolas {
	
	private static String ID_CON = "idconsola";
	private static String ID_EMPRESA_CON = "idempresa";
	private static String NOMBRE_CON = "nombre";
	private static String ESPECIFICACIONES_CON = "especificaciones";
	private static String FECHA_CON = "fecha_salida";
	private static String IMAGEN_CON = "imagen";
	
	
	public void consolasQuerry() {
		try{
			URL url = new URL("http://gamequiz.esy.es/api.php?accion=consolas"); 
			InputStream is = url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			JsonArray data = obj.getJsonArray("0");
			JsonObject data1 = data.getJsonObject(0);
			//String f = data1.getString();
			}catch(Exception e){
				e.printStackTrace();
			}
	

	}
}