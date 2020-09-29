
public class PersonaLectora extends Persona implements Lector {
	
	//Constructor
		public PersonaLectora() {
			this.leer();
		}
		
	@Override
	public void leer() {
		System.out.println("Puedo leer");
		
	}

}
