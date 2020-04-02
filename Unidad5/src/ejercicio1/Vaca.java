package ejercicio1;

public class Vaca {
	private String color_pelo;
	private int edad;
	protected String nombre;
	private static int num_vacas=0;
	
	public Vaca(String nombre) {
		this.nombre=nombre;
		this.num_vacas();
	}
	
	public Vaca(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		this.num_vacas();
	}
	
	public Vaca(String pelo, int edad, String nombre) {
		color_pelo=pelo;
		this.edad=edad;
		this.nombre=nombre;
		this.num_vacas();
	}
	
	public void muu() {
		if(this.color_pelo==null) {
			System.out.println("Muuu... mi nombre es "+nombre);
		}else {
			System.out.println("Muuu... mi  nombre es "+nombre+" y mi color de pelo es "+color_pelo);
		}
		
	}
	
	public void compararEdad(Vaca vaca) {
		if(vaca.edad > this.edad) {
			System.out.println("La vaca "+vaca.nombre+ " es más vieja que la vaca "+this.nombre);
		}else if(vaca.edad < this.edad) {
			System.out.println("La vaca "+this.nombre+ " es más vieja que la vaca "+vaca.nombre);
		}else {
			System.out.println("La vaca "+this.nombre+ " tiene la misma edad que la vaca "+vaca.nombre);
		}
	}

	private void num_vacas() {
		num_vacas++;
		System.out.println("Se ha creado la vaca "+num_vacas);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor_pelo() {
		return color_pelo;
	}

	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
