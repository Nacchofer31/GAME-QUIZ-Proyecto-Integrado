package controlador;

import modelo.ApiJSONConsolas;
import modelo.ApiJSONEmpresas;
import modelo.ApiJSONGenero;
import modelo.ApiJSONVideojuegos;
import vista.pruevaConexion;

public class ManejoApis {
	private ApiJSONVideojuegos apiJuegos;
	private ApiJSONGenero apiGenero;
	private ApiJSONEmpresas apiEmpresa;
	private ApiJSONConsolas apiConsola;

	public ManejoApis() {
		apiJuegos = new ApiJSONVideojuegos();
		apiGenero = new ApiJSONGenero();
		apiEmpresa = new ApiJSONEmpresas();
		apiConsola = new ApiJSONConsolas();
		pruevaConexion frame = new pruevaConexion(this);
		frame.setVisible(true);
	}
	
	public String[] buscarJuego(String juego){
		String datos[]=new String[6];
		int posicion =0;
		for (int x = 0;x<apiJuegos.getNombreDatos().length;x++){
			System.out.println(apiJuegos.getNombreDatos()[x]);
			if(apiJuegos.getNombreDatos()[x]==juego){
				System.out.println("hola");
				posicion=x;
			}
		}
		String datosConsulta[]=apiJuegos.getFilaConsulta(posicion);
		for(int c = 0;c<datos.length;c++){
			datos[c]=datosConsulta[c];
		}
		
		return datos;
	}

	public ApiJSONConsolas getApiConsola() {
		return apiConsola;
	}

	public ApiJSONVideojuegos getApiJuegos() {
		return apiJuegos;
	}

	public ApiJSONGenero getApiGenero() {
		return apiGenero;
	}

	public ApiJSONEmpresas getApiEmpresa() {
		return apiEmpresa;
	}
	
	

}
