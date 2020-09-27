import java.util.Random;

//Utilizo interfaz Comparable para poder dar implementacion propia de este objeto al metodo para ordenar
//Comparable es un tipo de interfaz generica, en este caso especializada en Orden
public class Orden implements Comparable<Orden>{
	
	//Propiedades
	private Item [] items;
	private Proveedor proveedor;
	private String fecha;
	private int numero;
	private int importe=0;
	
	//Constructor -> Sólo toma los valores pertinentes para el ejercicio
	public Orden(int numero, String apellido, Item [] items) {
		this.numero = numero;
		proveedor = new Proveedor(apellido);
		setItems(items);
		setImporte();
	}
	
	//Instancia de random para crear precios aleatorios
	Random random = new Random();
	
	//Getters & Setters
	public Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
		for (int i=0;i < items.length;i++) {
			items[i] = new Item(random.nextInt(1000)+1, random.nextInt(100)+1);
		}
		this.items = items;
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getImporte() {
		return importe;
	}
	
	public void setImporte() {
		for(int i=0; i < this.items.length; i++) {
			this.importe += (this.items[i].getPrecioUnitario() * this.items[i].getCantidad());
		}
	}
	
	//ToString
	public String toString() {
		return "Orden número:" + this.numero + ", Importe: " + this.importe + ", Apellido proveedor: " + this.proveedor.getApellido();
	}
	
	//Override porque este metodo pertenece a la interfaz Comparable
	@Override
	public int compareTo(Orden otro) {
		// Return:
		//Negativo => Objeto es menor que otro
		//Cero => Objeto igual al otro
		//Positivo => Objeto mayor al otro
		
		return this.numero - otro.numero;
		//Ordenar decreciente
		//return -1 * (this.numero - otro.numero)
	}
	
}
