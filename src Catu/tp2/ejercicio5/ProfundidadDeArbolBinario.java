package tp2.ejercicio5;

import tp2.ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbol;
	
	public ProfundidadDeArbolBinario (BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	

	public int sumaElementosProfundidad (int p) {
		
		return suma(arbol,p);
		
	}
	
	
	private int suma(BinaryTree<Integer> arbol, int p) {
		
		if (arbol == null) {
            return 0;
        }
	
		if (p==0) {
			return arbol.getData();
		}
			
		int suma = 0;
		
		if (arbol.hasLeftChild()) {
			suma += suma(arbol.getLeftChild(),p-1); 
			
		}
		if (arbol.hasRightChild()) {
			suma += suma(arbol.getRightChild(),p-1); 
		}
			
			
		return suma;
	}

}
