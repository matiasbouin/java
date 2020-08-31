package singleton;
public class Test {
	public static void main(String[] args) {
		Log a = Log.getInstance();
		a.registrar("Uno");
		a.registrar("Dos");
		
		Log b = Log.getInstance();
		b.registrar("Tres");
		
		//Dara verdadero ya que estamos trabajando con el mismo (Instancia o objeto)
		System.out.println(a == b);
	}
}
