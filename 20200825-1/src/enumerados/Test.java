package enumerados;

public class Test {

	public static void main(String[] args) {
		
		Colores color = Colores.ROJO;
		
		if (color.equals(Colores.ROJO)) {
			System.out.println("Si");
		} 
		
		switch (color) {
		case AMARILLO:
			System.out.println("Amarillo");
			break;
			
		case AZUL:
			System.out.println("Azul");
			break;
			
		case BLANCO:
			break;
		case NEGRO:
			break;
		case ROJO:
			System.out.println("Rojo");
			break;
		case VIOLETA:
			break;
		default:
			break;
		}
		
		System.out.println(color.getRGB());
		
		
	}
}
