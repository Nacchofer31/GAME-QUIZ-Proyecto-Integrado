package modelo;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class ApiJSONVideojuegos{
	private static String ID_VID="Id_Juego";
	private static String IDCON_VID="idconsola";
	private static String IDEMPRESA_VID="idempresa";
	private static String NOMBRE_VID="nombre";
	private static String GENERO_VID="genero";
	private static String SINOPSIS_VID="sinopsis";
	private static String FECHA_VID="fecha";
	private static String MULTI_VID="multijugador";
	private static String CARATULA_COL="caratula";
	
	private ArrayList<Array> datos;
	/*private ArrayList<Episode> episodio;*/
	private Array titulos;
	
	
	public void videojuegosQuerry() {
		try{
			URL url = new URL("http://gamequiz.esy.es/api.php?accion=videojuegos"); 
			InputStream is = url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			JsonArray data = obj.getJsonArray("0");
			JsonObject data1 = data.getJsonObject(0);
			String f = data1.getString(ID_VID);
			
			System.out.println(f);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
	
}



