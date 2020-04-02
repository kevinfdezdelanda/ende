package ejercicio2;

public class Principal {
	public static void main(String[] args) {
		Piolin p1 = new Piolin('H', 12, 12,3);
		Piolin p2 = new Piolin('M', 9, 12,1);
		Piolin p3 = new Piolin('H', 30, 5,0);
		
		p1.setNombres(new DatosPersonales("p1", "d1"));
		
		Loro l1 = new Loro('M', 12, "negro", 'E');
	
		System.out.println(p1.cantar());
		System.out.println(p2.cantar());
		System.out.println(p3.cantar());
		System.out.println(l1.cantar());
		System.out.println();
		System.out.println("nombre ave: "+p1.getNombres().getNombreAve());
		System.out.println("nombre dueño: "+p1.getNombres().getNombreDueño());
	}
}
