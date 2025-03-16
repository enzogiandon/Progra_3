package tp2_ej2;

import arbolBinario.BinaryTree;
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		BinaryTree<Integer> T = generarArbol();

		System.out.println("In Orden:");
		T.printInorden();
		
		System.out.println("El arbol generado tiene "+ T.contarHojas() +" hojas.");
		
		System.out.println("Espejo In orden:");
		T.espejo().printInorden();
		
		
	//	System.out.println("Por niveles:");
	//	T.printLevelTraversal();
	}
	
	public static BinaryTree<Integer> generarArbol(){
		Scanner s = new Scanner(System.in);
		BinaryTree<Integer> T = new BinaryTree<Integer>();
		
		
		// Si se quiere poner un numero minimo de nodos:
		/* 
		System.out.println("Ingrese el numero minimo de nodos del arbol");
		int minNodos = Integer.valueOf(s.nextInt());

		System.out.println("Ingrese el numero máximo de nodos del arbol");
		int nodos = minNodos + Integer.valueOf(s.nextInt());
		*/
		
		
		System.out.println("Ingrese el numero máximo de nodos del arbol");
		int nodos = Integer.valueOf(s.nextInt());
		System.out.println("Ingrese el valor máximo que puede tener los nodos del arbol");
		int max = Integer.valueOf(s.nextInt());
		T.createTreeWithRandomValues(nodos,max);
		s.close();
		
		return T;
	}
}