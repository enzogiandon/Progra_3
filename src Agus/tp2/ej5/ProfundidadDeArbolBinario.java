package tp2.ej5;

import tp2.ej1y2.BinaryTree;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbol;

	public ProfundidadDeArbolBinario() {
	}

	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public int sumaElementosProfundidad(BinaryTree<Integer> arbol, int p) {

		if (arbol== null || (p < 0))
			return 0;
		if (p == 0)
			return arbol.getData();

		int suma = 0;
		if (arbol.hasLeftChild())
			suma += sumaElementosProfundidad(arbol.getLeftChild(), p - 1);

		if (arbol.hasRightChild())
			suma += sumaElementosProfundidad(arbol.getRightChild(), p - 1);

		return suma;
	}
}
