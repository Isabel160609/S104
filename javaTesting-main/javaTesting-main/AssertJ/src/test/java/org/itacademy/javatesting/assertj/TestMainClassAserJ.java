package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMainClassAserJ {

//	@Test
//    void exercici1() {
//        assertThat(6).isNotEqualTo(7);
//    }
//
//  @Test
//  void a_few_simple_assertions() {
//    assertThat("The Lord of the Rings").isNotNull()
//                                       .startsWith("The") 
//                                       .contains("Lord") 
//                                       .endsWith("Rings"); 
//  }
// 
//  @Test
//  void a_test(){
//        assertThat("frodo")
//          .isNotEqualTo("sauron");
//        //  .isIn("frodo jodo sauron somo");
//  }
//  @Test
//  void a_test2(){
//        assertThat("Frodo")
//          .startsWith("Fro")
//          .endsWith("do");
//        //  .isEqualToIgnoringCase("frodo");
//  }
//  @Test
//  void a_test3(){
//        assertThat("frodosam")
//          .hasSize(8)
//          .contains("frodo", "sam")
//          .doesNotContain("sauron");
//    }
//	Exercici 1. Una asserció que demostri que el valor de dos objectes sencers és igual, i una altra que indiqui que no ho és
	@Test
	 void exercici1() {
		  assertThat(7).isEqualTo(7);
		  assertThat(5).isNotEqualTo(7);
	}
	//Exercici 2. Una asserció que demostri que la referència a un objecte és la mateixa que una altra, i una altra que indiqui que és diferent.
	@Test
    void exercici2(){
		assertThat("Isabel").isEqualTo("Isabel");
		assertThat("Isa").isNotEqualTo("Isabel");
	}
	//Exercici 3. Una asserció que indiqui que dues arrays d'enters són idèntics.
	@Test
    void exercici3(){
		int primero[]= {1,2,3};
		int segundo[]={1,2,3};
		assertThat(primero).isEqualTo(segundo);
	}
	//Exercici 4. Creu un array list contenidor de diversos tipus d'objectes (creu-los també). Escrigui una asserció per a verificar l'ordre dels objectes en el ArrayList segons van ser inserits.
	//Ara verifiqui que la llista anterior conté els objectes en qualsevol ordre.
	//Verifiqui que, en la llista anterior, un dels objectes s'ha afegit només una vegada. Deixi un dels elements sense afegir, i verifiqui no la llista no conté aquest últim.
	 @Test
	void exercici4(){
		  ArrayList<Integer> primera= new ArrayList<Integer>();
			primera.add(1);
			primera.add(2);
			primera.add(3);

			//Escrigui una asserció per a verificar l'ordre dels objectes en el ArrayList segons van ser inserits.
			assertThat(primera).isSorted();
			//Ara verifiqui que la llista anterior conté els objectes en qualsevol ordre.
			assertThat(primera).contains(2,1,3);
			assertThat(primera).contains(1,2,3);
			assertThat(primera).contains(3,2,1); 
			//Verifiqui que, en la llista anterior, un dels objectes s'ha afegit només una vegada
			assertThat(primera).containsOnlyOnce(1,2,3);
			//Deixi un dels elements sense afegir, i verifiqui no la llista no conté aquest últim.
	
			assertThat(primera).doesNotContain(4);
		}
	  //Exercici 5. Creu un map i verifiqui que conté una de les key que li afegeixi.
	  @Test
	  void exercici5(){
		  Map<Integer, String> map = new HashMap<Integer, String>();
		  
		  map.put(1, "uno");		
		  map.put(2, "dos");		
		  map.put(3, "tres");		
		  assertThat(map).containsKeys(1);
		  
	  }
//	  //Exercici 6. Provoqui una ArrayIndexOutOfBoundsException en una classe qualsevol. Creu una asserció que validi que l'excepció és llançada quan correspon.
//	  @Test
//	    void exercici6(){
//			int primero[]= {1,2,3};
//			//assertThat(primero[3]).
//			assertThat
//	;
//		}
	  void testExpectedException() {
			int []numeros= {1,2,3};
		  
		  Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			  int numero=numeros[3];
		  });
	  }
		  
	  //Exercici 7. Creu un objecte Optional buit. Escrigui l'asserció correcta per a verificar que efectivament està buit.
	  @Test
	    void exercici7(){
		  assertThat("").isEmpty();
	  }
}
	
