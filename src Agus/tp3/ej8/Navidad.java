package tp3.ej8;

import java.util.LinkedList;
import java.util.List;

import tp3.ej1_3_5.GeneralTree;

public class Navidad {
	private GeneralTree<Integer> arbol;
	
	
	public boolean esAbetoNavidenio() {
		return esAbetoNavidenio(arbol);
	}
	
	
	private boolean esAbetoNavidenio(GeneralTree<Integer> arbol) {
		if (arbol.isLeaf())
			return true;
		
		List<GeneralTree<Integer>> hijosNoHoja = new LinkedList<GeneralTree<Integer>>();	

		int hijosHoja = 0;
		for(GeneralTree<Integer> hijo: arbol.getChildren()) {
			if (hijo.isLeaf()) {
				hijosHoja++;
			}
			else {
				hijosNoHoja.add(hijo);
			}
			
		}
		
		if (hijosHoja<3)
			return false;
		
		for(GeneralTree<Integer> hijo: hijosNoHoja) {
			if (!esAbetoNavidenio(hijo))
				return false;
		}
		return true;
		
		
	}
	


}
