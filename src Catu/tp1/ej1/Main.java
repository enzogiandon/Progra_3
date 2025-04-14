package tp1.ej1;

public class Main {

	public static void main(String[] args) {
		imprimirPuntoCAgus(8,15);
		
		

	}
	
	public static void imprimirFor(int a, int b) {
		for (int i=a; i<=b; i++) {
			System.out.println("num:" + i);			
		}
	}
	
	public static void imprimirWhile(int a, int b) {
		while (a<=b) {
			System.out.println("num:" + a);
			a++;
		}
	}
	
	public static void imprimirPuntoC(int a, int b) {
		if (a<=b) {
			System.out.println("num:" + a);
			a++;
		}
		if (a>b)
			System.out.println("listo");
		else
			imprimirPuntoC(a,b);
			
	}
	
	public static void imprimirPuntoCAgus(int a, int b) {
		if (a<=b) {
			System.out.println("num:" + a);
			imprimirPuntoCAgus(a+1,b);
		}
		else
			System.out.println("listo");			
	}

}
