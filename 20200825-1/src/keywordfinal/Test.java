package keywordfinal;

public class Test {
	
	private final int numero1 = 10;
	private final int numero2;
	
	public Test() {
		int x = 10;
		
		this.numero2 = x * 3;
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		
//		t.numero = 1;
//		System.out.println(t.numero);
//		
//		t.numero = 2;
		
		System.out.println(t.numero1);
		System.out.println(t.numero2);
		
		Auto as = new AutoSport();
		as.arrancar();
		
	}
}
