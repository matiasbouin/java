package strategy;

public class Persona {
	
	private EstadoAnimo estadoAnimo = new EstadoAnimoFeliz();
	
	public void cambiarEstadoAnimo(EstadoAnimo estadoAnimo) {
		this.estadoAnimo = estadoAnimo;
	}
	
	//VAmos a modificar el saludo dependiendo del estado de animo
	public void saludar() {
		estadoAnimo.saludar();
	}
}
