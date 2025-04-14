package tp1.ejercicio5;

public class ej5 {

	public static void main(String[] args) {
		int n=3;
		int[] vInt = new int[3];
		vInt[0]=5;
		vInt[1]=2;
		vInt[2]=3;
		todo(vInt,prom);		
		System.out.println("El maximo es: " + todo(vInt, prom));
		System.out.println("El prom es: " + prom);
		

	}
	
	public static String todo(int[] vInt){ // PUNTO A
		
        int max=-999, min=999, suma=0, prom=0;
		for (int i=0;i<vInt.length;i++) { // ponemos vInt.length para no pasarnos el n
			if (vInt[i]>max) {
				max= vInt[i];
			}
			if (vInt[i]<min){
				min = vInt[i];
			}
			suma = suma + vInt[i];
		}
		prom = suma / vInt.length; 
		
		return "Max" + max + "Min" + min + "Prom" + prom;
		
		
	}
	
	public static void todo(int[] vInt, int max, int min, int prom){ // PUNTO B
		
        int suma=0;
		for (int i=0;i<vInt.length;i++) { // ponemos vInt.length para no pasarnos el n
			if (vInt[i]>max) {
				max= vInt[i];
			}
			if (vInt[i]<min){
				min = vInt[i];
			}
			suma = suma + vInt[i];
		}
		prom = suma / vInt.length; 

			
	}
	
public static void todo(int[] vInt){ // PUNTO C
		
        private static int max=-999, min=999, suma=0, prom=0;
		for (int i=0;i<vInt.length;i++) { // ponemos vInt.length para no pasarnos el n
			if (vInt[i]>max) {
				max= vInt[i];
			}
			if (vInt[i]<min){
				min = vInt[i];
			}
			suma = suma + vInt[i];
		}
		prom = suma / vInt.length; 
		
		public static void retornar() {
			System.out.println("Maximo: " + max + "Minimo: " + min + "Promedio: " + prom);
		}
			
		
	}

}
