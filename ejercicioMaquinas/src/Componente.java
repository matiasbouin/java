
public class Componente implements Comparable<Componente> {
	private String numeroSerie;
	private String descripcion;
	private float peso;
	
	//Constructor
	public Componente(String numeroSerie, String descripcion, float peso) {
		this.numeroSerie = numeroSerie;
		this.descripcion = descripcion;
		this.peso = peso;
	}
	
	//Getters&Setters
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//Redefino toString
	
	public String toString() {
		return "Componente: " + this.numeroSerie + ", Descripcion: " + this.descripcion;
	}

	@Override
	public int compareTo(Componente arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
