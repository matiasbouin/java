package enumerados;

public enum Colores {
	ROJO("FF0000"),
	AZUL("0000FF"),
	AMARILLO("00FFFF"),
	VIOLETA("FF00FF"),
	NEGRO("000000"),
	BLANCO("FFFFFF");
	
	private String rgb;
	
	Colores(String rgb) {
		this.rgb = rgb;
	}
	
	String getRGB() {
		return this.rgb;
	}
	
}
