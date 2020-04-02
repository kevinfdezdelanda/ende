package ejercicio2;

public class Canario extends Ave{
	private float tamano;
	
	public Canario(char sexo, int edad, float tamano) {
		super(sexo, edad);
		this.tamano=tamano;
	}

	public Canario(char sexo, int edad) {
		super(sexo, edad);
		// TODO Auto-generated constructor stub
	}
	
	protected void altura() {
		if(tamano>30) {
			System.out.println("Alto");
		}else if(tamano < 15) {
			System.out.println("Bajo");
		}else {
			System.out.println("Mediano");
		}
	}

	public float getTamano() {
		return tamano;
	}

	public void setTamano(float tamano) {
		this.tamano = tamano;
	}

}
