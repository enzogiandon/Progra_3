package tp2.ej8;

import tp2.ej1y2.BinaryTree;

public class ParcialArboles {

	public ParcialArboles() {

	}

	public static boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		if (arbol1 == null)
			return true;
		if(arbol2 == null)
			return false;

		if (arbol1.getData() == arbol2.getData()) {
			if (esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild())) {
				return esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
			}
		}

		return false;

	}
}
