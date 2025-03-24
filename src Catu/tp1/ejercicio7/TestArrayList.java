package tp1.ejercicio7;

import tp1.ejercicio3.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class TestArrayList {

	// PUNTO A
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			lista.add(args[i]);
		}
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<String> inversa = invertirArrayList(lista,0);
		System.out.println(("INVERSA:") + inversa);

		metodo();
		
		
		
		s.close();
	}

	// PUNTO B: NINGUNA, aunque funcionen de distinta manera, la implementacion es
	// la misma.

	// PUNTO C: SI, el foreach

	// PUNTO D
	private static void metodo() {
		int cant = 3;
		List<Estudiante> lE = new LinkedList<Estudiante>();
		for (int i = 0; i < cant; i++) {
			Estudiante e = new Estudiante();
			leerE(e);
			lE.add(e);
		}
		List<Estudiante> lECopy = new LinkedList<Estudiante>();
		lECopy.addAll(lE); // COPIAMOS LA LISTA EN OTRA
		Iterator<Estudiante> it = lE.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().tusDatos()); // SI NO PONEMOS EL .tusDatos() NO IMPRIME LA INFO DEL ESTUDIANTE
		}

		// PUNTO E
		it = lE.iterator();
		Estudiante e = new Estudiante();
		leerE(e);

		boolean encontro = false;
		while (it.hasNext()) {
			if (it.next().equals(e)) {
				System.out.println("YA ESTÁ ESE ESTUDIANTE EN LA LISTA"); 
				encontro = true;
				break;
			}

		}
		if (!encontro) {
			System.out.println("ESTUDIANTE AÑADIDO EXITOSAMENTE");
			lE.add(e);
		}

		it = lE.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().tusDatos()); // SI NO PONEMOS EL .tusDatos() NO IMPRIME LA INFO DEL ESTUDIANTE
		}

	}

	private static void leerE(Estudiante e) {
		Scanner s = new Scanner(System.in);
		String aux;
		System.out.println("Ingrese nombre:");
		aux = s.next();
		e.setNombre(aux);
		System.out.println("Ingrese apellido:");
		aux = s.next();
		e.setApellido(aux);
		System.out.println("Ingrese comision:");
		aux = s.next();
		e.setComision(aux);
		System.out.println("Ingrese email:");
		aux = s.next();
		e.setEmail(aux);
		System.out.println("Ingrese direccion:");
		aux = s.next();
		e.setDireccion(aux);
		
		s.close();
	}
	
	//PUNTO H
	public static ArrayList<String> invertirArrayList(List<String> lista, int indice) {
		if (indice == lista.size()) { 
			return new ArrayList<String>();
		}
		ArrayList<String> inversa = invertirArrayList(lista,indice+1);
		inversa.add(lista.get(indice));
		return inversa; 
	}
	
	//PUNTO J
}
