
public class Camion extends Vehiculo {
	
	//Propiedades
	private int cargaActual;
	private int cargaMaxima;
	private float consumo;
	
	//Constructor
	public Camion(int id, String marca, String modelo, int cargaMaxima, int cargaActual) {
		super(id, marca, modelo);
		this.cargaActual = cargaActual;
		this.cargaMaxima = cargaMaxima;
	}
	
	//Getters and setters
	public int getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	//Calcular consumo
	public float calcularConsumo(int kilometros) {
		this.consumo = (5 * kilometros) + (0.01f * this.getCargaActual());
		return this.consumo;
	}
}
