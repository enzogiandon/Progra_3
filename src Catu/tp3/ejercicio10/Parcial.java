package tp3.ejercicio10;

import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;

public class Parcial {
	public static List<Integer> resolver(GeneralTree<Integer> arbol){
	   if (arbol == null) {
			return null;
		}
	   
	    List<Integer> lista = new LinkedList<Integer>();
		resolver(arbol,0,0,lista);	
		return lista;
	}
	
	private static int resolver(GeneralTree<Integer> a,int nivel,int suma, List<Integer> l){
		int dato = a.getData();
		
		if (dato == 1) {
			l.add(dato);
		}
		suma  = suma + (dato * nivel);
		
		int max = 0;
		List<Integer> maxL = new LinkedList<Integer>();
		for (GeneralTree<Integer> child : a.getChildren()) {
			int aux = resolver(child,nivel+1,suma,l);
			if (aux > max) {
				max= aux;
				maxL=l;
			}
		}
		l.addAll(maxL);
		
		return max;
	}

}
