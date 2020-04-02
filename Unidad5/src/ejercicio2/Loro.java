package ejercicio2;

public class Loro extends Ave{
	private char region;
	@SuppressWarnings("unused")
	private String color;
	
	public Loro(char sexo, int edad, String color,char region ) {
		super(sexo, edad);
		this.color=color;
		this.region=region;
	}

	protected void deDondeEres() {
		if(region=='N') {
			System.out.println("Norte");
		}else if(region=='S') {
			System.out.println("Sur");
		}else if(region=='E') {
			System.out.println("Este");
		}else if(region=='O') {
			System.out.println("Oeste");
		}
		
	}
	
	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}
	
	
	protected String cantar() {
		return super.cantar()+"Pio-pio loro bonito";
	}
}
