package collection2ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ClaseArrayList1Profe {

	public static void main(String[] args) {
		
		// Creo la lista 
		List<Object> lista = new ArrayList<>();
		
		lista.add(3);
		lista.add(3.5);
		lista.add(1, "hola"); // el 1 de aquí se refiere al espacio de la lista que ocupará, es decir, entre el 3 y el 3.5
		lista.add(45);
		
		// Visualiza los elementos 
		System.out.println("--- VER LISTA ---");
		visualizar(lista);
		
		// Sustituir el elemento de la posicion 2 por 'b'
		System.out.println("--- VER LISTA con b (pos 2) ---");
		lista.set(2, 'b');
		visualizar(lista);
		
		// Borrar el elemento de la posicion 3
		System.out.println("--- VER LISTA sin el elemento 3 (0,1,2, 3 <--) ---");
		lista.remove(3);
		visualizar(lista);
		
		// Borrar el elemento por contenido
		lista.remove("hola");
		System.out.println("--- VER LISTA sin hola (pos 1) ---");
		visualizar(lista);
		
	}

	private static void visualizar(List<Object> lista) {
		ListIterator<Object> iter = lista.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
