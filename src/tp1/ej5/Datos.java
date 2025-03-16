package tp1.ej5;

public class Datos {
	private int max;
	private int min;
	private double prom;	
	
	public Datos() {
		
	}
	public Datos(int[] vector) {
		int suma = 0;
		for (int numero: vector) {
			suma+=numero;
			max = ((numero > max) ? numero: max);
			min = ((numero < min) ? numero: min);
		}
		prom = (double) suma / vector.length;
	}
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	
}
