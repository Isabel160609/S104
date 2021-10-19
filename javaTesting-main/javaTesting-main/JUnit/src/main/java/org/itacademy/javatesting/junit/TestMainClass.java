package org.itacademy.javatesting.junit;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestMainClass {

	//Exercici1
	@Test  //junit5
	public void InsertaLlista() {

		String[] elementos = { "Enero", "Febero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		MainClass llista = new MainClass(elementos);	

		assertEquals(llista.getSize(),12);	
		assertNotNull(llista);	
		assertEquals(llista.getElement(7),"Agosto"); 

		

	}
	

	// Exercici2
	public String calculaLetra(int a) {
		String resultado= CalculoDni.calculaLetra(a);
		return resultado;
		
	}
	@ParameterizedTest
	@MethodSource("testCalculaLetra")
	void testCalculaLetraDni(int a,String esperado) {
		
		assertEquals(calculaLetra(a),esperado );
		
	}
	 
	 static Stream<Arguments> testCalculaLetra() {
	     return Stream.of(
	         Arguments.arguments(46354180, "A"),
	         Arguments.arguments(7002628,"W"),
	         Arguments.arguments(22222222,"J"),
	         Arguments.arguments(11111111,"H"),
	         Arguments.arguments(33333333,"P"),
	         Arguments.arguments(88888888,"Y"),
	         Arguments.arguments(12345678,"Z"),
	         Arguments.arguments(44444444,"A"),
	         Arguments.arguments(55555555,"K"),
	         Arguments.arguments(66666666,"Q")

	     );
	 }
	
	//exercici3
	@Test
	void testExpectedException() {
		int []numeros= {1,2,3};
	  
	  Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
		  int numero=numeros[3];
	  });
	 
	}

}


