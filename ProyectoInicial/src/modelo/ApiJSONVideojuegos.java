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
	private static String IDCON_VID="Id_Consola";
	private static String IDEMPRESA_VID="Id_Empresa";
	private static String NOMBRE_VID="Nombre";
	private static String GENERO_VID="Genero";
	private static String SINOPSIS_VID="Sinopsis";
	private static String FECHA_VID="Fecha_Salida";
	private static String MULTI_VID="Multijugador";
	private static String CARATULA_COL="Caratula";
	
	private ArrayList<Array> datos;
	private String titulos[]={ID_VID,IDCON_VID,IDEMPRESA_VID,NOMBRE_VID,GENERO_VID,SINOPSIS_VID,FECHA_VID,MULTI_VID,CARATULA_COL};
	
	
	public void videojuegosQuerry() {
		try{
			URL url = new URL("http://gamequiz.esy.es/api.php?accion=videojuegos"); 
			InputStream is = url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			JsonArray data = obj.getJsonArray("0");
			JsonObject data1 = data.getJsonObject(0);
			for(int x = 0; x<data1.size(); x++){
				
			}
			String f = data1.getString(ID_VID);
			
			System.out.println(obj);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
	
}



