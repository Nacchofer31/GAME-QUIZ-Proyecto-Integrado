package controlador;


import modelo.ApiJSONConsolas;
import modelo.ApiJSONEmpresas;
import modelo.ApiJSONGenero;
import modelo.ApiJSONQuiz;
import modelo.ApiJSONVideojuegos;

public class ManejoApis {
	private ApiJSONVideojuegos apiJuegos;
	private ApiJSONGenero apiGenero;
	private ApiJSONEmpresas apiEmpresa;
	private ApiJSONConsolas apiConsola;
	private ApiJSONQuiz apiQuiz;
	private String juegosTodos[];
	private String consolasTodas[];
	
	//VARIABLES PARA EL QUIZ
	private int aciertos=0;
	private int fallos=0;
	private int preguntasCadaTurno[]=new int[10];
	private int numeroPregunta = 0;
	

	public ManejoApis() {
		apiJuegos = new ApiJSONVideojuegos();
		apiGenero = new ApiJSONGenero();
		apiEmpresa = new ApiJSONEmpresas();
		apiConsola = new ApiJSONConsolas();
		apiQuiz = new ApiJSONQuiz();
		juegosTodos=apiJuegos.getNombreDatos();
		consolasTodas=apiConsola.getNombreDatos();
		cargaPreguntas();
		
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
				if(nombre.equals(apiJuegos.getDato(e, 3))){
					genero[i]=apiJuegos.getDato(e, 4);
				}
			}
		}
		for(int i = 0;i<genero.length;i++){
			if(genero[i].equals(generoPedido)){
				numeroCoincidencias++;
			}
		}
		nuevo = new String[numeroCoincidencias];
		if(numeroCoincidencias!=0){
			for(int i = 0;i<viejo.length;i++){
				if(genero[i].equals(generoPedido)){
					nuevo[posicion]=viejo[i];
					posicion++;
				}
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
				if(nombre.equals(apiJuegos.getDato(e, 3))){
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
	public String[] filtroMultijugador(String[] viejo,String tipoPedido){
		int numeroCoincidencias=0;
		String multijugador[]=new String[viejo.length];
		String nuevo[];
		int posicion=0;
		for(int i = 0;i<viejo.length;i++){
			String nombre = viejo[i];
			for(int e = 0;e<apiJuegos.getNombreDatos().length;e++){
				if(nombre.equals(apiJuegos.getDato(e, 3))){
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
	
	public String[] filtroNombre(String[] viejo,String nombreBuscado){
		int numeroCoincidencias=0;
		String nombres[]=new String[viejo.length];
		String nuevo[];
		int posicion=0;
		CharSequence nB = nombreBuscado;
		for(int i = 0;i<viejo.length;i++){
			String nombre = viejo[i];
			for(int e = 0;e<apiJuegos.getNombreDatos().length;e++){
				if(nombre.equals(apiJuegos.getDato(e, 3))){
					nombres[i]=apiJuegos.getDato(e, 3);
				}
			}
		}
		
		for(int i = 0;i<nombres.length;i++){
			if(nombres[i].contains(nB)){
				numeroCoincidencias++;
			}
		}
		nuevo = new String[numeroCoincidencias];
		for(int i = 0;i<viejo.length;i++){
			if(nombres[i].contains(nB)){
				nuevo[posicion]=viejo[i];
				posicion++;
			}
		}
		return nuevo;
	}
	
	public String[] filtroGeneral(boolean nombreB, String nombreS,boolean generoB, String generoS, boolean consolaB,String consolaS, boolean multijugadorB,String multijugadorS){
		String nuevo[]=juegosTodos;		
		if(nombreB==true){
			nuevo = filtroNombre(nuevo, nombreS);
		}
		if(generoB==true){
			nuevo = filtroGenero(nuevo, generoS);
		}
		if(consolaB==true){
			nuevo = filtroConsola(nuevo, consolaS);
		}
		if(multijugadorB==true){
			nuevo = filtroMultijugador(nuevo, multijugadorS);
		}
		/*if(nombreB==false&&generoB==false&&consolaB==false&&multijugadorB==false){
			return new String [0];
		}*/
		return nuevo;
	}
	
	public String[] filtroEmpresa(String[] viejo,String empresaPedida){
		int numeroCoincidencias=0;
		String empresa[]=new String[viejo.length];
		String nuevo[];
		int posicion=0;
		for(int i = 0;i<viejo.length;i++){
			String nombre = viejo[i];
			for(int e = 0;e<apiConsola.getNombreDatos().length;e++){
				if(nombre.equals(apiConsola.getDato(e, 2))){
					empresa[i]=apiConsola.getDato(e, 1);
				}
			}
		}
		for(int i = 0;i<empresa.length;i++){
			if(empresa[i].equals(empresaPedida)){
				numeroCoincidencias++;
			}
		}
		nuevo = new String[numeroCoincidencias];
		if(numeroCoincidencias!=0){
			for(int i = 0;i<viejo.length;i++){
				if(empresa[i].equals(empresaPedida)){
					nuevo[posicion]=viejo[i];
					posicion++;
				}
			}
		}
		return nuevo;
	}
	
	public String[] filtroNombreConsola(String[] viejo,String nombreConsolaBuscado){
		int numeroCoincidencias=0;
		String nombres[]=new String[viejo.length];
		String nuevo[];
		int posicion=0;
		CharSequence nB = nombreConsolaBuscado;
		for(int i = 0;i<viejo.length;i++){
			String nombre = viejo[i];
			for(int e = 0;e<apiConsola.getNombreDatos().length;e++){
				if(nombre.equals(apiConsola.getDato(e, 2))){
					nombres[i]=apiConsola.getDato(e, 2);
				}
			}
		}
		
		for(int i = 0;i<nombres.length;i++){
			if(nombres[i].contains(nB)){
				numeroCoincidencias++;
			}
		}
		nuevo = new String[numeroCoincidencias];
		for(int i = 0;i<viejo.length;i++){
			if(nombres[i].contains(nB)){
				nuevo[posicion]=viejo[i];
				posicion++;
			}
		}
		return nuevo;
	}
	
	public String[] filtroGeneralConsola(boolean nombreB, String nombreS,boolean empresaB, String empresaS){
		String nuevo[]=consolasTodas;		
		if(nombreB==true){
			nuevo = filtroNombreConsola(nuevo, nombreS);
		}
		if(empresaB==true){
			nuevo = filtroEmpresa(nuevo, empresaS);
		}
		/*if(nombreB==false&&generoB==false&&consolaB==false&&multijugadorB==false){
			return new String [0];
		}*/
		return nuevo;
	}
	
	public void cargaPreguntas(){
		for(int i = 0;i<preguntasCadaTurno.length;i++){
			boolean sigue=false;
			double nuevaPregunta=0;
			while(sigue==false){
				nuevaPregunta= Math.random()*apiQuiz.getNombreDatos().length;
				int coincidencia=0;
				for(int x = 0;x<preguntasCadaTurno.length;x++){
					String f = String.valueOf(nuevaPregunta);
					int posicionPunto = f.indexOf('.');
					String k = f.substring(0, posicionPunto);
					if(String.valueOf(preguntasCadaTurno[x])==k){
						coincidencia++;
					}
				}
				if(coincidencia==0){
					sigue=true;
				}
			}
			preguntasCadaTurno[i]=(int)nuevaPregunta;
		}
	}
	
	public void guardarRespuesta(String respuesta){
		if(respuesta.equals(apiQuiz.getDato(preguntasCadaTurno[numeroPregunta], 2))){
			aciertos++;
		}else{
			fallos++;
		}
	}
	
	public String[] pasarPregunta(){
		if(numeroPregunta<=preguntasCadaTurno.length){
			numeroPregunta++;
			int preguntaAhora=preguntasCadaTurno[numeroPregunta];
			String pregunta[]=apiQuiz.getFilaConsulta(preguntaAhora);
			return pregunta;
		}
		
		return null;
	}
	public String[] primeraPregunta(){
		String x[] = apiQuiz.getFilaConsulta(preguntasCadaTurno[0]);
		return x;
	}
	
	public int[] numeroRespuesta(double x){
		int orden[]=new int[4];
		if(x>=0&&x<1){
			orden[0]=2;
			orden[1]=3;
			orden[2]=4;
			orden[3]=5;
		}
		if(x>=1&&x<2){
			orden[0]=5;
			orden[1]=4;
			orden[2]=3;
			orden[3]=2;
		}
		if(x>=2&&x<3){
			orden[0]=4;
			orden[1]=5;
			orden[2]=2;
			orden[3]=3;
		}
		if(x>=3&&x<4){
			orden[0]=3;
			orden[1]=2;
			orden[2]=5;
			orden[3]=4;
		}
		if(x>=4&&x<5){
			orden[0]=4;
			orden[1]=2;
			orden[2]=3;
			orden[3]=5;
		}
		
		
		return orden;
	}
	
	public String resultado(){
		int totalPreguntas=preguntasCadaTurno.length;
		return "Has acertado "+aciertos+" preguntas de un total de: "+totalPreguntas;
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

	public ApiJSONQuiz getApiQuiz() {
		return apiQuiz;
	}

	public int[] getPreguntasCadaTurno() {
		return preguntasCadaTurno;
	}

	public int getNumeroPregunta() {
		return numeroPregunta;
	}
	
	

}
