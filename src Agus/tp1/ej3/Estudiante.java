package tp1.ej3;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		
		return "Estudiante [nombre=" + this.getNombre() + ", apellido=" + this.getApellido() 
				+ ", comision=" + this.getComision() + ", email=" + this.getEmail()
				+ ", direccion=" + this.getDireccion() + "]";
	}
	
	// Ejercicio 7
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if ((o!=null) && (o instanceof Estudiante)) {
			Estudiante e = (Estudiante) o;
			if ((e.getNombre().equals(nombre))
				&& (e.getApellido().equals(apellido))
				&& (e.getComision().equals(comision))
				&& (e.getEmail().equals(email))
				&& (e.getDireccion().equals(direccion)))
				result = true;
			
		}
		return result;
	}
	
}
