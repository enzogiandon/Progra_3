package tp2_ej3;

import java.util.LinkedList;
import arbolBinario.BinaryTree;

public class ContadorArbol {

	private BinaryTree<Integer> Tree;

	public ContadorArbol() {
		Tree = new BinaryTree<Integer>();
	}

	public ContadorArbol(BinaryTree<Integer> Tree) {
		this.Tree = Tree;
	}

	public BinaryTree<Integer> getTree() {
		return Tree;
	}

	public void setT(BinaryTree<Integer> tree) {
		this.Tree = tree;
	}

	public LinkedList<Integer> numerosParesPreorden() {
		ContadorArbol aux = new ContadorArbol();
		LinkedList<Integer> lista = new LinkedList<Integer>();
		if ((Tree != null) && ((Tree.getData()%2) == 0))
			lista.add(Tree.getData());

		if (Tree.hasLeftChild()) {
			aux.setT(Tree.getLeftChild());
			lista.addAll(aux.numerosParesPreorden());
		}
		if (Tree.hasRightChild()) {
			aux.setT(Tree.getRightChild());
			lista.addAll(aux.numerosParesPreorden());
		}
		
		return lista;

	}
	
	public LinkedList<Integer> numerosParesInorden() {
		ContadorArbol aux = new ContadorArbol();
		LinkedList<Integer> lista = new LinkedList<Integer>();

		if (Tree.hasLeftChild()) {
			aux.setT(Tree.getLeftChild());
			lista.addAll(aux.numerosParesInorden());
		}
		if ((Tree != null) && ((Tree.getData()%2) == 0))
			lista.add(Tree.getData());
		if (Tree.hasRightChild()) {
			aux.setT(Tree.getRightChild());
			lista.addAll(aux.numerosParesInorden());
		}
		
		return lista;

	}
}

