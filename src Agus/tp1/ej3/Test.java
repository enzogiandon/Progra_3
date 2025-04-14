package tp1.ej3;
import java.util.Scanner;

import tp1.ejercicio3.Estudiante;

public class Test {

	public static void main(String[] args) {
		final int profesores=3, estudiantes=2;
		Estudiante[] vEstudiantes = new Estudiante[estudiantes];
		Profesor[] vProfesores = new Profesor[profesores];
		Scanner s = new Scanner(System.in);
		String aux;
		
		
		for (int i = 0; i < estudiantes; i++) {
			vEstudiantes[i] = new Estudiante();
			System.out.println("Estudiante " + i + ": ");
			System.out.println("Ingrese Nombre:");
			aux = s.next();
			vEstudiantes[i].setNombre(aux);
			System.out.println("Ingrese apellido");
			aux = s.next();
			vEstudiantes[i].setApellido(aux);
			System.out.println("Ingrese comision");
			aux = s.next();
			vEstudiantes[i].setComision(aux);
			System.out.println("Ingrese direccion");
			aux = s.next();
			vEstudiantes[i].setDireccion(aux);
			System.out.println("Ingrese e-mail");
			aux = s.next();
			vEstudiantes[i].setEmail(aux);
		}
		
		for (int i=0;i<profesores;i++) {
			vProfesores[i] = new Profesor();
			System.out.println("Profesor "+i+": ");
			System.out.println("Ingrese Nombre:");
			aux = s.next();
			vProfesores[i].setNombre(aux);
			System.out.println("Ingrese apellido");
			aux = s.next();
			vProfesores[i].setApellido(aux);
			System.out.println("Ingrese e-mail");
			aux = s.next();
			vProfesores[i].setEmail(aux);
			System.out.println("Ingrese catedra");
			aux = s.next();
			vProfesores[i].setCatedra(aux);
			System.out.println("Ingrese facultad");
			aux = s.next();
			vProfesores[i].setFacultad(aux);
		}
		
		for (int i=0;i<estudiantes;i++)
			System.out.println(vEstudiantes[i].tusDatos());

		for (int i=0;i<profesores;i++)
			System.out.println(vProfesores[i].tusDatos());
		
		s.close();
		
	}
}
