package tp3.ej11;

import tp1.ej8.Queue;
import tp3.ej1_3_5.GeneralTree;

public class Parcial {

	public static boolean resolver(GeneralTree<Integer> arbol) {
		if (arbol == null)
			return false;

		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();

		cola.enqueue(arbol);

		int nodosAnterior = 0;

		while (!cola.isEmpty()) {
			int nodosNivel = cola.size();
			if (nodosNivel != nodosAnterior + 1)
				return false;

			for (int i = 0; i < nodosNivel; i++) {
				GeneralTree<Integer> act = cola.dequeue();
				for (GeneralTree<Integer> hijo : act.getChildren()) {
					cola.enqueue(hijo);
				}
			}

			nodosAnterior = nodosNivel;
		}
		return true;
	}
	
	public static boolean resolverV2(GeneralTree<Integer> arbol) {
		if (arbol == null)
			return false;
		
		
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		
		cola.enqueue(arbol);
	
		
		int nodosSig= 0;
		int nodosNivel = 1;
		
		while(!cola.isEmpty()) {
			for (int i=0;i<nodosNivel;i++) {
				GeneralTree<Integer> act = cola.dequeue();
				for(GeneralTree<Integer> hijo: act.getChildren()) {
					cola.enqueue(hijo);
					nodosSig++;
					if (nodosSig == nodosNivel +2)
						return false;
				}
			}
			
			if (nodosSig != nodosNivel +1)
				return false;
			
			nodosNivel = nodosSig;
		}
		return true;
	}
	
	
}
