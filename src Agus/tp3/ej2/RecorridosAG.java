package tp3.ej2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp3.ej1.GeneralTree;

public class RecorridosAG {

	public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> lista = new LinkedList<Integer>();

		int data = a.getData();

		if ((data % 2 != 0) && (data > n)) {
			lista.add(data);
		}

		if (a.hasChildren()) {
			for (GeneralTree<Integer> child : a.getChildren()) {
				lista.addAll(numerosImparesMayoresQuePreOrden(child, n));
			}
		}

		return lista;
	}

	public List<Integer> numerosImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> lista = new LinkedList<Integer>();

		int data = a.getData();

		if (a.hasChildren()) {
			Iterator<GeneralTree<Integer>> it = a.getChildren().iterator();

			if (it.hasNext()) {
				lista.addAll(numerosImparesMayoresQuePreOrden(it.next(), n)); // primer hijo
			}
			if ((data % 2 != 0) && (data > n)) { // actual
				lista.add(data);
			}
			while (it.hasNext()) {
				lista.addAll(numerosImparesMayoresQuePreOrden(it.next(), n)); // resto de hijos
			}
		}
		return lista;
	}
	
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> lista = new LinkedList<Integer>();
		
		if (a.hasChildren()) {
			for (GeneralTree<Integer> child : a.getChildren()) {
				lista.addAll(numerosImparesMayoresQuePreOrden(child, n));
			}
		}
		
		int data = a.getData();
		if ((data % 2 != 0) && (data > n)) {
			lista.add(data);
		}
		
		return lista;
	}
	
	
}
