package es.unex.cum.mdp.sesion4;

// TODO: Auto-generated Javadoc
/**
 * The Class Pieza has a Treeset in scrapping and it must has a comparable interface.
 */
public class Pieza implements Comparable {
	
	/** The id. */
	private String id;
	
	/** The nombre. */
	private String nombre;
	
	/** The stock. */
	private Integer stock;
	
	/**
	 * Instantiates a new pieza.
	 */
	public Pieza() {
		id=new String();
		nombre=new String();
		stock =new Integer(0);
	}

	/**
	 * Instantiates a new pieza.
	 *
	 * @param id the id
	 * @param nombre the nombre
	 * @param stock the stock
	 */
	public Pieza(String id, String nombre, Integer stock) {
		this.id=id;
		this.nombre=nombre;
		this.stock=stock;
	}

	/**
	 * Instantiates a new pieza.
	 *
	 * @param p the p
	 */
	public Pieza(Pieza p) {
		id=p.id;
		nombre=p.nombre;
		stock=p.stock;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
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
	 * Gets the stock.
	 *
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id=id;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	/**
	 * Sets the stock.
	 *
	 * @param stock the new stock
	 */
	public void  setStock(Integer stock) {
		this.stock=stock;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String cadena="Pieza [id="+id+", nombre="+nombre+", "+"stock="+stock+"]";
		return cadena;
	}

	/**
	 * Equals.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object o) {
		Pieza p=(Pieza)o;
		return this.id.equals(p.id)&&this.nombre.equals(p.nombre)&&this.stock==p.stock;
	}

	@Override
	/**
	 * Compares two pieces because these are into a TreeSet.Compares for id.
	 */
	public int compareTo(Object o) {
	
		Pieza pi1 = (Pieza)o;
		return this.id.compareTo(pi1.id);
	}

	
}