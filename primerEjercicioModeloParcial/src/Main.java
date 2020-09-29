import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Instancia de Random()
		Random random = new Random();
		
		//Variable para monto que le deben al financista
		float montoTotal = 0;
		
		//Creo array de prestamos
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		
		//Cargo array de prestamos => 700 ya que el financista no piensa prestar mas de 700 prestamos alta rata
		for (int i = 0; i < random.nextInt(700)+1; i++) {
			prestamos.add(new Prestamo(random.nextFloat()*100000, random.nextFloat()));
		}
		
		//Itero sobre mi array para calcular suma total que le deben al financista este rata
		for (int i = 0; i < prestamos.size(); i++) {
			montoTotal += prestamos.get(i).getImporteARetornar();
		}
		
		//Monto total
		System.out.println("Monto total deuda: " + montoTotal);
		
		//Lista de todos los prestamos
		System.out.println(prestamos);
	}

}
