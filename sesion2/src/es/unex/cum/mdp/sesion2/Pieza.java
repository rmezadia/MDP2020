package es.unex.cum.mdp.sesion2;

public class Pieza {
	
	private String id;
	private String nombre;
	private Integer stock;
	
	public Pieza() {
		id=new String();
		nombre=new String();
		stock =new Integer(0);
	}

	public Pieza(String id, String nombre, Integer stock) {
		this.id=id;
		this.nombre=nombre;
		this.stock=stock;
	}

	public Pieza(Pieza p) {
		id=p.id;
		nombre=p.nombre;
		stock=p.stock;
	}

	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public Integer getStock() {
		return stock;
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void  setStock(Integer stock) {
		this.stock=stock;
	}

	@Override
	public String toString() {
		String cadena="Pieza [id="+id+", nombre="+nombre+", "+"stock="+stock+"]";
		return cadena;
	}

	@Override
	public boolean equals(Object o) {
		Pieza p=(Pieza)o;
		return this.id.equals(p.id)&&this.nombre.equals(p.nombre)&&this.stock==p.stock;
	}

	
}