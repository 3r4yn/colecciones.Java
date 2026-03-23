package ejeArrayList.eje03;
import java.util.ArrayList;
import java.util.Random;

public class valoresAleatorios {
    public static void main(String[] args) {
        Random rd = new Random();//Genera aleatorio
        
// Tamaño aleatorio entre 10 y 20 (inclusive)
//rand.nextInt genera desde 0, y (11) es el nuemero de indices que tendremos
//+10 para llegar a maximo 20
        int tamano = rd.nextInt(11) + 10; 
//Arraylist que solo aceptara numeros enteros y 
        ArrayList<Integer> numeros = new ArrayList<>();
// LLENAMOS LA LISTA CON VALORES ENTRE 0 Y 100
        for (int i = 0; i < tamano; i++) {
//genera aleatorios y lo guarda con el metodo .add en la arraylist numeros.
            numeros.add(rd.nextInt(101));
        }

// a) Mostrar el contenido inicial
        System.out.println("Lista inicial: " + numeros);

// b) Calcular la sumas
        int suma = 0;
// for each cada numero dentro del arraylist numeros 
        for (int n : numeros) {
// suma en la variable suma
            suma += n;
        }
        System.out.println("La suma de los elementos es: " + suma);

// c) Borrar números pares (Actualizado con removeIf)
// La lambda (n -> condition) elimina automáticamente lo que sea par
        numeros.removeIf(n -> n % 2 == 0);
        System.out.println("Tras borrar pares: " + numeros);

// d) Reemplazar divisibles por 3 con 0 (Actualizado con replaceAll)
// Si el número es divisible por 3, devuelve 0; si no, deja el número (n)
// replaceAll aplica la regla en cada uno de los elementos automaticamente.
//n es divisible por 3 , (?) pregunta si es true dame un 0 y si es no (:n) devuelve n
        numeros.replaceAll(n -> (n % 3 == 0) ? 0 : n);
        System.out.println("Tras reemplazar divisibles por 3: " + numeros);
        
// e) Si es divisible por 5, insertar 555 en la posición anterior
//numeros.size se vuelve a calcular en cada ciclo
        for (int i = 0; i < numeros.size(); i++) {
//Accedemos al valor de cada posicion y comprueba que no sea 0 para no interferir con los creados antes
//y comprueba que el residuo de dividir el numero entre 5 es 0. Por lo cual es  multiplo 
            if (numeros.get(i) != 0 && numeros.get(i) % 5 == 0) {
//inserta en el indice, el valor 555 empujando hacia la derecha a los elementos.
                numeros.add(i, 555);
                i++; // evalua el siguiente valor, en el siguiente ciclo
            }
        }
        System.out.println("Tras insertar 555 ante divisibles por 5: " + numeros);
    }
}