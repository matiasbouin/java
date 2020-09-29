
public class Cuenta {
	//Propiedades
	private Persona titular;
	private float cantidad;
	
	//Constructores -> Me indica que el titular es obligatorio, por lo que hago un constructor sólo con titular y uno con ambos argumentos
	public Cuenta(Persona titular) {
		this.titular = titular;
		this.cantidad = 0;
	}
	
	public Cuenta(Persona titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	//Getters&Setters -> Segun consigna no puedo modificar cantidad directamente, por lo que no hay setter para cantidad
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public float getCantidad() {
		return cantidad;
	}

	//Metodo mostrar -> Podría reimplementar el metodo toString, pero el ejercicio me pedia que se llame mostrar()
	public void mostrar() {
		System.out.println( "[Titular de la cuenta: " + this.titular.getPersonaId() + ", cantidad: $" + this.cantidad + "]");
	}
	
	//Metodo ingresar
	public void ingresar(float importe) {
		if (importe > 0) {
			this.cantidad += importe;
		}
	}
	
	//Metodo retirar
	public void retirar(float importe) {
		this.cantidad -= importe;
	}
	
	
}
