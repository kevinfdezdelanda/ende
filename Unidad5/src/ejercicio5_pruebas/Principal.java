package ejercicio5_pruebas;
import ejercicio5_2D.*;
import ejercicio5_3D.*;

public class Principal {
	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(5);
		Rectangulo rectangulo1 = new Rectangulo(5, 6);
		Cilindro cilindro1 = new Cilindro(5, 3);
		Esfera esfera1 = new Esfera(4, 3);
		
		System.out.println("Circulo= "+circulo1.areaCirculo());
		System.out.println("Rectangulo= "+rectangulo1.areaRectangulo());
		System.out.println("Cilindro= "+cilindro1.volumenCilindro());
		System.out.println("Esfera= "+esfera1.volumenEsfera());
	}
}
