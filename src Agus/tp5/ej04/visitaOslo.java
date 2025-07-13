package tp5.ej04;

import tp5.ej01.*; // Todos las clases de grafos

import java.util.ArrayList;
import java.util.List;


public class visitaOslo {

	public List<String> paseoEnBici(Graph<String> lugares, String destino, int maxTiempo,
			List<String> lugaresRestringidos) {

		Vertex<String> ini = lugares.search("Ayuntamiento");
		Vertex<String> fin = lugares.search(destino);

		if ((ini == null) || (fin == null))
			return null;

		List<String> camino = new ArrayList<String>();
		boolean[] visitados = new boolean[lugares.getSize()];

		if (dfs(lugares, ini, fin, maxTiempo, 0, lugaresRestringidos, camino, visitados, camino))
			;
		return camino;

		return null;
	}

	private boolean dfs(Graph<String> lugares, Vertex<String> act, Vertex<String> destino, int maxTiempo, int actTiempo,
			List<String> lugaresRestringidos, boolean visitados[], List<String> camino) {

		if (lugaresRestringidos.contains(act.getData()) || visitados[act.getPosition()] || actTiempo > maxTiempo)
			return false;
		
		
		visitados[act.getPosition()] = true;
		camino.add(act.getData());

		if (act.equals(destino))
			return true;

		for(Edge<String> e: lugares.getEdges(act)) {
			Vertex<String> sig = e.target();
			
			int peso = e.getWeight();
			
			if (dfs(lugares,sig,destino,maxTiempo,actTiempo + peso,lugaresRestringidos,visitados,camino))
				return true;
			
			
		}
		
		visitados[act.getPosition()] = false;
		camino.removeLast();
		
		return false;
	}

}
