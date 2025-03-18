package tp1.ej5;

import tp1.ej5.Ej.Contenedor;

public class Calculadora{

	public static int calcMax(int[] v) {
		int max = v[0];
		for (int i = 1; i < v.length; i++)
			if (v[i] > max)
				max = v[i];
		return max;
	}
	
	public static int calcMin(int[] v) {
		int min = v[0];
		for (int i = 1; i < v.length; i++)
			if (v[i] < min)
				min = v[i];
		return min;
	}
	
	public static double calcProm(int[] v) {
		double sum = v[0];
		for (int i = 1; i < v.length; i++)
			sum+=v[i];
		return (sum/v.length);
	}
	
	public static Datos maxminprom(int[]v) {
		if (v==null) 
			return null;
		int max=v[0], min = v[0];
		double sum = v[0];
		for(int i=1;i<v.length;i++) {
			if (v[i] < min)
				min = v[i];
			if (v[i] > max)
				max = v[i];
			sum+=v[i];
		}
		
		Datos obj = new Datos();
		obj.setMax(max);
		obj.setMin(min);
		obj.setProm(sum/v.length);
		return obj;
	}
	
	public static void maxminprom(int[]v,Contenedor c) {
		if (v==null) 
			return;
		int max=v[0], min = v[0];
		double sum = v[0];
		for(int i=1;i<v.length;i++) {
			if (v[i] < min)
				min = v[i];
			if (v[i] > max)
				max = v[i];
			sum+=v[i];
		}
		
		Datos obj = new Datos();
		obj.setMax(max);
		obj.setMin(min);
		obj.setProm(sum/v.length);
		
		
		c.d = obj;
	}
}
	
	

