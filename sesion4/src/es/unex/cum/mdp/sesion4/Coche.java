package es.unex.cum.mdp.sesion4;


import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class Coche.
 */
public class Coche extends Vehiculo {

	/** The color. */
	private String color;
	
	/**
	 * Instantiates a new coche.
	 */
	public Coche() {
		super(); 
		color=new String();
	}

	/**
	 * Instantiates a new coche.
	 *
	 * @param marca the marca
	 * @param modelo the modelo
	 * @param p the p
	 * @param bastidor the bastidor
	 * @param color the color
	 */
	public Coche(String marca,String modelo,Persona p,Integer bastidor,String color) {
		super(marca,modelo,p,bastidor);
		this.color=color;
		
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String cadena;
		cadena= "Coche[marca="+ marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas="+piezas  
			+ Arrays.toString(piezas) + ", cont=" + cont+" color="+color+"]";
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
		Coche co=(Coche)obj;
		return super.equals(co)&&this.color==co.color;
	}
	

}