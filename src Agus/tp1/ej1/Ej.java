package tp1.ej1;

public class Ej {
	
	public static void main(String[] args) {
		
		int a=5, b=10;

		System.out.println("Imprimir con for:");
		imprimir1(a,b);

		System.out.println("Imprimir con while:");
		imprimir2(a,b);

		System.out.println("Imprimir con recursión (sin iteraciones):");
		imprimir3(a,b);
		
	}
	
	static void imprimir1(int a, int b) {
		for (;a<=b;a++)
			System.out.println(a);
	}
	static void imprimir2(int a, int b) {
		while (a<=b) {
			System.out.println(a);
			a++;
		}
	}
	static void imprimir3(int a, int b) {
		if (a<=b) {
			System.out.println(a);
			imprimir3(a+1,b);
		}
	}
}