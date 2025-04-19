package tp3.ej7;

import java.util.LinkedList;
import java.util.List;

import tp1.ej8.Queue;
import tp3.ej1_3_5.GeneralTree;

public class Caminos {
	private GeneralTree<Integer> arbol;

	public List<Integer> caminoAHojaMasLejana() {

		List<Integer> actual = new LinkedList<Integer>();
		List<Integer> mejor = new LinkedList<Integer>();
		
		if (!arbol.isEmpty())
			caminoAHojaMasLejana(arbol, actual, mejor);
		
		return mejor;

	}

	private void caminoAHojaMasLejana(GeneralTree<Integer> arbol, List<Integer> actual, List<Integer> mejor) {
		actual.add(arbol.getData());

		if (arbol.isLeaf()) {
			if (actual.size() > mejor.size()) {
				mejor.clear();
				mejor.addAll(actual);
			}
		} else {
			for (GeneralTree<Integer> hijo : arbol.getChildren()) {
				caminoAHojaMasLejana(arbol, actual, mejor);
			}
		}
		actual.remove(actual.size() - 1);
	}

}}
