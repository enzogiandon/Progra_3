package tp2.ejercicio6;

import tp2.ejercicio1.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;
		
		public Transformacion (BinaryTree<Integer> arbol) {
			this.arbol = arbol;
		}
		
		public BinaryTree<Integer> suma(BinaryTree<Integer> arbol) {
			transformar(arbol);
			return arbol;
		}
		
		private int transformar(BinaryTree<Integer> arbol) {
			
			if (arbol == null) {
	            return 0;
	        }
		
				
			int sumaIzq = 0;
			int sumaDer = 0;
			
			if (arbol.hasLeftChild()) {
				sumaIzq += transformar(arbol.getLeftChild()); 
				
			}
			if (arbol.hasRightChild()) {
				sumaDer += transformar(arbol.getRightChild()); 
			}
			
			int dato = t.getData();
			
			t.setData(sumaIzq + sumaDer);
			
				
				
			return dato + sumaIzq + sumaDer;
		}


}
