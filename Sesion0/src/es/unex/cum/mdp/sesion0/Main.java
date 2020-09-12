package es.unex.cum.mdp.sesion0;

/**
 * @author Ricardo Meza Díaz
 */
public class Main {
	/**
	 * @param args Parametros de entrada de la consola
	 */
	public static void main(String[] args) {
		Persona p = new Persona();
		Persona p1 = new Persona("Paco", "12345678A", 37);
		Persona p2 = new Persona(p1);
		System.out.println(p);
		System.out.println(p1);
		Persona p3 = p2;
		p3.setEdad(100);
		System.out.println(p2);
		System.out.println(p3);
		Persona p4 = new Persona(p2.getNombre(), p2.getDni(), p2.getEdad());
		Persona[] vector = new Persona[10];
		vector[0] = new Persona();
		vector[1] = new Persona("", "", 10);
		vector[2] = p4;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != null)
				System.out.println(vector[i]);
		}
	}
}