package tp2.ej4;

import tp2.ej1y2.BinaryTree;

public class RedBinariaLlena {
	private BinaryTree<Integer> arbol;

	public RedBinariaLlena() {
	}

	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	// DECIDI HACER RECORRIDO EN PROFUNDIDAD
	public int retardoReenvio(BinaryTree<Integer> arbol) {
		if (arbol.isLeaf())
			return arbol.getData();

		int izq = retardoReenvio(arbol.getLeftChild());
		int der = retardoReenvio(arbol.getRightChild());

		int mayor = ((izq > der) ? izq : der);

		return arbol.getData() + mayor;
	}
}
