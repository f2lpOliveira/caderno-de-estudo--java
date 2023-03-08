package operadores;

public class Operadores {

	public static void main(String[] args) throws Exception {
		int v1 = 100;
		int v2 = 250;
		
		int r1 = v1 + v2;
		int r2 = v1 - v2;
		int r3 = v1 * v2;
		int r4 = v1 / v2;
		int r5 = v1 % v2;
		
		System.out.println("Soma: " + r1);
		System.out.println("Subtração: " + r2);
		System.out.println("Multiplicação: " + r3);
		System.out.println("Divisão:  " + r4);
		System.out.println("Módulo: " + r5);

		// Operadores Pré-Fixos e Pós-Fixos
		int v3 = 10;
		int v4 = 20;
		
		System.out.println(v3++);
		System.out.println(v3);
		System.out.println(--v4);
		System.out.println(v4);
		
		
		
	}

}
