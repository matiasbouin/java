
public class AlarmaLuminosa extends Alarma {
	private String Bombilla;

	public String getBombilla() {
		return Bombilla;
	}

	public void setBombilla(String bombilla) {
		Bombilla = bombilla;
	}
	
	public AlarmaLuminosa () {
		this.Bombilla = "BOMBILLA BRISHANTE BRO";
		System.out.println(Bombilla);
	}
	
	//PREGUNTAR POR QUE NO HEREDA METODOS Y PROPIEDADES Y SI HICE EL EJERCICIO BIEN !!!!!!!!!!!!!!! <<<<<<<<<<<<
	public AlarmaLuminosa (int umbralSensor) {
		this.Bombilla = "BOMBILLA BRISHANTE BRO";
		System.out.println(Bombilla);
		this.encendida = "encendida";
		System.out.println("Alarma " + this.encendida);
		this.umbralSensor = umbralSensor;
		Timbre t = new Timbre(umbralSensor);
	}
	
	
}
