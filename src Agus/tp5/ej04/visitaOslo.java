package tp5.ej04;

import java.util.List;

import tp5.ej01.Graph;
import tp5.ej01.Vertex;

public class visitaOslo {

	public List<String> paseoEnBici(Graph<String> lugares, String destino, 
		int maxTiempo, List<String> lugaresRestringidos) {
		
		Vertex<String> ayunt = lugares.search("Ayuntamiento");
		
		
		return dfs(ayunt, lugares, destino, maxTiempo, lugaresRestringidos);
	}
	
	
	private List<String> dfs(Vertex<String> act, Graph<String> lugares, String destino, 
			int maxTiempo, List<String> lugaresRestringidos) {
	}
	
}
