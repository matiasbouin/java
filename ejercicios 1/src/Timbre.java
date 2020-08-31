
public class Timbre {
	private String sonido;

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	public Timbre() {
		this.sonido = ("zzz");
		System.out.println(sonido);
		System.out.println("No hay timbre");
	}
	
	public Timbre(int umbral) {
		this.sonido = ("TIMBREEEEEEEEEEE");
		System.out.println(sonido);
		System.out.println("EL UMBRAL ES:" + umbral);
	}
}
