package ejercicio5_2D;

public class Rectangulo {
	private float base, altura;
	
	public Rectangulo(float altura, float base) {
		this.base=base;
		this.altura=altura;
	}
	
	public float areaRectangulo() {
		return base*altura; 
	}
}
