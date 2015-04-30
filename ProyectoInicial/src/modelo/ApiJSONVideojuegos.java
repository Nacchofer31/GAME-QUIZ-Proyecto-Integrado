package modelo;

import java.net.URL;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class ApiJSONVideojuegos{
	public void videojuegosQuerry() {
		try{
			URL url = new URL("http://gamequiz.esy.es/api.php?accion=videojuegos"); 
			InputStream is = url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			System.out.println(obj);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
}



