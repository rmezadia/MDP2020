package es.unex.cum.mdp.sesion4;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class Vehiculo has a ArrayList in scrapping.
 */
public class Vehiculo {

	/** The marca. */
	protected String marca;
	
	/** The modelo. */
	protected String modelo;
	
	/** The propietario. */
	protected Persona propietario;
	
	/** The piezas. */
	protected Pieza[] piezas;
	
	/** The cont. */
	protected int cont;
	
	/** The bastidor. */
	protected Integer bastidor;
	
	

	/**
	 * Instantiates a new vehiculo.
	 */
	public Vehiculo() {
		marca = new String();
		modelo = new String();
		propietario = new Persona();
		piezas = new Pieza[3]; 
		for(int i=0;i<piezas.length;i++){
		    piezas[i] = new Pieza();
		}
		cont = 0;
		bastidor= 0;
	}

	/**
	 * Instantiates a new vehiculo.
	 *
	 * @param marca the marca
	 * @param modelo the modelo
	 * @param propietario the propietario
	 * @param bastidor the bastidor
	 */
	public Vehiculo(String marca, String modelo, Persona propietario,Integer bastidor) {
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
	    piezas = new Pieza[3]; 
	    	for(int i=0;i<piezas.length;i++){
		    piezas[i] = new Pieza();
		}
	    cont = 0;
	    this.bastidor=bastidor;
	}

	/**
	 * Instantiates a new vehiculo.
	 *
	 * @param p the p
	 */
	public Vehiculo(Vehiculo p) {
		marca = p.marca;
		modelo = p.modelo;
		propietario = p.propietario;
		piezas = p.piezas;
		cont = p.cont;
		bastidor=p.bastidor;
	}

	/**
	 * Gets the marca.
	 *
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Sets the marca.
	 *
	 * @param marca the new marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Gets the modelo.
	 *
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Sets the modelo.
	 *
	 * @param modelo the new modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Gets the propietario.
	 *
	 * @return the propietario
	 */
	public Persona getPropietario() {
		return propietario;
	}

	/**
	 * Sets the propietario.
	 *
	 * @param propietario the new propietario
	 */
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	/**
	 * Gets the piezas.
	 *
	 * @return the piezas
	 */
	public Pieza[] getPiezas() {
		return piezas;
	}

	/**
	 * Sets the piezas.
	 *
	 * @param piezas the new piezas
	 */
	public void setPiezas(Pieza[] piezas) {
		this.piezas = piezas;
	}

	/**
	 * Gets the cont.
	 *
	 * @return the cont
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Sets the cont.
	 *
	 * @param cont the new cont
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * Gets the bastidor.
	 *
	 * @return the bastidor
	 */
	public Integer getBastidor() {
		return bastidor;
	}

	/**
	 * Sets the bastidor.
	 *
	 * @param bastidor the new bastidor
	 */
	public void setBastidor (Integer bastidor) {
		this.bastidor=bastidor;
	}
	
	/**
	 * Adds the pieza V.
	 *
	 * @param p the p
	 * @return true, if successful
	 */
	public boolean addPiezaV(Pieza p) {
	    int c=0;
	    int longitudPieza=piezas.length;
	    
	    while(c<longitudPieza){
	        if(piezas[c].equals(p)){
	            return false;
	        }
	        c++;
	    }
	    
	    if(cont<longitudPieza){
	        piezas[cont]=p;
	        cont++;
	        return true;
	    }
	    return false;
	}
	    
	/**
	 * Gets the pieza V.
	 *
	 * @param pos the pos
	 * @return the pieza V
	 */
	public Pieza getPiezaV(int pos) {

		if (pos >= 0 && pos <=piezas.length ) {
			return piezas[pos];
		} else
			return null;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas="
				+ Arrays.toString(piezas) + ", cont=" + cont + "]";
	}


	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (bastidor == null) {
			if (other.bastidor != null)
				return false;
		} else if (!bastidor.equals(other.bastidor))
			return false;
		if (cont != other.cont)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (!Arrays.equals(piezas, other.piezas))
			return false;
		if (propietario == null) {
			if (other.propietario != null)
				return false;
		} else if (!propietario.equals(other.propietario))
			return false;
		return true;
	}

}