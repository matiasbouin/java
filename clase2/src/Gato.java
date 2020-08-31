//Siempre que armo herencia, preguntar: Es un <SUPERCLASE>? -> Ej.: Gato es un Animal? hereda : no hereda
public class Gato extends Animal implements Rascador { //extends me dice que hereda metodos y propiedades de Animal // implements implementa metodos de interfaces (suerte de doble herencia)
	private int bolasDePelosComida;
	
	
	
	public int getBolasDePelosComidas() {
		return this.bolasDePelosComida ++;
	}
	
	public void mauyar() {
		System.out.println("Miau Miau NiBBA");
	}

	public void rascar() {
		System.out.println("Gato: Rascando crachcrachcrach");	
	}
	
	
}
