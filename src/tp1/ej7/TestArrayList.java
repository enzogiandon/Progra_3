package tp1.ej7;

import tp1.ej3.Estudiante;

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		// PUNTO A
		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i < args.length; i++)
			lista.add(args[i]);

		System.out.println("\nImprimo lista 1");
		while (!lista.isEmpty()) {
			String act = (String) lista.get(0);
			System.out.println(act);
			lista.remove(0);
		}
		// PUNTO B

		LinkedList<String> lista2 = new LinkedList<String>();

		for (int i = 0; i < args.length; i++)
			lista2.add(args[i]);

		System.out.println("\nImprimo lista 2");
		while (!lista2.isEmpty()) {
			String act = (String) lista2.get(0);
			System.out.println(act);
			lista2.remove(0);
		}

		// PUNTO D
		List<Estudiante> lEstudiantes = crearLista();

		// PUNTO E
		Estudiante e = new Estudiante();
		System.out.println("Ingrese los datos del elemento que quiere agregar");
		LeerEstudiante(e);

		Iterator<Estudiante> it = lEstudiantes.iterator();

		boolean encuentro = false;
		while (it.hasNext())
			if (it.next().equals(e)) {
				encuentro = true;
				System.out.println("El elemento ya se encontraba en la lista");
				break;
			}

		if (!encuentro) {
			lEstudiantes.add(e);
			System.out.println("Se agrego correctamente el elemento");
		}

		it = lEstudiantes.iterator(); // Reinicio el iterador

		System.out.println("Lectura de la lista");
		while (it.hasNext())
			System.out.println(it.next().tusDatos());
		
		// PUNTO F
		// notar que la lista de enteros son los argumentos al main (convertidos a Integer)
		ArrayList<Integer> listaInt = new ArrayList<Integer>();
		for (int i = 0; i < args.length; i++) 
			listaInt.add(Integer.parseInt(args[i]));
		
		if (esCapicua(listaInt))
			System.out.println("Es capicua");
		else 
			System.out.println("No es capicua");
		
	}

	public static List<Estudiante> crearLista() {
		List<Estudiante> lista = new ArrayList<Estudiante>();
		String aux;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			Estudiante e = new Estudiante();

			System.out.println("Estudiante " + i + ": ");
			LeerEstudiante(e);
			lista.add(e);
		}

		List<Estudiante> l_copia = new ArrayList<Estudiante>(lista);

		Iterator<Estudiante> itLista = lista.iterator();
		Iterator<Estudiante> itCopia = l_copia.iterator();

		while (itLista.hasNext()) {
			System.out.println(itLista.next().tusDatos());
		}

		while (itCopia.hasNext()) {
			System.out.println(itCopia.next().tusDatos());
		}

		System.out.println("Ingrese el nuevo apellido del 1");
		lista.get(1).setApellido(s.next());
		// NOTAR QUE SE MODIFICA EN AMBAS LISTAS

		itLista = lista.iterator();
		itCopia = l_copia.iterator();

		while (itLista.hasNext()) {
			System.out.println(itLista.next().tusDatos());
		}

		while (itCopia.hasNext()) {
			System.out.println(itCopia.next().tusDatos());
		}
		/*
		 * OTRAS FORMAS DE COPIAR LISTAS:
		 * 
		 * ArrayList<Estudiante> l_copia = new ArrayList<>(); l_copia.addAll(lista);
		 * 
		 * ArrayList<Estudiante> l_copia = (ArrayList<Estudiante>)lista.clone(); NO
		 * RECOMENDABLE porque necesita casting
		 * 
		 */
		return lista;
	}

	public static void LeerEstudiante(Estudiante e) {
		Scanner s = new Scanner(System.in);
		String aux;

		System.out.println("Ingrese Nombre:");
		aux = s.next();
		e.setNombre(aux);
		System.out.println("Ingrese apellido");
		aux = s.next();
		e.setApellido(aux);
		System.out.println("Ingrese comision");
		aux = s.next();
		e.setComision(aux);
		System.out.println("Ingrese e-mail");
		aux = s.next();
		e.setEmail(aux);
		System.out.println("Ingrese direccion");
		aux = s.next();
		e.setDireccion(aux);
	}

	public static boolean esCapicua(ArrayList<Integer> lista) {
		int largo = lista.size();
		boolean resul = true;
		for (int i = 0; i < largo / 2; i++) {
			if (lista.get(i) != lista.get((largo-1)  - i)) {
				resul = false;
				break;
			}
		}
		return resul;

	}
}