package empresa;

public class Persona {
	@SuppressWarnings("unused")
	private String nombre, dni;
	@SuppressWarnings("unused")
	private int  altura, peso;
	
	public Persona(String nombre, String dni, int altura, int peso) {
		this.altura=altura;
		this.dni=dni;
		this.nombre=nombre;
		this.peso=peso;
	}
	
	public Persona(String dni) {
		this.dni= dni;
		nombre="";
		altura=0;
		peso=0;
	}
	
	public String toString() {
		return "nombre: "+nombre+"\n"+"peso: "+peso;
	}
	
	
}
