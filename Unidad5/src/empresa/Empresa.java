package empresa;

public class Empresa {
	private String nombre;
	float beneficio;
	Trabajador gerente,due�o;
	
	public Empresa(String nombre, float beneficio, Trabajador due�o) {
		this.nombre=nombre;
		this.beneficio=beneficio;
		this.due�o= due�o;
	}
	
	public void contratarGerente(Trabajador gerente) {
		this.gerente=gerente;
	}
	
	public void tabajar() {
		gerente.trabajar();
		due�o.trabajar();
		beneficio+=100;
	}
	
	public String toString() {
		if (gerente!=null) {
			return "Nombre: "+nombre+"\n"+"benefificio: "+beneficio+"\n"+"due�o: "+"\n"+due�o.toString()+"\n"+"gerente: "+"\n"+gerente.toString();
		}else {
			return "Nombre: "+nombre+"\n"+"benefificio: "+beneficio+"\n"+"due�o: "+"\n"+due�o.toString();
		}
		
	}
	
}
