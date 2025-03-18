package tp2_ej9;

import arbolBinario.BinaryTree;

public class parcialArboles {
	
	public BinaryTree<Integer[]> sumAndDif(BinaryTree<Integer> arbol){
		
		if (arbol == null)	return null;
		
		return createSumAndDifTree(arbol,0,0);
		
		
		
	}
	
	
	private BinaryTree<Integer[]> createSumAndDifTree(BinaryTree<Integer> arbol, int camino, int padre){

		int original = arbol.getData();
		camino += original;
		
		Integer[] aux = {camino, original - padre};
		

		BinaryTree<Integer[]> nue = new BinaryTree<Integer[]>(aux);
		
		nue.addLeftChild(createSumAndDifTree(arbol.getLeftChild(), camino, original));
		nue.addRightChild(createSumAndDifTree(arbol.getRightChild(), camino, original));
		
		return nue;
	}

}