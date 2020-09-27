import java.util.Comparator;

//Debo crear esta clase para poder implementar un nuevo metodo de ordenamiento
public class OrdenPorApellido implements Comparator<Orden> {
	
	@Override
	public int compare(Orden arg0, Orden arg1) {
		//Creo nuevos objetos com wrapper String, para poder implementar el metodo compareTo
		String a = new String(arg0.getProveedor().getApellido());
		String b = new String(arg1.getProveedor().getApellido());
		return a.compareTo(b) ;
	}
	
}
