package controlador;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import vista.Decada00;
import vista.Decada10;
import vista.Decada70;
import vista.Decada80;
import vista.Decada90;
import vista.PantallaConsolas;
import vista.PantallaDeCarga;
import vista.PantallaHistoria;
import vista.PantallaInicio;
import vista.PantallaJuegos;
import vista.PantallaOpciones;
import vista.PantallaPrincipal;
import vista.PantallaQuiz;

public class ManejoVistas {
	
	private PantallaInicio pI;
	private PantallaHistoria pH;
	private Decada70 d70;
	private Decada80 d80;
	private Decada90 d90;
	private Decada00 d00;
	private Decada10 d10;
	private PantallaConsolas pC;
	private PantallaJuegos pJ;
	private PantallaQuiz pQ;
	private PantallaOpciones pO;	
	private PantallaPrincipal pP;
	private PantallaDeCarga pCar;
	
	private ManejoApis control;
	
	private Properties textoEsp;
	private Properties textoIng;
	private InputStream archivoEs=null;
	private InputStream archivoIn=null;

	public ManejoVistas(ManejoApis x) {
		control = x;
		
		try{
			textoEsp=new Properties();
			archivoEs=new FileInputStream(this.getClass().getResource("/castellano.properties").getFile());
			textoEsp.load(archivoEs);
		}catch(IOException t){
			t.printStackTrace();
		}
		finally{
			if(archivoEs!=null){
				try{
					archivoEs.close();
				}catch(IOException b){
					b.printStackTrace(); 
				}
			}
		}
		
		try{
			textoIng=new Properties();
			archivoIn=new FileInputStream(this.getClass().getResource("/english.properties").getFile());
			textoIng.load(archivoIn);
		}catch(IOException t){
			t.printStackTrace();
		}
		finally{
			if(archivoIn!=null){
				try{
					archivoIn.close();
				}catch(IOException b){
					b.printStackTrace(); 
				}
			}
		}
		
		
		
		
		pCar=new PantallaDeCarga(control);
		pI= new PantallaInicio();
		pH= new PantallaHistoria();
		d70 = new Decada70();
		d80 = new Decada80();
		d90 = new Decada90();
		d00 = new Decada00();
		d10 = new Decada10();
		pC= new PantallaConsolas(control);
		pJ= new PantallaJuegos(control);
		pQ= new PantallaQuiz(control);
		pO= new PantallaOpciones(this);	
		pP= new PantallaPrincipal(control,this);
		pP.setVisible(true);
	}
	
	

	public ManejoApis getControl() {
		return control;
	}



	public Properties getTextoEsp() {
		return textoEsp;
	}



	public Properties getTextoIng() {
		return textoIng;
	}


	public PantallaInicio getpI() {
		return pI;
	}

	public PantallaHistoria getpH() {
		return pH;
	}

	public Decada70 getD70() {
		return d70;
	}

	public Decada80 getD80() {
		return d80;
	}

	public Decada90 getD90() {
		return d90;
	}

	public Decada00 getD00() {
		return d00;
	}

	public Decada10 getD10() {
		return d10;
	}

	public PantallaConsolas getpC() {
		return pC;
	}

	public PantallaJuegos getpJ() {
		return pJ;
	}

	public PantallaQuiz getpQ() {
		return pQ;
	}

	public PantallaOpciones getpO() {
		return pO;
	}

	public PantallaPrincipal getpP() {
		return pP;
	}

	public PantallaDeCarga getpCar() {
		return pCar;
	}
	
	

}
