package ejercicio2;

public class Ave {
	private char sexo;
	private int edad; 
	private static int num_aves=0;
	private DatosPersonales nombres;
	
	public Ave(char sexo, int edad) {
		this.sexo=sexo;
		this.edad=edad;
		num_aves++;
	}
	
	static protected void cantAves() {
		System.out.println("Num aves creadas: "+num_aves);
	}
	
	protected void quienSoy() {
		System.out.println("sexo: "+sexo);
		System.out.println("edad: "+edad);
	}

	public DatosPersonales getNombres() {
		return nombres;
	}

	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}

	protected String cantar() {
		if(nombres != null) {	
			return "Mi nombre es "+nombres.getNombreAve()+", ";
		}else {
			return "";
		}
		
	}	
	
	
}
