package tp2.ej7;

import tp2.ej1y2.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol;

	public ParcialArboles() {
	}

	public boolean isLeftTree(int num) {

		// Primero busco el sub arbol de raiz "num"
		BinaryTree<Integer> subArbol = buscar(arbol, num);
		
		if (subArbol == null)
			return false;
		
		int sumaIzq = contarUnicoHijo(subArbol.getLeftChild());
		
		int sumaDer = contarUnicoHijo(subArbol.getRightChild());
		
		return sumaIzq > sumaDer;
		
		
		
		
	}

	private BinaryTree<Integer> buscar(BinaryTree<Integer> arbol, int num) {
		if (arbol == null)
			return null;

		if (arbol.getData().equals(num))
			return arbol;

		// Busco por izquierda si está
		BinaryTree<Integer> ResultadoIzq = buscar(arbol.getLeftChild(), num);
		if (ResultadoIzq != null)
			return ResultadoIzq;

		// Si no está, busco por derecha, y lo devuelvo (aunque sea null no importa).
		return buscar(arbol.getRightChild(), num);

		
		
	}

	private int contarUnicoHijo(BinaryTree<Integer> arbol) {
		// SOLO ENTRA ACA si le mande el hijo del arbol original (porque no chequea si tiene hijo)
		if (arbol == null)
			return -1;
		
		if (arbol.isLeaf())
			return 0;
		
		int suma = 0;
		
		if (arbol.hasLeftChild()) 
			suma += contarUnicoHijo(arbol.getLeftChild());
		
		
		if (arbol.hasRightChild())
			suma += contarUnicoHijo(arbol.getRightChild());
		
		
		if (arbol.hasLeftChild() ^ arbol.hasRightChild())
			suma++;
		
		
		return suma;
		
	}
	
}
