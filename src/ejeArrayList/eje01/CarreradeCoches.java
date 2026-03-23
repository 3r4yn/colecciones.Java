/*
 *  Simulación sencilla de una carrera de coches
 */
package ejeArrayList.eje01;

import  java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CarreradeCoches {
	
	public static void main(String[] args) {
			
		Random valor = new Random();  // Variable que me genera números aleatorios
		final int META = 1500; // 1500 kilómetros		
		Coche parrilla [] = new Coche [5]; // Parrilla de salida con 5 coches
		var parrilla = new Arraylist<Coche>(); //En un arraylist le doy un tamaño inicial o crea uno de 10 por defecto
		
		parrilla.add = (new Coche ("Ferrari",300));
		parrilla.add = (new Coche ("600",100));
		parrilla.add = (new Coche ("BMW",220));
		parrilla.add = (new Coche ("Seat",150));
		parrilla.add = (new Coche ("La Cabra",10));
		
		// Test de pruebas para comprobar la detección de errores
	
		Coche c1 = parrilla.get(0);
		Coche c2 = parrilla.get(1);
		c1.acelera(10);
		c2.frena(20);
		c1.parar();
		c2.recorre();
	
		
		// Arranquen los motores
		for(coche c:parrilla){
			c.arrancar();
		}
		
		// Comienza la carrera
		
		do {
			for (coche c:parrilla) {
				c.acelera(valor.nextInt(40));
				c.recorre();
				c.frena(valor.nextInt(10));
				System.out.println(c.info());
			}
			System.out.println("----------------------------------------");
				
		} while ( ! alcanzarMeta ( parrilla), META) );
		
		Collections.sort(parrilla, (a,b) -> (a.getKilometros() - b.getKilometros()));

		// Ordena la tabla para mostrar la clasificación
	    ordenarClasificacion ( parrilla);
		
		// Muestra la clasificación
		for(int i=0; i< parrilla.size(); i++){
			System.out.println((i+1)+"º Clasificado "+ parrilla[i].info());
		}
		
	
	}

	// MÉTODO AUXILIAR
	// Devuelve verdadero si hay algun coche que haya recorrido la distancia indicada.
	
	static public boolean alcanzarMeta (Arraylist<Coche>parrilla, int distancia){
		boolean fin = false;
		for (int t = 0; t < parrilla.size(); t++) {
		     if ( parrilla.get(t).getKilometros() >= distancia ){
		    	 fin = true; 
		    	 break;
		     }
		}
		return fin;
	}
	
	// Ordeno por el método de la burbuja, no es le mejor pero si el más
	// sencillo. Ordena de Mayor a  Menor
	static void ordenarClasificacion ( Coche tcoches[]){
	    int i =0;
	    boolean haycambios = true;
	    while (haycambios) {
			haycambios = false;
			for (int j=0; j < tcoches.length-i-1; j++){
				// Si no esta ordenado realizo el intercambio
				if ( tcoches[j].getKilometros() < tcoches[j+1].getKilometros()){
					Coche aux = tcoches[j];
					tcoches[j] = tcoches[j+1];
					tcoches[j+1] = aux;
					haycambios = true;
				}
			}
			i++;
	    }	
	}
}
	

