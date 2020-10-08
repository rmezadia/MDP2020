package es.unex.cum.mdp.sesion0;




/**
 * Clase que contiene infomación sobre los festivales.
 * 
 * @author Ricardo Meza Díaz
 * 
 */
public class Festival {
	
	/**
	 * Atributos de la clase
	 */
	private String nombre;
	private int anio;
	private double precio;
	
	/**
	 * Contructor por defecto.Inicializa por defecto los valores de los
	 * atributos de esa clase.
	 */
	public Festival(){
		nombre=" ";
		anio=0;
		precio=0;
	}
	

	
	public Festival(String nombre,int anio, int precio) {
		this.nombre = nombre;
		this.anio = anio;
		this.precio = precio;
	}

	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getAnio() {
		return anio;
	}

	
	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	
	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "["+nombre+","+anio+","+precio+"]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festival other = (Festival) obj;
		if (anio != other.anio)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		return true;
	}
	
}
	 
	