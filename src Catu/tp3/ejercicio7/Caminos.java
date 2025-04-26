package tp3.ejercicio7;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class Caminos {
	GeneralTree<Integer> a;
	
	public List<Integer> caminoAHojaMasLejana (){
		List<Integer> max = new LinkedList<Integer>();
		List<Integer> act = new LinkedList<Integer>();
		if (a == null) {
			return null;
		}
		caminoAHojaMasLejana(a,act,max);
		return max;
		
	}
	
	private void caminoAHojaMasLejana(GeneralTree<Integer> a, List<Integer> act, List<Integer> max){
		act.add(a.getData());
		
		if (a.isLeaf()) {
			if (act.size() > max.size()) {
				max = act;
			}
		}
		else {
			for (GeneralTree<Integer> child : a.getChildren()) {
				caminoAHojaMasLejana(child,act,max);
			}
		}
		
	}
}
