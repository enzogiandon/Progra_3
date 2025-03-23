package tp1.ej7;

import java.util.Scanner;

import tp1.ejercicio3.Estudiante;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Estudiante> lEstudiantes = null;

		menu: while (true) {
			System.out.println("Seleccione el inciso que quiere ejecutar:\n Para salir, ingrese 'salir'.");

			switch (s.next()) {

			case "a": // PUNTO A
				ArrayList<String> lista = new ArrayList<String>();

				for (int i = 0; i < args.length; i++)
					lista.add(args[i]);

				System.out.println("\nImprimo lista 1");
				for (String elemento : lista) {
					System.out.println(elemento);
				}
				break;

			case "b": // PUNTO B
				LinkedList<String> lista2 = new LinkedList<String>();

				for (int i = 0; i < args.length; i++)
					lista2.add(args[i]);

				System.out.println("\nImprimo lista 2");
				for (String elemento : lista2) {
					System.out.println(elemento);
				}

				// No se encuentra diferencia en la implementación porque es transparente al
				// usuario.
				break;

			/*
			 * PUNTO C Podría usarse un Iterator para recorrer la lista.
			 */
			case "d":// PUNTO D
				lEstudiantes = crearLista();
				break;

			case "e": // PUNTO E
				if (lEstudiantes == null) {
					System.out.println("Primero cree la lista de estudiantes en el punto d.");
					break;
				}
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
				break;

			case "f":
				// PUNTO F
				// Notar que la lista de enteros son los argumentos al main 
				// (convertidos a Integer)

				if (args.length == 0) {
					System.out.println("Ingrese argumentos al main");
					break;
				}
				
				ArrayList<Integer> listaInt = new ArrayList<Integer>();
				
				for (int i = 0; i < args.length; i++)
					listaInt.add(Integer.parseInt(args[i]));

				
				if (esCapicua(listaInt))
					System.out.println("Es capicua");
				else
					System.out.println("No es capicua");
				break;

			case "g":
				System.out.println("Ingrese un entero para calcular la sucesion:");
				int n = s.nextInt();

				List<Integer> sucesion = new ArrayList<Integer>();
				sucesion.addAll(EjercicioSucesion.calcularSucesion(n));

				System.out.println("Sucesion:");
				for (int elemento : sucesion)
					System.out.println(elemento);
				break;

			case "h":
				
				// Notar que la lista de enteros son los argumentos al main 
				// (convertidos a Integer)
				ArrayList<Integer> listaInte = new ArrayList<Integer>();
				
				if (args.length == 0) {
					System.out.println("Ingrese argumentos al main");
					break;
				}
					
				for (int i = 0; i < args.length; i++)
					listaInte.add(Integer.parseInt(args[i]));

				System.out.println("Lista:");
				for (int elemento : listaInte)
					System.out.println(elemento);

				invertirArrayList(listaInte);
				
				System.out.println("Lista invertida:");
				for (int elemento : listaInte)
					System.out.println(elemento);

				break;
				
				
			case "i":
				
				System.out.println("Suma: "+sumarLinkedList(null));
				break;

			case "j":
			//	combinarOrdenado();
				
				break;
				
				
				
			case "salir":
				break menu;

			default:
				System.out.println("Ingrese una entrada válida.");

			}

		}

	}

	public static List<Estudiante> crearLista() {
		List<Estudiante> lista = new ArrayList<Estudiante>();
		Scanner s = new Scanner(System.in);
		final int cantEstud = 3;

		for (int i = 0; i < cantEstud; i++) {
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
		 * RECOMENDABLE porque necesita casting y puede generar errores en tiempo de
		 * ejecucion
		 * 
		 */
		return lista;
	}

	private static void LeerEstudiante(Estudiante e) {
		Scanner s = new Scanner(System.in);
		String aux;
		System.out.println("Nuevo estudiante.");

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
			if (lista.get(i) != lista.get((largo - 1) - i)) {
				resul = false;
				break;
			}
		}
		return resul;

	}

	public class EjercicioSucesion {

		public static List<Integer> calcularSucesion(int n) {

			List<Integer> sucesion = new ArrayList<Integer>();
			sucesion.add(n);

			if (n == 1)
				return sucesion;

			if (n % 2 == 0)
				sucesion.addAll(calcularSucesion(n / 2));
			else
				sucesion.addAll(calcularSucesion(3 * n + 1));

			return sucesion;
		}
	}

	public static void invertirArrayList(ArrayList<Integer> lista) {
		List<Integer> lInvertida = new ArrayList<Integer>();

		for (Integer elemento : lista) {
			lInvertida.add(0, elemento);
		}
		
		
		lista.clear();
		lista.addAll(lInvertida);

	}
	
	public static int sumarLinkedList(LinkedList<Integer> lista) {
		int suma =0;
		for (int elemento: lista) {
			suma+=elemento;
		}
		return suma;
	}
	
	public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		List<Integer> lOrdenada = new ArrayList<Integer>();
		
		int i=0,j=0;
		while (i<lista1.size() && j<lista2.size()) {
			if (lista1.get(i) <= lista2.get(j)) {
				lOrdenada.add(lista1.get(i));
				i++;
			}
			else {
				lOrdenada.add(lista1.get(j));
				j++;
			}
			
		}
		return (ArrayList<Integer>) lOrdenada;
	}
}