public abstract class Animal {
	// Propiedades: Definir el estado de los objetos (Se autoinicializan cuando creo una instancia del objeto)
	private float peso;    //Las numericas se inicializan en 0
	private String nombre; //Valores que referencian a otro objeto (String) Se inicializan con valor NULL
	private float altura;  //Las numericas se inicializan en 0
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void comer() {
		System.out.println("Comiendo nom nom....");
		this.peso = this.peso * 1.1f; //Recordar agregar la f luego de un literal double
	}
	
	//Constructor: Metodo especial que se ejecuta al momento de instanciar el objeto
	//Todos los objetos tienen constructor por default, no hace nada. Cuando creo un constructor propio, el default desaparece
	//Constructor: (Se llama unicamente cuando se instancia una clase) (Puedo pasar valores al crear objeto)
	//Sobrecarga: Metodos que se van a comportar distinto dependiendo de los parametros que recibe (Debo definir los necesarios)
	//Cuando hay sobrecarga, Java elige que constructor o metodo usar, dependiendo del tipo de dato que reciban estos metodos, en su llamada
	public Animal() {
		System.out.println("Construyendo por default... 1");
		
	}
	
	public Animal(float peso) {
		this.peso = peso;
		System.out.println("Construyendo ... 2");
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
		System.out.println("Construyendo por default... 3");
	}
	
	public Animal(String nombre, float peso) {
		this(nombre); //Invoca al constructor que reciba el tipo de la variable que le paso como argumento 
		System.out.println("Construyendo por default... 4");
		
		this.peso = peso;
	}

}