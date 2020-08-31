
public class Sensor {
	private int umbral;

	public int getUmbral() {
		return umbral;
	}

	public void setUmbral(int umbral) {
		this.umbral = umbral;
	}
	
	public Sensor() {
		this.umbral = 0;
		Alarma a = new Alarma();
		AlarmaLuminosa al = new AlarmaLuminosa();
	}
	
	public Sensor(int umbral) {
		this.umbral = umbral;
		Alarma a = new Alarma(umbral);
		AlarmaLuminosa al = new AlarmaLuminosa(umbral);
	}
}
