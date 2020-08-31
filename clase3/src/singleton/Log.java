package singleton;
//Singleton
public class Log {
	
	//static ver referencia abajo (Variable statica)
	private static Log log;
	private int indice;
	
	//Ocultar constructor
	private Log(){
		
	}
	
	//Si log no existe me crea log
	//static me permite acceder a ella mas haya de que exista o no un objeto (De que lo haya creado o o no)
	//Lo estatico debe ser lo minimo e indispensable
	public static Log getInstance() {
		if (log == null)
			log = new Log();
		
		return log;
	}
	
	public void registrar (String mensaje) {
		//Grabar en archivo o base de datos
		System.out.println(indice + " "  + mensaje);
		indice++;
	}
}
