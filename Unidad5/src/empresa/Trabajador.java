package empresa;

public class Trabajador extends Persona{
	private float dinero;
	Telefonomovil telf;
	
	public Trabajador(String nombre, String dni, int altura, int peso, float dinero, String numero, int bateria) {
		super(nombre, dni, altura, peso);
		this.dinero=dinero;
		telf = new Telefonomovil(numero,bateria);
	}
	
	public Trabajador(String dni, float dinero) {
		super(dni);
		this.dinero=dinero;
	}
	
	public void ganarDinero(float dineroGanado) {
		dinero+=dineroGanado;
	}
	
	public void gastarDinero(float dineroGastado) {
		dinero-=dineroGastado;
	}
	
	public String toString() {
		return super.toString() +"\n"+"dinero: "+dinero+"\n"+"bateria: "+((Telefonomovil) telf).getBateria();
	}
	
	public void trabajar() {
		if(telf.getBateria()>=1) {
			dinero+=10;
		}
		telf.usar();
	}
	
}
