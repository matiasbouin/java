package strategy;

public class Persona {

	private EstadoAnimo estadoAnimo = new EstadoAnimoFeliz();
	
	public void cambiarEstadoAnimo(EstadoAnimo estadoAnimo) {
		this.estadoAnimo = estadoAnimo;
	}
	
	public void saludar() {
		estadoAnimo.saludar();
	}
}
