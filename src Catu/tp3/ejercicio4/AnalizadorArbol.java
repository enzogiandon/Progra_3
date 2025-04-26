package tp3.ejercicio4;
import tp1.ej8.Queue;
import tp3.ejercicio1.GeneralTree;

public class AnalizadorArbol {
	
	
	class AreaEmpresa{
		String id;
		int tardanza;
	}

	public int devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol) {
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
		
		cola.enqueue(arbol);
		
		int sum = 0;
		int max=0;
		while(!cola.isEmpty()) {
			int ancho = cola.size(); // total de nodos en el nivel
			
			for (int i=0; i<ancho;i++) {
				GeneralTree<AreaEmpresa> aux = cola.dequeue();
				sum+=aux.getData().tardanza;
				for (GeneralTree<AreaEmpresa> hijo: aux.getChildren()) {
					cola.enqueue(hijo);
				}
			}
			
			double prom = sum/ancho;
			
			if (prom > max)
				max = (int) prom;
			sum = 0;
		}
			
		
		return max;
	}
}
