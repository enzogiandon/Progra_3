package tp2.ejercicio9;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	
	public BinaryTree<Integer[]> sumAndDif(BinaryTree<Integer> arbol){
		if (arbol == null) {
			return null;
		}
		return sumAndDif(arbol, 0, 0);
	}
	
	private BinaryTree<Integer[]> sumAndDif(BinaryTree<Integer> arbol,int suma,int padre){
		
		int dato= arbol.getData();
		
		suma = suma + dato;
		
		Integer[] nodo = new Integer[2];
		nodo[0]  = suma;
		nodo[1] = dato - padre;
		
		BinaryTree<Integer[]> a = new BinaryTree<Integer[]>(nodo);
		
		if (arbol.hasLeftChild())
			a.addLeftChild(sumAndDif(arbol,suma,dato));
		
		if (arbol.hasRightChild())
			a.addRightChild(sumAndDif(arbol,suma,dato));
		
		return a;
	}
	

}
