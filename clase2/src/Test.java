
public class Test {
	public static void main(String[] args) {
		//Animal a = new Animal(5); //Usa metodo constructor con  parametros ----> No puedo crear este objeto ya que es abstracto
		
		//Accedo a getters y setters (Publicos)
		//a.setPeso(200);
		
		
		//Nuevo objeto: Para una instancia de una clase, los atributos toman un valor por default
		//Animal b = new Animal(); //Usa metodo constructor sin parametros ----> No puedo crear este objeto ya que es abstracto
		
		
		//Herencia: una clase recibe metodos y propiedades de una superClase
		Gato g = new Gato();
		g.comer(); //No esta definido en la clase gato, sino que lo hereda de Animal
		g.setPeso(0.400f);
		System.out.println(g.getPeso());
		
		Perro p = new Perro();
		
		Cuidador c = new Cuidador();
		
		c.alimentar(p);
		c.alimentar(g);
		
		System.out.println("------------------------------");
		
		//Estos solo van a poder acceder a la parte del Tipo de la variable (Animal y Rascador)
		Animal a1 = g;
		Rascador r1 = g; //Solamente voy a poder acceder al metodo rascar
		
		((Gato)a1).mauyar();    //Downcasting ---> Referencia a todo el Gato en a1, puedo acceder a todo el gato <<<CUIDADO puedo poner tipo Perro pero debo saber que metodos y props puedo llegar a referenciar>>>
		r1.rascar();
	}
}
