import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Instancia de Random para generar distintas cuentas
		Random random = new Random();
		
		//Creo array de personas
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		//Lleno array de personas, en este caso: 5 peronas
		for (int i = 0; i < 5; i++) {
			personas.add(new Persona(random.nextInt(10000)+1));
		}
		
		//Creo array de cuentas
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		//Lleno mi array de cuentas
		for (int i = 0; i < 5; i++) {
			cuentas.add(new Cuenta(personas.get(i), random.nextFloat()*10000));
		}
		
		//Checkeo info
		cuentas.get(0).mostrar();
		
		//Ingreso
		cuentas.get(0).ingresar(42069);
		
		//Checkeo info
		cuentas.get(0).mostrar();
		
		//retiro
		cuentas.get(0).retirar(69420);
		
		//Checkeo info
		cuentas.get(0).mostrar();
	}

}
