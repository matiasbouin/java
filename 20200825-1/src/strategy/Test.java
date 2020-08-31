package strategy;

public class Test {
	
	
	public static void main(String[] args) {
		Persona a = new Persona();
		a.saludar();
		
		a.cambiarEstadoAnimo(new EstadoAnimoTriste());
		a.saludar();
	}
}
