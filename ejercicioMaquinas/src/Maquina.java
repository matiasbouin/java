import java.util.ArrayList;

public class Maquina implements Comparable<Maquina>{
	private String id;
	private Persona encargado;
	private ArrayList<Componente> componentes;
	private float pesoMaquina=0;
	
	//Constructor -> Sólo voy a pedir parametros en base a lo que me pide el ejercicio, en este caso: el array de componentes y el id
	public Maquina(String id, ArrayList<Componente> componentes) {
		this.id = id;
		this.componentes = componentes;
		this.setPesoMaquina();
	}
	
	//Getters&Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Persona getEncargado() {
		return encargado;
	}
	public void setEncargado(Persona encargado) {
		this.encargado = encargado;
	}
	public ArrayList<Componente> getComponentes() {
		return componentes;
	}
	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public float getPesoMaquina() {
		return pesoMaquina;
	}

	public void setPesoMaquina() {
		for (int i = 0; i < this.componentes.size(); i++) {
			this.pesoMaquina += componentes.get(i).getPeso();
		}
		
	}
	
	@Override
	public int compareTo(Maquina arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//redefino toString
	public String toString() {
		return "Maquina: " + this.getId() + ", Peso: " + this.getPesoMaquina();
	}
}
