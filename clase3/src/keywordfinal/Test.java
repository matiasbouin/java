package keywordfinal;

//Esta keyword tiene 3 comportamientos distintos
public class Test {
	
	//#1 le pongo final a la variable => no puedo modificar su valor, es como declarar una constante
	private final int numero1 = 10; //De todas formas me obliga a inicializarla (En mismo renglon numero = <valor>; O en el constructor.
	private final int numero2;
	
	public static void main(String[] args) {
		Test t = new Test() {
			int x = 10;
			
			this.numero2 = x * 3;
		};
//		t.numero = 1;
//		System.out.println(t.numero);
//		
//		t.numero = 2;
//		System.out.println(t.numero);
	}
}
