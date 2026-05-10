package entity;

public class Contador {
	public static int cantidadObjetos = 0;

	public Contador() {
		super();
		cantidadObjetos++;
	}
	
	public static void mostrarTotal() {
        System.out.println("Total de objetos creados: " + cantidadObjetos);
    }
}
