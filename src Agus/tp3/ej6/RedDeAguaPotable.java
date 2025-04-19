package tp3.ej6;

import java.util.List;

import tp1.ej8.Queue;
import tp3.ej1_3_5.GeneralTree;

public class RedDeAguaPotable {
	GeneralTree<Double> red;

	public RedDeAguaPotable() {
		red = new GeneralTree<Double>();
	}

	public RedDeAguaPotable(double caudal) {
		red = new GeneralTree<Double>(caudal);
	}

	public double minimoCaudal(double caudal) {
		return minimoCaudal(red,caudal);
	}

	private double minimoCaudal(GeneralTree<Double> arbol, double caudal) {
		arbol.setData(caudal);
		
		Queue<GeneralTree<Double>> cola = new Queue<GeneralTree<Double>>();
		cola.enqueue(arbol);
		
		double minimo = caudal;

		while (!cola.isEmpty()) {
			GeneralTree<Double> act = cola.dequeue();
			double caudalActual = act.getData();

			if (act.hasChildren()) {
				List<GeneralTree<Double>> hijos = act.getChildren();
				
				double caudalHijos = caudalActual / hijos.size();

				for (GeneralTree<Double> hijo: act.getChildren()) {
					hijo.setData(caudalHijos);
					cola.enqueue(hijo);
				}
				
				minimo = Math.min(caudalHijos, minimo);
				
				
			}

		}

		return minimo;

	}
}
