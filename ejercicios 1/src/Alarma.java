
public class Alarma {
	//Propiedades
	private String encendida;
	private int umbralSensor;

	public int getUmbralSensor() {
		return umbralSensor;
	}

	public void setUmbralSensor(int umbralSensor) {
		this.umbralSensor = umbralSensor;
	}

	public String getEncendida() {
		return encendida;
	}

	public void setEncendida(String encendida) {
		this.encendida = encendida;
	}
	
	public Alarma() {
		this.encendida = "encendida";
		this.umbralSensor = 0;
		Timbre t = new Timbre();
	}
	
	//PUEDO AGREGAR UNA CONDICION AL ARGUMENTO PARA CHECKEAR QUE EL UMBRAL SE ENCUENTRE POR ENCIMA O POR DEBAJO DE UN VALOR? ej int umbralSensor > 8
	public Alarma(int umbralSensor) {
		this.encendida = "encendida";
		System.out.println("Alarma " + this.encendida);
		this.umbralSensor = umbralSensor;
		Timbre t = new Timbre(umbralSensor);
	}
}
