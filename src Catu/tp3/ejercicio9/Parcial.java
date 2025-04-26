package tp3.ejercicio9;

import tp3.ejercicio1.GeneralTree;

public class Parcial {
	
	
	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		if (arbol == null) {
			return false;
		}
		
		return esDeSeleccion (arbol,999,0,false);
		
	}
	
	private static boolean esDeSeleccion (GeneralTree<Integer> a,int min,int padre,boolean es) {
		int dato = a.getData();
		if (dato < min) {
			min = dato;
		if (min == padre) {
			es = true;
		}
		for (GeneralTree<Integer> child : a.hasChildren()) {
			esDeSeleccion(child,min,dato,es);
			if (!es){
				return false;
			}
		}
	}

}
