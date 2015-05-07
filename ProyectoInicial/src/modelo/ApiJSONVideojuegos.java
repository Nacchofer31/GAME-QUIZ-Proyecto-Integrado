package modelo;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
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
	
	private ArrayList<String[]> datos;
	private String nombreDatos[];
	private String titulos[]={ID_VID,IDCON_VID,IDEMPRESA_VID,NOMBRE_VID,GENERO_VID,SINOPSIS_VID,FECHA_VID,MULTI_VID,CARATULA_COL};
	
	
	public void videojuegosQuerry() {
		datos = new ArrayList <String[]>();
		try{
			URL url = new URL("http://gamequiz.esy.es/consultas/api.php?accion=videojuegos"); 
			InputStream is = url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			JsonArray data = obj.getJsonArray("0");
			nombreDatos = new String[data.size()];
			
			for(int x = 0; x<data.size(); x++){
				String g []=new String[titulos.length];
				String nombre ="";
				JsonObject data1 = data.getJsonObject(x);
				for(int e = 0; e<titulos.length;e++){
					g[e] = data1.getString(titulos[e]);
					//System.out.println(datos.get(0)[0]);
					if(e==3) nombre=data1.getString(titulos[e]);
				}
				nombreDatos[x]=nombre;
				datos.add(g);
			}
			System.out.println(datos.get(1)[3]);
			
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
	
}



