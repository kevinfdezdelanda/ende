package ejercicio2;

public class Piolin extends Canario{
	@SuppressWarnings("unused")
	private int numPeliculas; 
	
	public Piolin(char sexo, int edad, int numPeliculas, int tamaño) {
		super(sexo, edad, tamaño);
		this.numPeliculas=numPeliculas;
	}
	
	protected String cantar() {
		return super.cantar()+"Pio-pio soy un Piolín";
	}
	
	public static void main(String[] args) {
		Piolin p1 = new Piolin('H', 12, 26, 5);
		Loro l1 = new Loro('M', 16, "negro", 'O');
		
		p1.quienSoy();
		System.out.println();
		l1.quienSoy();
		
		System.out.println();
		p1.altura();
		
		System.out.println();
		l1.deDondeEres();
		
		p1.setTamano(12);;
		System.out.println();
		p1.altura();
		
		l1.setRegion('E');
		System.out.println();
		l1.deDondeEres();
		
		System.out.println();
		Ave.cantAves();
	}
}
