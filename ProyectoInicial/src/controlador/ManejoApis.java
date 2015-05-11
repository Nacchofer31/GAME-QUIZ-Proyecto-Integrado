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
	private String juegosTodos[];

	public ManejoApis() {
		apiJuegos = new ApiJSONVideojuegos();
		apiGenero = new ApiJSONGenero();
		apiEmpresa = new ApiJSONEmpresas();
		apiConsola = new ApiJSONConsolas();
		pruevaConexion frame = new pruevaConexion(this);
		frame.setVisible(true);
	}
	
	public String[] buscarJuego(String juego){
		String datos[]=new String[9];
		int posicion =0;
		for (int x = 0;x<apiJuegos.getNombreDatos().length;x++){
			if(apiJuegos.getNombreDatos()[x].equals(juego)){
				posicion=x;
			}
		}
		String datosConsulta[]=apiJuegos.getFilaConsulta(posicion);
		for(int c = 0;c<datos.length;c++){
			if(c==1){
				for(int v = 0;v<apiConsola.getNombreDatos().length;v++){
					if(datosConsulta[c].equals(apiConsola.getDato(v, 0))){
						datos[c]=apiConsola.getDato(v, 2);
						break;
						
					}
				}
			}else if (c==2){
				for(int v = 0;v<apiEmpresa.getNombreDatos().length;v++){
					if(datosConsulta[c].equals(apiEmpresa.getDato(v, 0))){
						datos[c]=apiEmpresa.getDato(v, 1);
						break;
					}
				}
			}else if (c==4){
				for(int v = 0;v<apiGenero.getNombreDatos().length;v++){
					if(datosConsulta[c].equals(apiGenero.getDato(v, 0))){
						datos[c]=apiGenero.getDato(v, 1);
						break;            
					}
				}
			}else{
				datos[c]=datosConsulta[c];
			}
		}
		
		return datos;
	}
	
	public String[] buscarConsola(String juego){
		String datos[]=new String[6];
		int posicion =0;
		for (int x = 0;x<apiConsola.getNombreDatos().length;x++){
			if(apiConsola.getNombreDatos()[x].equals(juego)){
				posicion=x;
			}
		}
		String datosConsulta[]=apiConsola.getFilaConsulta(posicion);
		for(int c = 0;c<datos.length;c++){
			if (c==1){
				for(int v = 0;v<apiEmpresa.getNombreDatos().length;v++){
					if(datosConsulta[c].equals(apiEmpresa.getDato(v, 0))){
						datos[c]=apiEmpresa.getDato(v, 1);
						break;
					}
				}
			}else{
				datos[c]=datosConsulta[c];
			}
		}
		
		return datos;
	}
	
	public String[] mostrarJuegos(){
		juegosTodos=apiJuegos.getNombreDatos();
		return juegosTodos;
	}
	
	public String[] filtroGenero(String[] viejo,String generoPedido){
		int numeroCoincidencias=0;
		String genero[]=new String[viejo.length];
		String nuevo[];
		int posicion=0;
		for(int i = 0;i<viejo.length;i++){
			String nombre = viejo[i];
			for(int e = 0;e<apiJuegos.getNombreDatos().length;e++){
				if(nombre.equals(apiJuegos.getDato(e, 4))){
					genero[i]=apiJuegos.getDato(e, 5);
				}
			}
		}
		for(int i = 0;i<genero.length;i++){
			if(genero[i].equals(generoPedido)){
				numeroCoincidencias++;
			}
		}
		nuevo = new String[numeroCoincidencias];
		for(int i = 0;i<viejo.length;i++){
			if(genero[i].equals(generoPedido)){
				nuevo[posicion]=viejo[i];
				posicion++;
			}
		}
		return nuevo;
	}
	
	public String[] filtroConsola(String[] viejo,String consolaPedido){
		int numeroCoincidencias=0;
		String consola[]=new String[viejo.length];
		String nuevo[];
		int posicion=0;
		for(int i = 0;i<viejo.length;i++){
			String nombre = viejo[i];
			for(int e = 0;e<apiJuegos.getNombreDatos().length;e++){
				if(nombre.equals(apiJuegos.getDato(e, 4))){
					consola[i]=apiJuegos.getDato(e, 1);
				}
			}
		}
		for(int i = 0;i<consola.length;i++){
			if(consola[i].equals(consolaPedido)){
				numeroCoincidencias++;
			}
		}
		nuevo = new String[numeroCoincidencias];
		for(int i = 0;i<viejo.length;i++){
			if(consola[i].equals(consolaPedido)){
				nuevo[posicion]=viejo[i];
				posicion++;
			}
		}
		return nuevo;
	}
	public String[] filtroMultijugador(String[] viejo,int tipoPedido){
		int numeroCoincidencias=0;
		String multijugador[]=new String[viejo.length];
		String nuevo[];
		int posicion=0;
		for(int i = 0;i<viejo.length;i++){
			String nombre = viejo[i];
			for(int e = 0;e<apiJuegos.getNombreDatos().length;e++){
				if(nombre.equals(apiJuegos.getDato(e, 4))){
					multijugador[i]=apiJuegos.getDato(e, 7);
				}
			}
		}
		for(int i = 0;i<multijugador.length;i++){
			if(multijugador[i].equals(tipoPedido)){
				numeroCoincidencias++;
			}
		}
		nuevo = new String[numeroCoincidencias];
		for(int i = 0;i<viejo.length;i++){
			if(multijugador[i].equals(tipoPedido)){
				nuevo[posicion]=viejo[i];
				posicion++;
			}
		}
		return nuevo;
	}
	
	public String[] filtroGeneral(boolean generoB, String generoS, boolean consolaB,String consolaS, boolean multijugadorB,String multijugadorS){
		String nuevo[]=juegosTodos;
		if(generoB==true){
			nuevo = filtroGenero(nuevo, generoS);
		}
		if(consolaB==true){
			nuevo = filtroConsola(nuevo, consolaS);
		}
		if(multijugadorB==true){
			nuevo = filtroGenero(nuevo, multijugadorS);
		}
		return nuevo;
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
