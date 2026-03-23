//Lista enlazada simple
package ejeArrayList.eje02;

/**
 * Lista de libro de una biblioteca
 * 
 * @author (brayan) 
 * @version (1.0)
 */
public class ListaLibros
{
//El inicio de la lista (primero=puntero)
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
//Al crear la lista, está vacía,el primer elemento no apunta a nada.  
        primero = null;
    }
    
// Incluye un nuevo libro en la lista
    public void pon( Libro valor){
        if(valor == null )return; //Comprueba valor tiene valor o es nulo en ese caso sale.
        valor.siguiente=primero; //el nuevo nodo valor  se engancha a primero
        primero=valor;//actualiza valor ahora es el primero.
    }
    
    public boolean estaVacia(){
       return ( primero == null );// comprueba si primero es nulo..
    }
    
// Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
// llama al metodo y si esta vacia devuelve nulo, id no entra en juego..
    	if(estaVacia()) return  null;
//El libro a quitar es el primero, si el id es = al primero 
    	if(primero.id==id) {
    		Libro aux = primero; // aux variable que guarda al primer libro
    		primero = primero.siguiente; // asignamos el segundo a la primera posicion
    		aux.siguiente=null;//aux=primero le quitamos siguiente asignando null.. queda libre
    		return aux; // devuelve el primer libro
    	}    
//Buscar en el resto de la lista
//crea variable actual que sea el primer libro
    	Libro actual = primero;
//si el segundo libro es null para y si la id del segundo libro es igual para.. 
    	while (actual.siguiente != null && actual.siguiente.id !=id) {
//en cada ciclo actual va tomando valores de id diferentes
    		actual = actual.siguiente;
    	}
//Si se encontro el libro
// preguntamos por que que puede ser que no encontro el libro y seria null
    	if(actual.siguiente != null) {
//actual.siguiente digamos que es el id5 pasa aextraer
    		Libro aExtraer = actual.siguiente;
//aextraersiguiente es el id6 que toma la conexion de id5
    		actual.siguiente=aExtraer.siguiente;
    		aExtraer.siguiente=null;// le damos null para que no este enganchado a los demas..
    		return aExtraer;// devuelve el libro buscado por ID.
    	}
    		return null; //Nunca encontro la ID que buscaba
    }
   
// Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
        Libro actual = primero; //buscamos desde el primero asignando ala variable actual
        while (actual!= null) {
//.trim borra los espacios vacíos accidentales al principio o al final ejem " El Quijote "
//.equalsIgnoreCaseCompara el texto ignorando mayúsculas y minúsculas
        	if(actual.titulo.trim().equalsIgnoreCase(titulo.trim())) {
        		return actual.id; // si es verdad devuelve la id y termina el metodo...
        	}
//Para el siguiente ciclo se toma el siguiente libro , en la variable actual
        	actual = actual.siguiente;
        }
//while terminado sin entrar al if y devuelve -1 por que nunca se usan para id.
    return -1;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
//Llama al metodo estavacia, imprime el mensaje y sale..
    	if(estaVacia()) {
    		System.out.println("La lista esta vacia.");
    		return;
    	}
//Empezamos desde el primero en la variable actual
    	Libro actual = primero;
    	while (actual != null) { // mientras el libro no sea nulo
//imprima el id y metodo .tostring(titulo,autor,genero..) de lo que contenga actual
    		System.out.println("" + actual.id + ":"+ actual.toString());
//Una vez impreso el libro actual pasa al siguiente, dandole ese valor a la variable actual..
    		actual = actual.siguiente;
    	}
    	
    }
         
    

}