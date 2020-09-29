
public class PersonaEscritora extends Persona implements Escritor{

	//Constructor
	public PersonaEscritora() {
		this.escribir();
	}
	@Override
	public void escribir() {
		System.out.println("Puedo escribir");
		
	}

}
