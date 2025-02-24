package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.FactoriaFuenteDatosMemoria;

public enum FactoriaFuenteDatos {

	MEMORIA {
		public IFuenteDatos crear() {
			return new FactoriaFuenteDatosMemoria();
		}
	};
	
	private FactoriaFuenteDatos() {
		
	}
	
	public abstract IFuenteDatos crear();
}
