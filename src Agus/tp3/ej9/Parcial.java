package tp3.ej9;

import tp3.ej1_3_5.GeneralTree;

public class Parcial {
	
	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		
		int min = Integer.MAX_VALUE;
		for(GeneralTree<Integer> hijo: arbol.getChildren()) {
			min = Math.min(min, hijo.getData());
			

			if (min<arbol.getData())
				return false;
			
			if (!esDeSeleccion(hijo))
				return false;
		}
		
		return true;
		
	}
}
