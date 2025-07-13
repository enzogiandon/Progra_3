package tp5.ej05;

import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;
import tp5.ej01.*;

public class QuedateEnCasa {

	class Persona {
		String nombre;
		String rol;
		String domicilio;
	}

	public List<Persona> calcularLista(Graph<Persona> grafo, Persona empleado, int maxSeparacion) {

		Vertex<Persona> inicio = grafo.search(empleado);

		if (inicio == null)
			return null;

		boolean[] visitados = new boolean[grafo.getSize()];

		return bfs(grafo,inicio,maxSeparacion-1,visitados); // -1 porque debe ser MENOR a la distancia dada
	}

	
	// Lo resolvi casi como un general Tree, ya que me dan la arista inicial (como la raiz del arbol)
	private List<Persona> bfs(Graph<Persona> grafo, Vertex<Persona> inicio, int maxSeparacion, boolean[] visitados) {

		Queue<Vertex<Persona>> q = new Queue<Vertex<Persona>>();
		List<Persona> jubilados = new LinkedList<Persona>();
		
		q.enqueue(inicio);
		visitados[inicio.getPosition()] = true; // OPCION 1 PARA VISITADOS (al encolar) (yo diria esta)
		int distancia = 0;

		while (!q.isEmpty()) {
			int nodosDistancia = q.size(); // cant de nodos a la misma distancia del origen

			
			for (int i = 0; i < nodosDistancia; i++) { // NO poner q.size()
				Vertex<Persona> act = q.dequeue();
				
				if (act.getData().rol.equals("Jubilado")) {
					jubilados.add(act.getData());
					if (jubilados.size()==40)
						return jubilados;
					// OPCION 2 PARA MARCAR VISITADOS (al desencolar)
				}
				
				
				if (distancia < maxSeparacion) // Solo voy a buscar hijos si no llegue a la distancia max
					for (Edge<Persona> e : grafo.getEdges(act)) {
						Vertex<Persona> target = e.target();
						if (!visitados[target.getPosition()]) {
							q.enqueue(target); 
							visitados[target.getPosition()] = true; // OPCION 1 PARA VISITADOS
						}
					}
			}
			distancia++;

		}
		
		return jubilados;
		
	}

}
