package singleton;

// Singleton

public class Log {
	
	private static Log log;
	private int indice;
	
	private Log() {
		
	}
	
	public static Log getInstance() {
		if (log == null) 
			log = new Log();
		
		return log;
	}
		
	public void registrar(String mensaje) {
		// Grabar en archivo o base de datos
		System.out.println(indice + " " + mensaje);
		indice++;
	}
	
	
	
	
}
