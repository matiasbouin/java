
public class PersonaEscritoraLectora extends Persona implements Escritor, Lector{
	
	//Constructor
		public PersonaEscritoraLectora() {
			this.leer();
			this.escribir();
		}
	
	@Override
	public void leer() {
		System.out.println("Leo");
		
	}

	@Override
	public void escribir() {
		System.out.println("Escribo");
		
	}

}
