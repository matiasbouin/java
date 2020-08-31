package strategy;
//Un objeto cambia de comportamiento dependiendo de otro objeto que se le asigna
public class Test {
	
	public static void main(String[] args) {
		Persona a = new Persona();
		a.saludar();
		
		a.cambiarEstadoAnimo(new EstadoAnimoTriste());
		a.saludar();
	}
}
