package es.unex.cum.mdp.sesion2;

import java.util.Arrays;

public class Vehiculo {

	protected String marca;
	protected String modelo;
	protected Persona propietario;
	protected Pieza[] piezas;
	protected int cont;
	protected Integer bastidor;

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

	public Vehiculo(Vehiculo p) {
		marca = p.marca;
		modelo = p.modelo;
		propietario = p.propietario;
		piezas = p.piezas;
		cont = p.cont;
		bastidor=p.bastidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Pieza[] getPiezas() {
		return piezas;
	}

	public void setPiezas(Pieza[] piezas) {
		this.piezas = piezas;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public Integer getBastidor() {
		return bastidor;
	}

	public void setBastidor (Integer bastidor) {
		this.bastidor=bastidor;
	}
	
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
	    
	public Pieza getPiezaV(int pos) {

		if (pos >= 0 && pos <=piezas.length ) {
			return piezas[pos];
		} else
			return null;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas="
				+ Arrays.toString(piezas) + ", cont=" + cont + "]";
	}


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