package ejercicio1_2;

import ejercicio1.Vaca;

public class Principal {
	public static void main(String[] args) {
		Vaca miVaca1 = new Vaca("blanco", 21,"Josefa");
		Vaca miVaca2 = new Vaca("Ignatio", 20);
		Vaca miVaca3 = new Vaca("Antonio");
		System.out.println();
		
		miVaca1.muu();
		miVaca2.muu();
		miVaca3.muu();
		System.out.println();
		
		miVaca1.compararEdad(miVaca2);
		System.out.println();
		
		System.out.println("Nombre vaca 1: "+miVaca1.getNombre());
		System.out.println();
		
		System.out.println("edad vaca1: "+miVaca1.getEdad());
		miVaca1.setEdad(miVaca1.getEdad()+1);
		System.out.println("edad vaca1: "+miVaca1.getEdad());
		
	}
}
