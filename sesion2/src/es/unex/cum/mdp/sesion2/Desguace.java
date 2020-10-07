package es.unex.cum.mdp.sesion2;

import java.util.Arrays;

public class Desguace {

	private String nombre;
	private Vehiculo[] vehiculos;
	private Integer cont;

	public Desguace() {
		nombre = new String();
		// vehiculos =null;
		cont = new Integer(0);
	}

	public Desguace(String nombre, int tam) {
		this.nombre = nombre;
		vehiculos = new Vehiculo[tam];
		this.cont = 0;

	}

	public Desguace(Desguace d) {
		nombre = d.nombre;
		vehiculos = d.vehiculos;
		cont = d.cont;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Integer getCont() {
		return cont;
	}

	public void setCont(Integer cont) {
		this.cont = cont;
	}

	@Override
	public String toString() {
		return "Desguace [nombre=" + nombre + ", vehiculos= , cont=" + cont + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Desguace de = (Desguace) obj;
		return this.nombre.equals(de.nombre) && Arrays.equals(vehiculos, de.vehiculos) && this.cont == de.cont;
	}

	public boolean addVehiculo(Vehiculo v) {
		boolean existe = true;
		if (cont < vehiculos.length && cont >= 0) {
			for (int i = 0; i < cont; i++) {
				if (vehiculos[i] != null) {
					if (vehiculos[i].getBastidor() == (v.getBastidor())) {
						existe = false;
					}
				}
			}
			if (existe) {
				vehiculos[cont] = v;
				cont++;
				existe = true;
			} else {
				existe = false;
			}
		} else {
			existe = false;
		}

		return existe;
	}

	public Vehiculo getVehiculoBastidor(Integer bastidor) {

		if (bastidor != null) {
			for (int i = 0; i < cont; i++) {
				if (bastidor.equals(vehiculos[i].getBastidor())) {

					return vehiculos[i];
				}

			}
		}
		return null;
	}

	public boolean addPiezaVehiculo(Pieza p, Integer bastidor) {
		boolean siPieza = false;
		int aux=0;
		Vehiculo ve = this.getVehiculoBastidor(bastidor);
		if (ve==null || cont ==0) {
		    return false;
		}
		else{
		    for (int i = 0; i < ve.getCont(); i++) {
		        String idVeh=ve.getPiezas()[i].getId();
		        if (p.getId().equals(idVeh)) {
				    siPieza = true;
					aux=ve.getPiezas()[i].getStock();
					aux=aux+p.getStock();
					ve.getPiezas()[i].setStock(aux);
		        }
		    } 
			 if (siPieza==false && ve.getCont()<3) {
			    return ve.addPiezaV(p);
			 }
		}
		return siPieza;
	}

	public int cuantasPiezasPar() {
		
		int vPiezasPar = 0;
		for (int i = 0; i <cont; i++) {
		    int aux=0;
			for (int j=0;j<vehiculos[i].getCont();j++) {
				if(vehiculos[i].getPiezas()[j]!=null){
				aux++;
				}
			}
		if(aux%2==0 && aux!=0){
		    vPiezasPar++;
		}
			}
		return vPiezasPar;
	}

	public String getInfoDerivada(int pos) {
		String info = null;

		if (pos >= 0 && pos < cont) {
			if (vehiculos[pos].getClass().equals(Moto.class)) {
				Moto m = (Moto) vehiculos[pos];
				info = Integer.toString(m.getPotencia());
			} else if (vehiculos[pos].getClass().equals(Camion.class)) {
				Camion c = (Camion) vehiculos[pos];
				info = Integer.toString(c.getTonelaje());
			} else if (vehiculos[pos].getClass().equals(Coche.class)) {
				Coche c = (Coche) vehiculos[pos];
				info = c.getColor();
			}

		}

		return info;
	}
}