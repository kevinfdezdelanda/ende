package ejercicio5_3D;

public class Esfera {
	private float radio;
	
	public Esfera(float radio) {
		this.radio=radio;
	}
	
	public float volumenEsfera() {
		Cilindro cilindro =new Cilindro(radio,radio);
		return cilindro.volumenCilindro()*(2/3f);
	}
}
