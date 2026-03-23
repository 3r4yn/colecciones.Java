package ejeHashmap04;

import java.util.HashMap;
import java.util.Scanner;

public class Eliza {
	
	public static void main(String[] args) {
		
		var map = new HashMap <String,String> (); 
		
		map.put("HOLA", "Hola, ¿qué tal?");
		map.put("ENCANTADO", "Encantado de conocerte yo también");
		map.put("ADIOS", "Adiós, espero volverte a ver pronto");
		map.put("HORA", "Lo siento, no llevo reloj");
		map.put("NOMBRE", "Mi nombre es Eliza");
		
		String msgDefault = "Lo siento, no te comprendo";

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenidos al sistema Eliza 0.0:");
		String frase;
		boolean fin=false;
		do {
			frase = sc.nextLine();
			boolean encontrada = false;
			for (String clave: map.keySet()) {
//touppercase comvierte en mayusculas y comprueba si contiene el texto HOLA
				if (frase.toUpperCase().contains(clave)) {
					encontrada = true;
					System.out.println(">"+map.get(clave));
				if (frase.toUpperCase().contains("ADIOS")){
					fin=true;
				}
//Cuando la encuentre para.
				break;
				}
			}
			
			if(!encontrada) {
				System.out.println(msgDefault);
			}
			
		}while( ! fin);
				
		System.out.println("Muchas gracias por conectarse");
		
		}
	}
//