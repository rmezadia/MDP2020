ackage es.unex.cum.mdp.sesion2;

import java.util.Arrays;

public class Coche extends Vehiculo {

	private String color;
	
	public Coche() {
		super(); 
		color=new String();
	}

	public Coche(String marca,String modelo,Persona p,Integer bastidor,String color) {
		super(marca,modelo,p,bastidor);
		this.color=color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		String cadena;
		cadena= "Coche[marca="+ marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas="+piezas  
			+ Arrays.toString(piezas) + ", cont=" + cont+" color="+color+"]";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		Coche co=(Coche)obj;
		return super.equals(co)&&this.color==co.color;
	}
	

}