package tp2_ej3;
import java.util.LinkedList;
import java.util.Iterator;

import tp2_ej2.Ej2;

public class Ej3 {
	
	public static void main(String [] args) {
		//Genero el objeto y el arbol
		ContadorArbol c = new ContadorArbol();
		c.setT(Ej2.generarArbol());  

		
		// PRE ORDEN
		System.out.println("Impresion PreOrden del arbol:");
		c.getTree().printPreorden();
		
		LinkedList<Integer> listaPreOrden = new LinkedList<Integer>();
		listaPreOrden.addAll(c.numerosParesPreorden());
		
		System.out.println("Elementos de la lista en preOrden:");
		Iterator<Integer> it= listaPreOrden.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		// EN ORDEN
		System.out.println("Impresion enOrden del arbol:");
		c.getTree().printInorden();

		LinkedList<Integer> listaInOrden = new LinkedList<Integer>();
		listaInOrden.addAll(c.numerosParesInorden());
		
		System.out.println("Elementos de la lista en preOrden:");
		Iterator<Integer> it2= listaInOrden.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
	}
}
