package es.unex.cum.mdp.sesion4;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class Moto.
 */
public class Moto extends Vehiculo {
	
	/** The potencia. */
	private Integer potencia;

	/**
	 * Instantiates a new moto.
	 */
	public Moto() {
		super();
		potencia = 0;
	}

	/**
	 * Instantiates a new moto.
	 *
	 * @param marca the marca
	 * @param modelo the modelo
	 * @param p the p
	 * @param bastidor the bastidor
	 * @param potencia the potencia
	 */
	public Moto(String marca, String modelo, Persona p, Integer bastidor, Integer potencia) {
		super(marca, modelo, p, bastidor);
		this.potencia = potencia;

	}

	/**
	 * Gets the potencia.
	 *
	 * @return the potencia
	 */
	public Integer getPotencia() {
		return potencia;
	}

	/**
	 * Sets the potencia.
	 *
	 * @param potencia the new potencia
	 */
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String cadena;
		cadena = "Moto[marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas=" + piezas
				+ Arrays.toString(piezas) + ", cont=" + cont + " potencia=" + potencia + "]";
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
		Moto mo = (Moto) obj;
		return super.equals(mo) && this.potencia == mo.potencia;
	}
}