package es.unex.cum.mdp.sesion2;

import java.util.Arrays;

public class Moto extends Vehiculo {
	
	private Integer potencia;

	public Moto() {
		super();
		potencia = 0;
	}

	public Moto(String marca, String modelo, Persona p, Integer bastidor, Integer potencia) {
		super(marca, modelo, p, bastidor);
		this.potencia = potencia;

	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		String cadena;
		cadena = "Moto[marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas=" + piezas
				+ Arrays.toString(piezas) + ", cont=" + cont + " potencia=" + potencia + "]";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		Moto mo = (Moto) obj;
		return super.equals(mo) && this.potencia == mo.potencia;
	}
}