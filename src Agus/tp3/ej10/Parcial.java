package tp3.ej10;

import java.awt.geom.GeneralPath;
import java.util.LinkedList;
import java.util.List;

import tp3.ej1_3_5.GeneralTree;

public class Parcial {

	public static List<Integer> resolver(GeneralTree<Integer> arbol){
		List<Integer> lista = new LinkedList<Integer>();
		
		resolver(arbol,0,0,lista);
		
		return lista;
	}
	
	
	
	private static int resolver(GeneralTree<Integer> arbol,int valor, int nivel, List<Integer> lista){
		
		if (arbol.getData() == 1)
			lista.add(1);
		
		valor += nivel * arbol.getData();
		
		List<Integer> maxLista = new LinkedList<Integer>();
		
		int max = Integer.MIN_VALUE;
		for(GeneralTree<Integer> hijo: arbol.getChildren()) {
			List<Integer> aux = new LinkedList<Integer>();
			int act = resolver(hijo,valor,nivel+1,aux);
			
			if (act > max) {
				max = act;
				maxLista = aux;
			}			
		}	
		
		
		// RETORNOS (NO COLGAR)
		lista.addAll(maxLista);
		
		return max;
		
		
	}
	
}
