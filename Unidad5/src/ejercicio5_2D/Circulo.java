package ejercicio5_2D;

public class Circulo {
	private float radio;
	
	public Circulo(float radio) {
		this.radio=radio;
	}
	
	public float areaCirculo() {
		return (float) (Math.PI * (radio*radio)); 
	}
}
