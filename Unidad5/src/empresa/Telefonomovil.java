package empresa;

public class Telefonomovil {
	private String numero;
	private int bateria;
	
	public Telefonomovil(String numero,int bateria) {
		this.bateria=bateria;
		this.numero=numero;
	}
	
	public void usar() {
		if(bateria>=1) {
			bateria-=1;
		}else {
			System.out.println("Error bateria insuficiente");
		}
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
