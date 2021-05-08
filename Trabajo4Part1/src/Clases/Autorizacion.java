package Clases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Autorizacion {
	private boolean Estado;
	private String FechaVigente;
	
	
	//constructor// 
	
	public Autorizacion (boolean Estado, String FechaVigente) {
		this.Estado = Estado;
		this.FechaVigente = FechaVigente;
	}

	public Autorizacion() {
		// TODO Auto-generated constructor stub
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}

	public String getFechaVigente() {
		return FechaVigente;
	}

	public void setFechaVigente(String fechaVigente) {
		FechaVigente = fechaVigente;
	}
	//se fija si el estado es verdadero o no y devuelve un cartel si puede circular//
	public String VerificarAutorizacion() {
		String Resultado;
		if (Estado) {
			Resultado = (" Esta autorizado " + FechaVigente + " "); 
		} else {
			Resultado = (" No esta autorizado "+ FechaVigente+ " " ); 
		}
		return Resultado;
	}
	
	public void GenerarAutorizacion() throws ParseException {
		FechaVigente = Aleatoreos.intAleatorio(1, 30) + "/" + Aleatoreos.intAleatorio(1, 12) + "/" + 2021; 
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Creamos un formato de fecha
		Date fecha = format.parse(FechaVigente);
		Date objDate = new Date(); 
		
			if (objDate.before(fecha)) {
				Estado = true;
			} else {
				Estado = false;
			}
	
				
	}
}
