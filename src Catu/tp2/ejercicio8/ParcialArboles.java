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
        int cant = recorro(arbol1);
		int aux= Comparo(arbol1,arbol2);
		return aux == cant;
		
		
	}
	
	private int recorro(BinaryTree<Integer> a1) {
		if (a1 == null) {
			return 0;
		}
		
		int i = 0;
		if (a1.hasLeftChild())
			i += recorro(a1.getLeftChild());
		if (a1.hasRightChild()) {
			i += recorro(a1.getRightChild());
		}
		return ++i;
	}
	
	private int Comparo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		if (a1==null && a2==null) {
			return 0;
		}
		if (a1==null || a2==null) {
			return -1;
		}
		
		int aux=0;
		
		
		if (a1.hasLeftChild() && a2.hasLeftChild())
			aux+=Comparo(a1.getLeftChild(),a2.getLeftChild());
		else return aux;
		if (a1.hasRightChild() && a2.hasRightChild())
			aux+=Comparo(a1.getRightChild(),a2.getRightChild());
		else return aux;
		
		if (a1.getData() == a2.getData()) {
			aux++;
		}
		
		
		return aux;
		
	}

}
