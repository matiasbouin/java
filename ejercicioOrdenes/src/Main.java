//Supuestos:
//> No di valores iniciales para todas las propiedades de los objetos, sólo para aquellas de las que dependía el ejercicio

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		//instancia de random
		Random random = new Random();
		
		//Array de items y ordenes
		Item [] items = new Item[random.nextInt(10)+1];
		Orden [] ordenes = new Orden[random.nextInt(5)+6];
		
		//Array de apellidos para ejemplo
		String [] apellidos = {"White", "Pinkman", "Fring", "Ehrmantraut", "Schrader", "Alquist", "Goodman", "Rodarte-Quayle", "Salamanca", "Boetticher"};
		
		//Creacion de ordenes
		for (int i = 0; i < ordenes.length;i++) {
			ordenes[i] = new Orden(random.nextInt(9000)+1, apellidos[i], items);
		}
		
		//Calcular importe de cada orden
		for (int i = 0; i < ordenes.length; i++) {
			int importe = ordenes[i].getImporte();
			System.out.println("Importe orden " + i + " $" + importe);
		}
		
		//Mostrar ordenes por numero de orden
		//Deberia haber trabajado con ArrayList desde el principio, en este caso creo un ArrayList a partir de mi array comun
		ArrayList<Orden> ordenesList = new ArrayList<Orden>();
		for (int i = 0; i < ordenes.length; i++) {
			ordenesList.add(ordenes[i]);
		}
		//Lista sin ordenar
		System.out.println(ordenesList);
		//Ordeno lista
		Collections.sort(ordenesList);
		//Lista ordenada
		System.out.println(ordenesList);
		
		//Mostrar ordenes por apellido del proveedor
		Collections.sort(ordenesList, new OrdenPorApellido());
		System.out.println(ordenesList);
		
		//<-------------- EJERCICIO TERMINADO ----------------->
		
		//Clases anonimas => Las defino solo cuando las utilizo, para no crear una nueva clase solo por el metodo de ordenamiento
		//En este ejemplo: Ordenar las ordenes por importe
		Collections.sort(ordenesList, new Comparator<Orden>() {

			@Override
			public int compare(Orden arg0, Orden arg1) {
				Integer a = arg0.getImporte();
				Integer b = arg1.getImporte();
				
				return a.compareTo(b);
			}	
		});
		
		System.out.println(ordenesList);
	}

}
