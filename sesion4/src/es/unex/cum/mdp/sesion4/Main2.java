package es.unex.cum.mdp.sesion4;

import java.io.IOException;

// TODO: Auto-generated Javadoc
/**
 * The Class Main2.
 */
public class Main2 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {

		//Variables
		int numero,opcion;
		String nombre,marcaVeh,modeloVeh,nombreProp,numDni,idPi,nombrePi;
		Integer numeroBast,edadPropi,stock;
		Persona propietaVeh;
		//Objetos
		Desguace des=new Desguace();
		Teclado t=new Teclado();
		Vehiculo veh=new Vehiculo();
		Pieza piez=new Pieza();
		boolean existe=false;
		
		//Menú
		do {
			String []menu={"1.- Añadir Vehiculo",
					"2.- Buscar vehiculo por bastidor",
					"3.- Añadir pieza vehiculo por bastidor",
					"4.- Buscar vehiculo por bastidor",
					"5.- Añadir pieza a vehiculo a través del bastidor",
					"6.- Cantidad de vehiculos con piezas par",
					"7.- Mostrar datos vehiculo segun la posicion",
					"8.- Ver lista de vehiculos",
					"9.- Salir"};
			opcion = t.Menu(menu, 1, 9);
			
			switch (opcion) {
			case 1:	
				//boolean yaExiste=true;
				marcaVeh=t.literalConString("Introduzca marca");
				modeloVeh=t.literalConString("Introduzca modelo");
				nombreProp=t.literalConString("Introduzca nombre de prop:");
				numDni=t.literalConString("Introduzca numDni");
				edadPropi=t.literalConEntero("Introduzca edad propie");
				propietaVeh=new Persona (nombreProp,numDni,edadPropi);
				numeroBast=t.literalConEntero("Introduzca número de bastidor ");
				Vehiculo vehi=new Vehiculo(marcaVeh,modeloVeh,propietaVeh,numeroBast);
				
				if(des.addVehiculo(vehi)){
					System.out.println("Anadido");
					System.out.println(vehi.toString());

				}
				else{
					for (int i = 0; i < des.getVehiculos().length; i++) {
						System.out.println( des.getVehiculos()[i]);
					}
					System.out.println("Error");
				}
				
				
				break;
			case 2:	
				/**
				//nombre=t.literalConString("Introduzca nombre: ");
				//telefono=t.literalConEntero("Introduzca numero de teléfono: ");
				//if(h.addContact(nombre, telefono)){
					System.out.println("Anadido");
				}
				else{
					System.out.println("Error");
				}
				
				
				*/
				Vehiculo vehic=new Vehiculo();
				System.out.println("Procederemos a la busqueda del vehiculo.");
				numeroBast=t.literalConEntero("Introduzca numero de bastidor: ");
				vehic=des.getVehiculoBastidor(numeroBast);
				if(vehic==null) {
					System.out.println("El vehiculo no existe");
				}
				else {
					System.out.println(vehic);
				}
								
				
				break;
			case 3:
				//telefono=t.literalConEntero("Introduzca numero de teléfono: ");
				//System.out.println(h.getContact(telefono));
				System.out.println("Introduciremos una pieza al vehiculo.");
				System.out.println("Para ello,debe darnos un numero de bastidor.");
				numeroBast=t.literalConEntero("Introduzca un numero de bastidor: ");
				System.out.println("Introduzca datos pieza: ");
				idPi=t.literalConString("Introzuca id de la pieza: ");
				nombrePi=t.literalConString("Introduzca nombre: ");
				stock=t.literalConEntero("Introzuca numero stock: ");
				//stock++;
				Pieza pi=new Pieza(idPi,nombrePi,stock);
				if(des.addPiezaVehiculo(pi, numeroBast)==true) {
					System.out.println("Se ha anadido la pieza");
				}
				else {
					System.out.println("La pieza no se puede añadir al vehiculo porque no existe ningun vehiculo con ese bastidor.");
				}
				
				
				
				
				
				break;
			case 4:
				//nombre=t.literalConString("Introduzca nombre");
				//System.out.println(h.getContact(nombre));
				break;
			case 5:
				//telefono=t.literalConEntero("Introduzca numero de teléfono: ");
				//mensaje=t.literalConString("Introduzca mensaje");
				//Message men=new Message(mensaje,date);
				//if(h.addMessageToContact(telefono, men)){
					//System.out.println("Anadido");
				//}
				//else{
					//System.out.println("Error");
				//}
				
				break;
			case 6:
				
				
				break;
			case 7:	
				//telefono=t.literalConEntero("Introduzca numero de teléfono: ");
				//System.out.println(h.getMessage(telefono));
				break;
			case 8:
				//des.mostrarArray();
				
				break;
			case 9:
				
				break;
			
			}
		} while (opcion != 9);
		
	}
}

