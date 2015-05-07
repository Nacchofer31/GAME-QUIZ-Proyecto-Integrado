package controlador;

import modelo.ApiJSONEmpresas;
import modelo.ApiJSONGenero;
import modelo.ApiJSONVideojuegos;

public class ManejoApis {
	private ApiJSONVideojuegos apiJuegos;
	private ApiJSONGenero apiGenero;
	private ApiJSONEmpresas apiEmpresa;

	public ManejoApis() {
		apiJuegos = new ApiJSONVideojuegos();
		apiGenero = new ApiJSONGenero();
		apiEmpresa = new ApiJSONEmpresas();
		
	}

}