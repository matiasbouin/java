package enumerados;

// Object
//     .equals(Object)
//     .toString()

public class Persona {
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean equals(Object other) {
		if (!(other instanceof Persona))
			return false;
		
		return this.nombre.equals(((Persona)other).nombre);
	}
	
	public String toString() {
		return this.nombre;
	}
	
	public static void main(String[] args) {
		Persona a = new Persona("Pepe");
		Persona b = new Persona("Pipi");
		Persona c = new Persona("Pepe");
		
		
		if (a == c) {
			System.out.println("igual");
		} else {
			System.out.println("no igual");
		}
		
		if (a.equals(c)) {
			System.out.println("igual");
		} else {
			System.out.println("no igual");
		}
		
		System.out.println(a);
	}
}
