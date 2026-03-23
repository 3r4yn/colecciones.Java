package ejeHasmap03;

import java.util.HashMap;
import java.util.Scanner;

public class MiniDiccionario {

	public static void main(String[] args) {
		
		var diccionario = new HashMap <String,String>();
//10 palabras y su traduccion
		diccionario.put ("Adios", "bye");
		diccionario.put ("Hola", "Hello");
		diccionario.put ("foot", "pie");
		diccionario.put ("food", "comida");
		diccionario.put ("dream", "sueño");
		diccionario.put ("house", "casa");
		diccionario.put ("Hola", "Hello");
		diccionario.put ("libro", "book");
		diccionario.put ("perro", "dog");
		diccionario.put ("ventana", "windows");
		Scanner sc = new Scanner (System.in);
		System.out.println("Palabra en castellano: hola");
		String palabraCas = "Hola";
		System.out.println("Palabra en ingles:");
		String palabraIng = sc.nextLine();
		if (diccionario.get("Hola").equals(palabraIng)) {
			System.out.println("Acierto");
		}else {
			System.out.println(" Fallo");
		}
	}

}
