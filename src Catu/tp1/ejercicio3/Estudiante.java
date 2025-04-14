package tp1.ejercicio3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;

	// USE CLICK DERECHO --> SOURCE --> GENERATE GETTERS Y SETTERS :)

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

	// USE CLICK DERECHO --> SOURCE --> GENERATE TOSTRING :)

	public String tusDatos() {
		return "Estudiante [getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getComision()="
				+ getComision() + ", getEmail()=" + getEmail() + ", getDireccion()=" + getDireccion() + "]";
	}

	// PARA EL PUNTO 7D
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if ((o != null) && (o instanceof Estudiante)) {
			Estudiante e = (Estudiante) o;
			if (e.getNombre().equals(this.getNombre()) && e.getApellido().equals(this.getApellido()) && e.getComision().equals(this.getComision()))
				result = true;
		}
		return result;
	}

}
