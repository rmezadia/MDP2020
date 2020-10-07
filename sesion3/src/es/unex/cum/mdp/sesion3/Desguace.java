package es.unex.cum.mdp.sesion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Desguace.
 */
public class Desguace {

	/** The nombre. */
	private String nombre;
	
	/** The vehiculos. */
	private Vehiculo[] vehiculos;
	
	/** The cont. */
	private Integer cont;
	
	private LinkedList<Proveedor>listaProveedores=new LinkedList();
	
	//Set of pieces into stock.
	private TreeSet<Pieza>arbolPiezas=new TreeSet<Pieza>();
	
	
	private ArrayList<Vehiculo>arrayVehiculos = new ArrayList<Vehiculo>();

	/**
	 * Instantiates a new desguace.
	 */
	public Desguace() {
		nombre = new String();
		// vehiculos =null;
		cont = new Integer(0);
		
	}

	/**
	 * Instantiates a new desguace.
	 *
	 * @param nombre the nombre
	 * @param tam the tam
	 */
	public Desguace(String nombre, int tam) {
		this.nombre = nombre;
		vehiculos = new Vehiculo[tam];
		this.cont = 0;

	}

	/**
	 * Instantiates a new desguace.
	 *
	 * @param d the d
	 */
	public Desguace(Desguace d) {
		nombre = d.nombre;
		vehiculos = d.vehiculos;
		cont = d.cont;

	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the vehiculos.
	 *
	 * @return the vehiculos
	 */
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	/**
	 * Sets the vehiculos.
	 *
	 * @param vehiculos the new vehiculos
	 */
	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	/**
	 * Gets the cont.
	 *
	 * @return the cont
	 */
	public Integer getCont() {
		return cont;
	}

	/**
	 * Sets the cont.
	 *
	 * @param cont the new cont
	 */
	public void setCont(Integer cont) {
		this.cont = cont;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Desguace [nombre=" + nombre + ", vehiculos= , cont=" + cont + "]";
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		Desguace de = (Desguace) obj;
		return this.nombre.equals(de.nombre) && Arrays.equals(vehiculos, de.vehiculos) && this.cont == de.cont;
	}

	/**
	 * Adds the vehiculo.
	 *
	 * @param v the v
	 * @return true, if successful
	 */
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

	/**
	 * Gets the vehiculo bastidor.
	 *
	 * @param bastidor the bastidor
	 * @return the vehiculo bastidor
	 */
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

	/**
	 * Adds the pieza vehiculo.
	 *
	 * @param p the p
	 * @param bastidor the bastidor
	 * @return true, if successful
	 */
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

	/**
	 * Cuantas piezas par.
	 *
	 * @return the int
	 */
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

	/**
	 * Gets the info derivada.
	 *
	 * @param pos the pos
	 * @return the info derivada
	 */
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