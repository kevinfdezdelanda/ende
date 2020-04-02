package empresa;

public class Programa {
	public static void main(String[] args) {
		Telefonomovil telf1= new Telefonomovil("635221133", 50);
		Trabajador tra1=new Trabajador("Antonio", "2466347V", 190, 80, 10, telf1.getNumero(), telf1.getBateria());
		
		System.out.println(tra1.toString());
		
		tra1.trabajar();
		tra1.trabajar();
		
		System.out.println();
		System.out.println(tra1.toString());
	}
}
