/**
 * Implementa el control de acceso al área restringida de un programa
 */
package ejeHasmap02;

import java.util.HashMap;
import java.util.Scanner;

public class eje02 {

	public static void main(String[] args) {
//Otra forma
//hashmap<String,String> datuser= new HashMap <String,String>();
		var datuser= new HashMap <String,String>();
//clave login, valor pssword
		datuser.put("root","root");
		datuser.put("alumno","alumno1");
		datuser.put("admin","12345");
		datuser.put("master","12345");
		
		String login;
		String passwd;
		String passwd_store;
		Scanner sc =  new Scanner(System.in);
		
		
//Recupera la clave almacenada
		
		boolean accesoConcedido = false;
		int intentos = 0;
		do{
			System.out.println("Login:");
			login= sc.nextLine();
			System.out.println("Password:");
			passwd= sc.nextLine();
			passwd_store  = datuser.get(login);
		if(passwd_store != null && passwd_store.equals( passwd)) {
			accesoConcedido= true;
		}else {
			System.out.println("Usuario y clave incorrecto");
			intentos++;
		}
		}while ( intentos < 3 && !accesoConcedido );
		
		if (accesoConcedido) {
			System.out.println("Bienvenido al sistema");
		
		}else {
			System.out.println("Superado el nº maximo de intentos");
		}
	}

}
