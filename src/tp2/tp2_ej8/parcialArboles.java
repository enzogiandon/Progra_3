package tp2_ej8;
import arbolBinario.BinaryTree;


public class parcialArboles {
	private BinaryTree<Integer> tree;
	
	public parcialArboles() {
		tree = new BinaryTree<Integer>();
	}
	
	public parcialArboles(int num) {
		tree = new BinaryTree<Integer>(num);
	}
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		
		if (arbol1 == null) return true; // Si es vacío siempre es prefijo
		if (arbol2 == null) return false; // Si el 1 no es vacío pero el 2 sí, entonces el 1 no es prefijo
		
		
		
		boolean left = esPrefijo(arbol1.getLeftChild(),arbol2.getRightChild());
		
		if (!left) // si el izquierdo es falso ya está con eso
			return false;
		
		else  // si no, retorno lo que sea el derecho
			return esPrefijo(arbol2.getRightChild(),arbol2.getRightChild());
		
	}
	
	
	
	
}
