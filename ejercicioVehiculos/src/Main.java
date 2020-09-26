import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		//Instancia de random para crear valores aleatorios
		Random random = new Random();
		
		//Array de pasajeros
		Pasajero[] pasajeros = new Pasajero[25];
		
		//Instancia de Auto, Camion y Colectivo
		Auto auto = new Auto(69, "Mercedes", "C-250", random.nextInt(6), pasajeros);
		Camion camion = new Camion(420, "Siemens", "350flip", 9000, random.nextInt(9001));
		Colectivo colectivo = new Colectivo(69420, "Fiat", "500", random.nextInt(26), pasajeros);
		
		//Consumo del auto
		System.out.println(auto.calcularConsumo(50));
		
		//Consumo del camion
		System.out.println(camion.calcularConsumo(50));
		
		//Consumo del colectivo
		System.out.println(colectivo.calcularConsumo(50));
	}
}
