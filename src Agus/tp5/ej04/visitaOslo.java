package tp5.ej04;

import tp5.ej01.*; // Todos las clases de grafos

import java.util.ArrayList;
import java.util.List;


public class visitaOslo {

	
	// Retorna null si no existe el inicio o fin, si hay camino lo retorna, si no hay camino retorna la lista vacia.
	public List<String> paseoEnBici(Graph<String> lugares, String destino, int maxTiempo,
			List<String> lugaresRestringidos) {

		Vertex<String> ini = lugares.search("Ayuntamiento");
		Vertex<String> fin = lugares.search(destino);

		if ((ini == null) || (fin == null))
			return null;

		List<String> camino = new ArrayList<String>();
		boolean[] visitados = new boolean[lugares.getSize()]; // Se inicializa en false?? Uso getSize o como en la práctica?

		dfs(lugares, ini, fin, maxTiempo, 0, lugaresRestringidos, visitados, camino);
		return camino; // Si no lo encuentra retorna la lista vacía

		
	}

	private boolean dfs(Graph<String> lugares, Vertex<String> act, Vertex<String> destino, int maxTiempo, int actTiempo,
			List<String> lugaresRestringidos, boolean visitados[], List<String> camino) {

		if (lugaresRestringidos.contains(act.getData()) || visitados[act.getPosition()] || actTiempo > maxTiempo)
			return false;
		// Me fijo acá si está visitado o antes de entrar?
		
		visitados[act.getPosition()] = true;
		camino.add(act.getData());

		if (act.equals(destino))
			return true;

		for(Edge<String> e: lugares.getEdges(act)) {
			Vertex<String> sig = e.target();
			
			int peso = e.getWeight();
			
			if (dfs(lugares,sig,destino,maxTiempo,actTiempo + peso,lugaresRestringidos,visitados,camino))
				return true; // Si lo encuentro no sigo recorriendo, aca es donde se usa el boolean
		
		}
		
		visitados[act.getPosition()] = false;
		camino.remove(camino.size()-1);
		
		return false;
	}

}
