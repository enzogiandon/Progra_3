package tp2.ejercicio7;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol;

	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public boolean isLeftTree(int num) {
		
		BinaryTree<Integer> aux = busquedaNum(arbol, num);
		
		if (aux==null)
			return false;
		
		
	
		int izq = contarHijosUnicos(aux.getLeftChild());
	
		int der= contarHijosUnicos(aux.getRightChild());
		
		return (izq > der);

	}

	private int contarHijosUnicos(BinaryTree<Integer> arbol) {
		if (arbol == null) {
			return -1;
		}
		if (arbol.isLeaf()) {
			return 0;
		}
		int tot=0;
		
		if (arbol.hasLeftChild()) {
			tot+=contarHijosUnicos(arbol.getLeftChild());
		}
		if (arbol.hasRightChild()) { 
			tot+=contarHijosUnicos(arbol.getRightChild());
		}
		if (arbol.hasLeftChild() ^ arbol.hasRightChild()) {
			tot++;
			}
		return tot;
		

	}

	private BinaryTree<Integer> busquedaNum(BinaryTree<Integer> arbol, int num) {

		if (arbol == null) {
			return null;
		}

		if (arbol.getData() == num) {
			return arbol;
		}

		BinaryTree<Integer> aux = busquedaNum(arbol.getLeftChild(), num);

		if (aux != null) {
			return aux;
		}

		return busquedaNum(arbol.getRightChild(), num);

	}

}
