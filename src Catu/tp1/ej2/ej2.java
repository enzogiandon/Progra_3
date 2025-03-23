package tp1.ej2;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int n;
	   System.out.println("Ingrese un numero:");
	   n = 	s.nextInt();
	   int[] vN = new int[n];
	   vN = devolverV(n, vN);
	   System.out.printf(" f(%d) = [", n); 
	   for (int i=0;i<n-1;i++) {
		   System.out.print(vN[i] + "; "); 
	   }
	   System.out.print(vN[n-1] + "] "); 

	}
	
	public static int[] devolverV(int n, int[] vN) {
		for (int i=0;i<n;i++) {
			vN[i] = n * (i+1);
		}
		return vN;
	}

}
