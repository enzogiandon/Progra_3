package tp3.ejercicio2;

import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;


public class RecorridosAG {
	
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> l = new LinkedList<Integer>();
		
		int dato = a.getData();
		
		if ((dato % 2 != 0) && (dato > n))
			l.add(dato);
		
		
		if (a.hasChildren()) {
			for (GeneralTree<Integer> child: a.getChildren()) {
				l.addAll(numerosImparesMayoresQuePreOrden(child,n));
		   }
		}
			
		return l;
		
	}
		
			
			
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n){
        List<Integer> l = new LinkedList<Integer>();
        
        if (a.hasChildren()) {
			for (GeneralTree<Integer> child: a.getChildren()) {
				l.addAll(numerosImparesMayoresQuePreOrden(child,n));
		   }
		}
		
		int dato = a.getData();
		
		if ((dato % 2 != 0) && (dato > n))
			l.add(dato);
		
		return l;
	}
		
			
	
			

}
