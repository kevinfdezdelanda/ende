package empresa;

public class Programa2 {
	public static void main(String[] args) {
		Telefonomovil telf1= new Telefonomovil("635221133", 50);
		Trabajador tra1=new Trabajador("Antonio", "2466347V", 190, 80, 10, telf1.getNumero(), telf1.getBateria());
		Telefonomovil telf2= new Telefonomovil("12356789", 20);
		Trabajador tra2=new Trabajador("Jose","237245367G", 182, 92, 50, telf2.getNumero(), telf2.getBateria());
		
		Empresa emp1= new Empresa("Emp1",10,tra1);
		emp1.contratarGerente(tra2);
		System.out.println(emp1.toString());
		System.out.println();
		
		emp1.tabajar();
		emp1.tabajar();
		
		System.out.println(emp1.toString());
	}
}
