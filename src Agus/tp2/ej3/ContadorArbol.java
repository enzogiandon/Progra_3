package tp2.ej3;

import java.util.LinkedList;
import java.util.List;

import tp2.ej1y2.BinaryTree;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol() {
		
	}
	
	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	
	public List<Integer> numerosParesEnOrden(){
		ContadorArbol aux = new ContadorArbol();
		List<Integer> lista  = new LinkedList<Integer>();
		
		if (arbol.hasLeftChild()) {
			aux.setArbol(arbol.getLeftChild());
			lista.addAll(aux.numerosParesEnOrden());
		}
		
		if ((arbol != null) && (arbol.getData() % 2 ==0))
			lista.add(arbol.getData());
		
		if (arbol.hasRightChild()) {
			aux.setArbol(arbol.getRightChild());
			lista.addAll(aux.numerosParesEnOrden());
		}
		
		return lista;
		
	}
	
	public List<Integer> numerosParesPreOrden(){
		ContadorArbol aux = new ContadorArbol();
		List<Integer> lista  = new LinkedList<Integer>();

		if ((arbol != null) && (arbol.getData() % 2 ==0))
			lista.add(arbol.getData());
		
		
		if (arbol.hasLeftChild()) {
			aux.setArbol(arbol.getLeftChild());
			lista.addAll(aux.numerosParesEnOrden());
		}
		
		
		if (arbol.hasRightChild()) {
			aux.setArbol(arbol.getRightChild());
			lista.addAll(aux.numerosParesEnOrden());
		}
		
		return lista;
		
	}
	
	
}
