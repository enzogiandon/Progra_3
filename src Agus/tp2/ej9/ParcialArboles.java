package tp2.ej9;

import tp2.ej1y2.BinaryTree;

public class ParcialArboles {

	
	public BinaryTree<Integer[]> sumAndDif(BinaryTree<Integer> arbol){
		
		return sumAndDif(arbol, 0, 0);
		
		
	}
	
	
	private BinaryTree<Integer[]> sumAndDif(BinaryTree<Integer> arbol,int suma,int vPadre){
		if (arbol == null)
			return null;
		
		int act = arbol.getData();
		
		suma+= act;
		
		Integer[] ent = new Integer[2];
		
		ent[0] = suma;
		ent[1] = act - vPadre;
		
		BinaryTree<Integer[]> nuevo = new BinaryTree<Integer[]>(ent);
		
		if (arbol.hasLeftChild())
			nuevo.addLeftChild(sumAndDif(arbol,suma,act));
		
		if (arbol.hasRightChild())
			nuevo.addRightChild(sumAndDif(arbol,suma,act));
		
		return nuevo;
		
		
		
	}
	
	
}
