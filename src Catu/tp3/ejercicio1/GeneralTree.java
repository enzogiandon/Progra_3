package tp3.ejercicio1;

import java.util.List;

import tp1.ej8.Queue;

import java.util.LinkedList;


public class GeneralTree<T> {

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>();

	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}

	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}

	public boolean hasChildren() {
		return children != null && !children.isEmpty();
	}

	public boolean isEmpty() {
		return this.data == null && !hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren()) {
			List<GeneralTree<T>> children = this.getChildren();
			if (children.contains(child))
				children.remove(child);
		}
	}
	
	
	public int altura(GeneralTree<T> a) {
		if (a == null)
			return 0;
		
		int max = 0;
		
		if (this.hasChildren()) {
			for (GeneralTree<T> child: a.getChildren()) {
				int alt = altura(child);
				if (alt > max)
					max = alt;
			}
		}
		
		return ++max;
	}
	
	public int nivel(T dato, GeneralTree<T> a) {
		if (a == null)
			return 0;
		
		int nivel = 0;
		int paro = 0;
		
		if (a.getData() == dato) {
			paro=1;
			return paro;
		}
			
			
		
		if (this.hasChildren()) {
			for (GeneralTree<T> child: a.getChildren()) {
				nivel += child.nivel(dato,child);
				if (paro==1)
					return nivel;
			}
		}
		
		return ++nivel;
	}
	
	public int ancho() {
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		int max = 0;
		
		cola.enqueue(this);
		while (!cola.isEmpty()) {
			int anchoAct = cola.size();
			
			if (anchoAct > max)
				max = anchoAct;
			
			for (int i=0; i<anchoAct;i++) {
				GeneralTree<T> aux = cola.dequeue();
				for (GeneralTree<T> hijo: aux.getChildren()) {
					cola.enqueue(hijo);
				}
			}
		}
		return max;
	}
	
	public boolean esAncestro(T a, T b) {
		 GeneralTree<T> nodoA = buscar(this,a);
		 
		 if (nodoA == null)
			 return false;
		 
		 return (buscar(nodoA,b) != null); 
	 }
	 
	 public GeneralTree<T> buscar(GeneralTree<T> arbol, T data){
		 if (arbol == null)
			 return null;
		  
		 if (arbol.getData().equals(data))
			 return arbol;
		 
		 GeneralTree<T> aux = null;
		 for(GeneralTree<T> hijo: arbol.getChildren()) {
			 aux = buscar(hijo,data);
			 if (aux != null)
				 return aux;
		 }
		 return null;
	 }


	

}


