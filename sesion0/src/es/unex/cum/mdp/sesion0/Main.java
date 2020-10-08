package es.unex.cum.mdp.sesion0;

/**
 * MODIFICACION: Voluntariamente, le agregare metodos a la practica y un menu.
 */


import java.util.Scanner;



/**
 * Clase Main que contiene la lógica del programa.
 * 
 * @author Ricardo Meza Díaz
 * 
 */
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Definicion objeto main para llamar a los metodos
		Main m = new Main();
		// Variables
		int suma = 0;
		float media = 0.0F;
		/**
		 * Para los numero mas alto
		 */
		int numMasAlto = 0;
		int posicion = 0;
		/**
		 * Para el tamanio del array
		 */
		int tamanio = 0;
		/**
		 * Para la opcion del menu
		 */
		int opcion = 0;

		// Objeto Scanner
		Scanner sc = new Scanner(System.in);

		/**
		 * Rellenar el array.Se asigna el tamaño y se van introduciendo los
		 * datos en el array
		 */
		System.out.println("BIENVENIDO!");
		System.out.println("Introduzca el tamanio del array: ");
		tamanio = sc.nextInt();
		while(tamanio<0){
			System.out.println("Ha introducido un numero incorrecto.");
			System.out.println("Por favor,introduzca un numero entero positivo: ");
			tamanio = sc.nextInt();
		}

		// Declaracion array
		Festival[] array;
		array = new Festival[tamanio];
		// Llamada al modulo menu
		//opcion = m.menu();
		// Control para opcion correcta.MEJORAR.
		while (opcion != 6) {
			switch (opcion) {
			case 1:
				m.inicializarArray(array);
				break;
			case 2:
				m.rellenarArray(array);
				break;
			case 3:
				m.mostrarArray(array);
				break;
			case 4:
				System.out.print("Media: ");
				m.calMedia(media, suma, array);
				break;
			case 5:
				System.out.print(" Alto: ");
				m.masAlto(numMasAlto, array, posicion);
				break;

			}
			//opcion = m.menu();
		}
		System.out.println("Usted ha salido.");

	}

	Teclado t=new Teclado();
	/**
	 * Metodo inicializar array: Inicializa el array. Le paso como parametros el
	 * array.
	 * @param array Vector de Festivales.
	 */
	public void inicializarArray(Festival[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Festival();
		}
	}

	/**
	 * Rellenar el array: Va introduciendo datos en el array.
	 * @param array Vector de Festivales.
	 */
	public void rellenarArray(Festival[] array) {
		for (int i = 0; i < array.length; i++) {
			
			//String nom = sc.next();
			String nom;
			nom=t.literalConString("Introduzca el nombre del festival: ");
			array[i].setNombre(nom);

			int anio;
			anio=t.literalConEntero("Introduzca la edicion del festival: ");
			//int anio = sc.nextInt();
			
			array[i].setAnio(anio);

			double precio;
			//precio=t.leerDouble("Introduzca la edicion del festival: ");
			//int anio = sc.nextInt();
			while(anio<0){
				System.out.println("Ha introducido un numero incorrecto.");
				System.out.println("Por favor,introduzca un numero entero positivo: ");
				anio = sc.nextInt();
			}
			array[i].setPrecio(anio);

		}
	}


	/**
	 * MostrarArray: Muestra todos los datos del array.
	 * @param array Vector de Festivales.
	 */
	public void mostrarArray(Festival[] array) {
		for (int i = 0; i < array.length; i++) {
			// If para verificar el array se haya rellenado y no está vacio
			if (array[i] != null)
				System.out.println(array[i].toString());
		}
	}

	
	/**
	 * Calcula la media de los años de los festivales.
	 * @param media Media Aritmética.
	 * @param suma Suma de los años de los festivales.
	 * @param array Vector de Festivales.
	 */
	public void calMedia(float media, double suma, Festival[] array) {
		for (int i = 0; i < array.length; i++) {
			// Calculo la suma antes para calcular luego la media mas facilmente
			suma = suma + array[i].getPrecio();
		}
		media = (float) suma / array.length;
		System.out.print(+media);

	}

	/**
	 * El valor ma alto del array
	 * @param numMasAlto Número más alto de los años de los festivales.
	 * @param array Vector de Festivales.
	 * @param posicion Posición del array.
	 */
	public void masAlto(int numMasAlto, Festival[] array, int posicion) {
		numMasAlto = array[0].getAnio();
		for (int i = 0; i < array.length; i++) {
			if (array[i].getAnio() > numMasAlto) {

				numMasAlto = array[i].getAnio();
				posicion = i;
			}
		}
		System.out.print(numMasAlto);
	}
/**
	
	/**
	 * Muesra el menú del programa.

	 * @return La opción elegida en el menú.
	 */
	/**
	 */
	/**
	public int menu() {

		int opcion = 0;
		
		System.out.println("Escoja una opcion:");
		System.out.println("1.Inicializar array");
		System.out.println("2.Rellenar array");
		System.out.println("3.Mostrar datos array");
		System.out.println("4.Calcular media de las ediciones de los festivales");
		System.out.println("5.Calcular  el número de año más alto del año de los festivales.");
		System.out.println("6.Salir");

		opcion = sc.nextInt();
		while (opcion < 1 || opcion > 6) {
			System.out.println("Error.Ha introducido un numero incorrecto");
			System.out.println("Introduzca un numero del 1 al 6:");
			opcion = sc.nextInt();

		}
		return opcion;
	}
	*/
}