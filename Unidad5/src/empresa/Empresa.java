package empresa;

public class Empresa {
	private String nombre;
	float beneficio;
	Trabajador gerente,dueño;
	
	public Empresa(String nombre, float beneficio, Trabajador dueño) {
		this.nombre=nombre;
		this.beneficio=beneficio;
		this.dueño= dueño;
	}
	
	public void contratarGerente(Trabajador gerente) {
		this.gerente=gerente;
	}
	
	public void tabajar() {
		gerente.trabajar();
		dueño.trabajar();
		beneficio+=100;
	}
	
	public String toString() {
		if (gerente!=null) {
			return "Nombre: "+nombre+"\n"+"benefificio: "+beneficio+"\n"+"dueño: "+"\n"+dueño.toString()+"\n"+"gerente: "+"\n"+gerente.toString();
		}else {
			return "Nombre: "+nombre+"\n"+"benefificio: "+beneficio+"\n"+"dueño: "+"\n"+dueño.toString();
		}
		
	}
	
}
