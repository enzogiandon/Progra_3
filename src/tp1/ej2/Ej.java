package tp1.ej2;
import java.util.Scanner;

public class Ej {

	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);


		System.out.println("Ingrese un numero mayor a 0: ");
		n = s.nextInt();
		
		int arreglo[] = generarArreglo(n);
		
		for (int i=0;i<n;i++)
			System.out.printf("arreglo [%d] = %d \n",i+1, arreglo[i]);
		
		s.close();
	}
	
	static int[] generarArreglo(int n) {
		if (n<=0) {
			System.out.println("El número es menor o igual a 0.");
			return null;
		}
		int [] arreglo = new int[n];
		
		for (int i=0;i<n;i++) {
			arreglo[i] = n*(i+1);
		}
		
		return arreglo;
	}
}
