package tp1.ejercicio3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int e=2, p=3;
		Estudiante[] vE = new Estudiante[e];
		Profesor[] vP = new Profesor[p];
		String aux;
		
		for (int i=0;i<e;i++) {
			vE[i] = new Estudiante();
			System.out.println("Ingrese nombre:");
			aux = s.next();
			vE[i].setNombre(aux);
			System.out.println("Ingrese apellido:");
			aux = s.next();
			vE[i].setApellido(aux);
			System.out.println("Ingrese comision:");
			aux = s.next();
			vE[i].setComision(aux);
			System.out.println("Ingrese email:");
			aux = s.next();
			vE[i].setEmail(aux);
			System.out.println("Ingrese direccion:");
			aux = s.next();
			vE[i].setDireccion(aux);
		}
		
		for (int i=0;i<p;i++) {
			vP[i] = new Profesor();
			System.out.println("Ingrese nombre:");
			aux = s.next();
			vP[i].setNombre(aux);
			System.out.println("Ingrese apellido:");
			aux = s.next();
			vP[i].setApellido(aux);
			System.out.println("Ingrese email:");
			aux = s.next();
			vP[i].setEmail(aux);
			System.out.println("Ingrese catedra:");
			aux = s.next();
			vP[i].setCatedra(aux);
			System.out.println("Ingrese facultad:");
			aux = s.next();
			vP[i].setFacultad(aux);
		}
		
		for (int i=0;i<e;i++) {
			System.out.println(vE[i].tusDatos());
		}
		
		for (int i=0;i<p;i++) {
			System.out.println(vP[i].tusDatos());
		}
		
    s.close();
	}

}
