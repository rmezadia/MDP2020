package es.unex.cum.mdp.sesion0;

/**
 * 
 * @author Ricardo Meza Díaz
 *
 */
public class Persona {
	private String nombre;
	private String dni;
	private int edad;

	/**
	 * Constructor por defecto de Persona. Inicializa a un valor por defecto todos
	 * sus atributos
	 */
	public Persona() {
		nombre = null;
		dni = null;
		edad = 0;
	}

	/**
	 * Constructor parametrizado encargado de inicializar a un valor recibido los
	 * atributos *
	 * 
	 * @param nombre Nombre de la persona
	 * @param dni    DNI de la persona
	 * @param edad   Edad de la persona
	 */
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	/**
	 * Constructor de copia que inicializa los atributos de una persona a partir de
	 * otro objeto persona *
	 * 
	 * @param p Persona
	 */
	public Persona(Persona p) {
		nombre = p.nombre;
		dni = p.dni;
		edad = p.edad;
	}

	/**
	 * Devuelve el nombre de la persona * @return El nombre de la persona
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la persona
	 * 
	 * @param nombre El nombre de la persona
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el dni de la persona * @return DNI de la persona
	 */
	protected String getDni() {
		return dni;
	}

	/**
	 * Establece el dni de la persona * @param dni DNI de la persona
	 */
	protected void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve la edad de la persona * @return Edad de la persona
	 */
	protected int getEdad() {
		return edad;
	}

	/**
	 * Establece la edad de la persona
	 * 
	 * @param edad Edad de la persona
	 */
	protected void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Recupera en formato String los valores de los atributos de la clase *
	 * toString
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

	/**
	 * Compara dos personas por DNI
	 */
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		/*
		 * MAL, pues dni es un String y estariamos comparando sus referencias * if
		 * (dni==p.dni) return true; else return false;
		 */
		/* BIEN */
		return dni.equals(p.dni);
	}
}