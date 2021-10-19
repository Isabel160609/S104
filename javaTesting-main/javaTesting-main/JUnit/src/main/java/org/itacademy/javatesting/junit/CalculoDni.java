package org.itacademy.javatesting.junit;

public class CalculoDni {

	private int numDni;
	private String letraDni;
	private static final String [] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	
	
	public CalculoDni(int numDni) {
		this.numDni=numDni;
		letraDni=calculaLetra(numDni);
	}
	
	public static String calculaLetra(int numDni) {
		 String letra;
		 int resto = numDni % 23;
		 letra=letras[resto];
		 return letra;
	}

}
