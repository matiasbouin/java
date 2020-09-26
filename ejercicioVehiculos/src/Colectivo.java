import java.util.Random;

public class Colectivo extends Vehiculo {
	//Instancia de random
	Random random = new Random();
	
	//Propiedades
		private int plazas = 25;
		private int plazasOcupadas;
		private Pasajero [] pasajeros;
		private int pesoTotal;
		private float consumo;
		
		//Constructor
		public Colectivo(int id, String marca, String modelo, int plazasOcupadas, Pasajero[] pasajeros) {
			super(id, marca, modelo);
			this.plazasOcupadas = plazasOcupadas;
			this.pasajeros = pasajeros;
			this.setPasajeros();
			this.setPesoTotal();
		}
		
		//Getters and setters
		public int getPlazas() {
			return plazas;
		}

		public void setPlazas(int plazas) {
			this.plazas = plazas;
		}

		public int getPlazasOcupadas() {
			return plazasOcupadas;
		}

		public void setPlazasOcupadas(int plazasOcupadas) {
			this.plazasOcupadas = plazasOcupadas;
		}

		public void getPasajeros() {
			for (int i = 0; i < plazasOcupadas; i++) {
				System.out.println(pasajeros[i].getPeso());
			}
		}

		public void setPasajeros() {
			for (int i = 0; i < this.plazasOcupadas; i++) {
				this.pasajeros[i] = new Pasajero(random.nextInt(100));;
			}
		}
		
		public void setPesoTotal() {
			for (int i = 0; i < this.plazasOcupadas; i++)
			{
				this.pesoTotal += pasajeros[i].getPeso();
			}
		}
		
		public int getPesoTotal() {
			return this.pesoTotal;
		}
		
		
		//Calcular consumo
		public float calcularConsumo(int kilometros) {
			this.consumo = (5 * kilometros) + (0.01f * this.getPesoTotal());
			return this.consumo;
		}

}
