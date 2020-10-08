package es.unex.cum.mdp.sesion4;

import java.util.Arrays;


// TODO: Auto-generated Javadoc
/**
 * The Class Camion.
 */
public class Camion extends Vehiculo {
	
	/** The tonelaje. */
	private Integer tonelaje;
	
	/**
	 * Instantiates a new camion.
	 */
	public Camion() {
		super();
		tonelaje =new Integer(0);
	}

	/**
	 * Instantiates a new camion.
	 *
	 * @param marca the marca
	 * @param modelo the modelo
	 * @param p the p
	 * @param bastidor the bastidor
	 * @param tonelaje the tonelaje
	 */
	public Camion(String marca, String modelo, Persona p,Integer bastidor, Integer tonelaje) {
		super(marca,modelo,p,bastidor);
		this.tonelaje = tonelaje;
		
	}


	/**
	 * Gets the tonelaje.
	 *
	 * @return the tonelaje
	 */
	public Integer getTonelaje() {
		return tonelaje;
	}
	
	/**
	 * Sets the tonelaje.
	 *
	 * @param tonelaje the new tonelaje
	 */
	public void setTonelaje(Integer tonelaje) {
		this.tonelaje = tonelaje;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String cadena;
		cadena = "Camion[marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas=" + piezas
				+ Arrays.toString(piezas) + ", cont=" + cont + " tonelaje=" + tonelaje + "]";
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
		Camion ca = (Camion) obj;
		return super.equals(ca) && this.tonelaje == ca.tonelaje;
	}

}