package tp2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {

	private BinaryTree<Integer> arbol;

	public ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public List<Integer> numerosPares() {
		List<Integer> resultado = new ArrayList<>();
		numerosPares(this.arbol, resultado);
		return resultado;
	}

	private List<Integer> numerosPares(BinaryTree<Integer> nodo) {
		if (nodo == null)
			return null;

		List<Integer> lista = new ArrayList<>();

		if (nodo.getData() % 2 == 0) {
			lista.add(nodo.getData());
		}

		if (nodo.hasLeftChild()) {
			lista.addAll(numerosPares(nodo.getLeftChild()));
		}

		if (nodo.hasRightChild()) {
			lista.addAll(numerosPares(nodo.getRightChild()));
		}
		return lista;
	}

	public List<Integer> numerosParesInorden(BinaryTree<Integer> nodo) {
		List<Integer> lista = new ArrayList<>();

		if (nodo == null)
			return null;

		if (nodo.hasLeftChild())
			lista.addAll(numerosParesInorden(nodo.getLeftChild()));

		if (nodo.getData() % 2 == 0) {
			lista.add(nodo.getData());
		}

		if (nodo.hasRightChild()) {
			lista.addAll(numerosParesInorden(nodo.getRightChild()));
		}
		
		return lista;

	}

	public List<Integer> numerosParesPostorden(BinaryTree<Integer> nodo) {
		List<Integer> lista = new ArrayList<>();

		if (nodo == null)
			return null;

		if (nodo.hasLeftChild())
			lista.addAll(numerosParesPostorden(nodo.getLeftChild()));

		if (nodo.hasRightChild())
			lista.addAll(numerosParesPostorden(nodo.getRightChild()));

		if (nodo.getData() % 2 == 0) {
			lista.add(nodo.getData());
		}
		
		return lista;

	}
}
