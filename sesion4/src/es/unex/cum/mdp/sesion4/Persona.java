package es.unex.cum.mdp.sesion4;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona {
	
	/** The nombre. */
	private String nombre;
	
	/** The dni. */
	private String dni;
	
	/** The edad. */
	private Integer edad;
	
	/**
	 * Instantiates a new persona.
	 */
	public Persona() {
	    nombre=new String();
	    dni=new String();
    	edad =new Integer(0);
	}

	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param dni the dni
	 * @param edad the edad
	 */
	public Persona(String nombre,String dni,Integer edad) {
        this.nombre=nombre;
	    this.dni=dni;
	    this.edad=edad;

	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	
	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
			
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String cadena;
		cadena = "Persona[nombre="+ nombre + ", dni=" + dni + ", edad=" + edad +"]";
		return cadena;
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		Persona pe=(Persona)obj;
		return this.nombre.equals(pe.nombre)&&this.dni.equals(pe.dni)&&this.edad==pe.edad;
	}
		
}