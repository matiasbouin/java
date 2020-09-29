
public class Prestamo {
	//Propiedades
	private float importePrestado;
	private float importeARetornar;
	private float moraPorDia;
	private float prestamoCancelable;
	
	//Constructor => Solo pido datos conforme a lo que me pide el ejercicio
	public Prestamo(float importePrestado, float moraPorDia) {
		this.importePrestado = importePrestado;
		this.moraPorDia = moraPorDia;
		this.setImporteARetornar();
		this.setPrestamoCancelable();
	}
	
	//Getters&Setters
	public float getImportePrestado() {
		return importePrestado;
	}
	public void setImportePrestado(float importePrestado) {
		this.importePrestado = importePrestado;
	}
	public float getImporteARetornar() {
		return importeARetornar;
	}
	public void setImporteARetornar() {
		this.importeARetornar = this.importePrestado * 1.30f;
	}
	public float getMoraPorDia() {
		return moraPorDia * 100;
	}
	public void setMoraPorDia(float moraPorDia) {
		this.moraPorDia = moraPorDia;
	}
	public float getPrestamoCancelable() {
		return prestamoCancelable;
	}
	public void setPrestamoCancelable() {
		this.prestamoCancelable = this.importeARetornar * 0.95f;
	}	
	
	//Redefino toString
	public String toString() {
		return "[Importe prestado: $" + this.getImportePrestado() + ", importe a retornar: $" + this.getImporteARetornar() + ", mora por día: " + this.getMoraPorDia() + "%" + ", monto para cancelar: $" + this.getPrestamoCancelable() + "]";    
	}
	
	
}
