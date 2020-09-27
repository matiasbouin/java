
public class Item {
	
	//Propiedades
	private String descripcion;
	private int precioUnitario;
	private int cantidad;
	
	//Constructor
	public Item(int precioUnitario, int cantidad) {
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}
	
	//Getters&Setters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
