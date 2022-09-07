package control_de_flujo;

public class OperadoresLogicos02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		boolean a = true;
		boolean b = false;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!a = " + !a);
		System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
		

	}

}
