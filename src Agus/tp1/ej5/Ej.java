package tp1.ej5;

public class Ej {
	public static void main(String[] args) {

		int[] vector = {1,2,5,43,-4,-10,2,3};
		
		// PUNTO A
		
		Datos d = Calculadora.maxminprom(vector);
		
		System.out.printf("Máximo = %d, Mínimo = %d, Promedio = %f \n", d.getMax(),d.getMin(),d.getProm());
		
		// PUNTO B
		
		Contenedor c = new Contenedor();

		Calculadora.maxminprom(vector,c);

		System.out.printf("Máximo = %d, Mínimo = %d, Promedio = %f \n", c.d.getMax(),c.d.getMin(),c.d.getProm());
		
		
		
		
	}
	
	public static class Contenedor{
		Datos d;
		
		public Contenedor() {
			d = new Datos();
		}
		
	}
}
