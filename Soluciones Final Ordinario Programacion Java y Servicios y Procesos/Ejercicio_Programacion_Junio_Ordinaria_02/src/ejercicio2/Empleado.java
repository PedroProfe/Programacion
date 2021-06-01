package ejercicio2;

public class Empleado {

	static int empleados = 0;
	int numEmpleado;
	String numSeguridadSocial;
	String nombre;
	
	public Empleado(String numsegsoci, String nomb) {
		empleados++;
		this.numEmpleado = empleados;
		this.numSeguridadSocial=numsegsoci;
		this.nombre = nomb;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNumSeguridadSocial() {
		return numSeguridadSocial;
	}

	public void setNumSeguridadSocial(String numSeguridadSocial) {
		this.numSeguridadSocial = numSeguridadSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		
		return "Nombre: " + this.nombre + " número de la seguridad social: "+ this.numSeguridadSocial+ " número de empleado: "+ this.numEmpleado;
	}
	
}
