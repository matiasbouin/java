import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Instancia de random
		Random random = new Random();
		
		//Creo arrays de componentes, en este ejemplo voy a tener 3 maquinas distintas, con 3 arrays de componentes distintos
		ArrayList<Componente> componentesMaquinaUno = new ArrayList<Componente>();
		ArrayList<Componente> componentesMaquinaDos = new ArrayList<Componente>();
		ArrayList<Componente> componentesMaquinaTres = new ArrayList<Componente>();
		
		//Creo componentes para llenar mi array
		Componente a = new Componente("1234qwer", "Display", random.nextFloat()*100);
		Componente b = new Componente("5678tyui", "Arandela", random.nextFloat()*100);
		Componente c = new Componente("0987poiu", "Chapa", random.nextFloat()*100);
		Componente d = new Componente("6543ytre", "Tornillo", random.nextFloat()*100);
		Componente e = new Componente("5432rewq", "Tuerca", random.nextFloat()*100);
		Componente f = new Componente("asdf9786", "Cable", random.nextFloat()*100);
		Componente g = new Componente("xcvb1234", "Tecla", random.nextFloat()*100);
		Componente h = new Componente("jhgdf5432", "Engranage", random.nextFloat()*100);
		
		//Array de todos mis componentes
		ArrayList<Componente> componentes = new ArrayList<Componente>();
		componentes.add(a);
		componentes.add(b);
		componentes.add(c);
		componentes.add(d);
		componentes.add(e);
		componentes.add(f);
		componentes.add(g);
		componentes.add(h);
		
		//Relleno mis arrays de componentes
		componentesMaquinaUno.add(a);
		componentesMaquinaUno.add(b);
		componentesMaquinaUno.add(c);
		componentesMaquinaDos.add(d);
		componentesMaquinaDos.add(e);
		componentesMaquinaDos.add(f);
		componentesMaquinaTres.add(g);
		componentesMaquinaTres.add(h);
		
		//Construyo mis maquinas
		Maquina maquinaUno = new Maquina("numeroUno", componentesMaquinaUno);
		Maquina maquinaDos = new Maquina("numeroDos", componentesMaquinaDos);
		Maquina maquinaTres = new Maquina("numeroTres", componentesMaquinaTres);
		
		//Redefino e implemento metodos de ordenamiento
		//Instancio array de Maquinas y de componentes para poder ordenarlas segun distintos criterios
		ArrayList<Maquina> maquinas = new ArrayList<Maquina>();
		maquinas.add(maquinaUno);
		maquinas.add(maquinaDos);
		maquinas.add(maquinaTres);
		
		//Ordenamiento por descripcion de los componentes => Recordar que Maquina debe implementar Comparable
		Collections.sort(componentes, new Comparator<Componente>() {

			@Override
			public int compare(Componente arg0, Componente arg1) {
				String a = arg0.getDescripcion();
				String b = arg1.getDescripcion();
				
				return a.compareTo(b);
			}
			
		});
		
		//Todos los componentes de todas las maquinas ordenados por Descripcion
		System.out.println(componentes);
		
		//Ordenamiento de las maquinas por su peso
		Collections.sort(maquinas, new Comparator<Maquina>() {

			@Override
			public int compare(Maquina arg0, Maquina arg1) {
				Float a = arg0.getPesoMaquina();
				Float b = arg1.getPesoMaquina();
				
				return a.compareTo(b);
			}
			
		});
		
		//Todas las maquinas ordenadas por peso
		System.out.println(maquinas);
		
	}

}
