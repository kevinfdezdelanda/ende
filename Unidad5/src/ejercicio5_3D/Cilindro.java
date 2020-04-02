package ejercicio5_3D;
import ejercicio5_2D.Circulo;

public class Cilindro {
	private float altura;
	private float radio;
	
	public Cilindro(float altura, float radio) {
		this.altura=altura;
		this.radio= radio;
	}
	
	public float volumenCilindro() {
		Circulo circulo = new Circulo(radio);
		return circulo.areaCirculo()*altura; 
	}

}
