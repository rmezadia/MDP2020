package es.unex.cum.mdp.sesion2;

import java.util.Arrays;


public class Camion extends Vehiculo {
	
	private Integer tonelaje;
	
	public Camion() {
		super();
		tonelaje =new Integer(0);
	}

	public Camion(String marca, String modelo, Persona p,Integer bastidor, Integer tonelaje) {
		super(marca,modelo,p,bastidor);
		this.tonelaje = tonelaje;
		
	}


	public Integer getTonelaje() {
		return tonelaje;
	}
	
	public void setTonelaje(Integer tonelaje) {
		this.tonelaje = tonelaje;
	}

	@Override
	public String toString() {
		String cadena;
		cadena = "Camion[marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas=" + piezas
				+ Arrays.toString(piezas) + ", cont=" + cont + " tonelaje=" + tonelaje + "]";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		Camion ca = (Camion) obj;
		return super.equals(ca) && this.tonelaje == ca.tonelaje;
	}

}