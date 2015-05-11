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
