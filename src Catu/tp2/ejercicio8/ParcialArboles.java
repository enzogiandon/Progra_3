 package tp2.ejercicio8;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol1;
	private BinaryTree<Integer> arbol2;

	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol1 = arbol;
		this.arbol2=arbol; 
	}



	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2){
        
		if (arbol1 == null) { //caso arbol1 = null y arbol2 = null o != null
			 return true;
		}
		
		if (arbol2 == null && arbol1 != null) { //caso arbol2 = null y arbol1 != null
				return false;
			}
		
		
		boolean aux=false;
		
		if (arbol1.getData() == arbol2.getData()) {
			aux=true;
		}
		
		if (aux) {		
			aux = esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild());
			if (aux) {
			 aux = esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
			 return aux;
			}
		}
		
	
		
		return aux;
		
		
	}
	
	
}
