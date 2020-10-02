public class Tienda{
	private HashSet <Camara> alquileres;
	private HashMap <String,Servicio> servicio;
	private HashMap <String,Cliente>cliente;
	...
}

//Enumerados que iriran en un fichero eformato.java
enum eFormato { 35, 110, 120 }
enum eIso { 50,...}
enum eEstado {Álquilado, Retraso, Reparacion, Libre }

public class Camara{
	private String marca;
	private String modelo;
	private boolean flash;
	private HashMap <Integer, Item> items;
	private LinkedList <Pelicula> compatibles;
}

public class Pelicula{
	private eFormato formato;
	private eIso iso;
}

public class Alquiler{
	private Item tem;
	private Date fechaInicio;
	private Date fechaFinal;
	private boolean amonestado;
	private float multa;
	private Clienge client;
}

//Ejemplo alquilar()
public boolean Alquilar(){
	Item i = buscarItem();
	Clente c = buscarCliente();

	Alquiler a = new Alquiler(i, new Date(), c);
	//Esto lo que hace es que sea bidireccional.
	c.addAlquiler(a);
	i.addAlquiler(c);
}
//Ejemplo main 
Main{

	//Despues del main
	eIso iso =e.Iso.50;
	if (iso==eIso.50) {
		
	}
}