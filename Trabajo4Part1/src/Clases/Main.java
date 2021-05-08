package Clases;

import java.text.ParseException;

public class Main {
	public static void main (String []args) throws ParseException {
		String nombre, apellido, domicilio, telefono, email, actividad; 
		long DNI;
		Autorizacion aut;
		System.out.println("Ingrese nombre de la persona");//cargo persona manual//
		nombre = TecladoIn.readLine();
		System.out.println("DNI");
		DNI = TecladoIn.readLong();
		Persona P =new Persona(); 
		P.setNombre(nombre);
		P.setDNI(DNI);
		aut = new Autorizacion(); 
		aut.GenerarAutorizacion();
		P.setAutorizacion(aut);
		System.out.println(" La persona " + P.getNombre() + " De DNI " + P.getDNI()+ " " + P.getAutorizacion().VerificarAutorizacion());
		Persona [] arreglo= new Persona[10]; //Cargo personas aleatoreas para probar//
			 for (int i=0; i<10;i++) {
				 arreglo[i]= new Persona();
				 arreglo[i].setNombre(Aleatoreos.stringAleatorio(8));
				 arreglo[i].setDNI((long)Aleatoreos.intAleatorio(11111111, 99999999));
				 aut = new Autorizacion(); 
				 aut.GenerarAutorizacion();
				 arreglo[i].setAutorizacion((aut));
			 }
			 	for (int i=0; i<10;i++) {
			 		System.out.println(" La persona " + arreglo[i].getNombre() + " De DNI " + arreglo[i].getDNI() + " " + arreglo[i].getAutorizacion().VerificarAutorizacion());
			 	}
			 	
			 
	}
	

}
