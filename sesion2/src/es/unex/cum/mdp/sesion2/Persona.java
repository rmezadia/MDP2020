package es.unex.cum.mdp.sesion2;

public class Persona {
	
	private String nombre;
	private String dni;
	private Integer edad;
	
	public Persona() {
	    nombre=new String();
	    dni=new String();
    	edad =new Integer(0);
	}

	public Persona(String nombre,String dni,Integer edad) {
        this.nombre=nombre;
	    this.dni=dni;
	    this.edad=edad;

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
			
	@Override
	public String toString() {
		String cadena;
		cadena = "Persona[nombre="+ nombre + ", dni=" + dni + ", edad=" + edad +"]";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		Persona pe=(Persona)obj;
		return this.nombre.equals(pe.nombre)&&this.dni.equals(pe.dni)&&this.edad==pe.edad;
	}
		
}