package modelo;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.swing.JOptionPane;

public class ApiJSONConsolas {
	
	private static String ID_CON = "Id_Consola";
	private static String ID_EMPRESA_CON = "Id_Empresa";
	private static String NOMBRE_CON = "Nombre";
	private static String ESPECIFICACIONES_CON = "Especificaciones";
	private static String FECHA_CON = "Fecha_Salida";
	private static String IMAGEN_CON = "Imagen_Consola";
	
	private ArrayList<String[]> datos;
	private String nombreDatos[];
	private String titulos[]={ID_CON,ID_EMPRESA_CON,NOMBRE_CON,ESPECIFICACIONES_CON,FECHA_CON,IMAGEN_CON};
	
	public ApiJSONConsolas() {
		cargar();
		
	}
	
	public void consolasQuerry() {
		datos = new ArrayList <String[]>();
		try{
			//COPIAMOS LA URL DE NUESTRO SERVICIO
			URL url = new URL("http://gamequiz.esy.es/consultas/api.php?accion=consolas"); 
			//ABRIMOS LA URL
			InputStream is = url.openStream();
			//CREAMOS EL OBJETO QUE LEE LOS DATOS
			JsonReader rdr = Json.createReader(is);
			//LEEMOS EL OBJETO OBTENIDO DE LA URL
			JsonObject obj = rdr.readObject();
			//SACAMOS UN ARRAY DE NUESTRO OBJETO DONDE ESTAN TODOS NUESTRAS CONSULTAS
			JsonArray data = obj.getJsonArray("0");
			//INICIAMOS EL STRING DE LOS TITULOS
			nombreDatos = new String[data.size()];
			//RECORREMOS NUESTRO ARRAY DE CONSULTAS
			for(int x = 0; x<data.size(); x++){
				String g []=new String[titulos.length];
				String nombre ="";
				JsonObject data1 = data.getJsonObject(x);
				//RECORREMS CADA ARRAY CONSULTADO
				for(int e = 0; e<titulos.length;e++){
					g[e] = data1.getString(titulos[e]);
					if(e==2) nombre=data1.getString(titulos[e]);
				}
				//GUARDAMOS EL TITULO Y LOS DATOS EN SUS SITIOS
				nombreDatos[x]=nombre;
				datos.add(g);			}
			
			}catch(Exception e){
			}

	}
	public void cargar(){
		datos = new ArrayList <String[]>();
		int x = 0;
		while(x!=10){
			consolasQuerry();
			x++;
			if(datos.size()!=0){
				break;
			}
		}
		if(datos.size()==0){
			Object[] opciones = {"      OK      "};
			JOptionPane.showOptionDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS, COMPRUEBA TU CONEXION A INTERNET Y VUELVE A PROBAR", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, opciones, opciones[0]);
			System.exit(0);
		}
	}
	
	public String[] getFilaConsulta(int x){
		return datos.get(x);
	}
	
	public String getDato(int x, int y){
		return datos.get(x)[y];
	}
	
	public String[] getTitulos (){
		return titulos;
	}
	
	public String[] getNombreDatos(){
		return nombreDatos;
	}

}