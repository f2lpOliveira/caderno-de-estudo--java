package logica_condicional;

public class App {

	public static void main(String[] args) throws Exception {
		
		// Operadores Relacionais
		int v1 = 6;
		int v2 = 6;
		
		System.out.println(v1 + " > " + v2 + " :: " + (v1 > v2));
		System.out.println(v1 + " >= " + v2 + " :: " + (v1 >= v2));
		System.out.println(v1 + " < " + v2 + " :: " + (v1 < v2));
		System.out.println(v1 + " <= " + v2 + " :: " + (v1 <= v2));
		System.out.println(v1 + " == " + v2 + " :: " + (v1 == v2));
		System.out.println(v1 + " != " + v2 + " :: " + (v1 != v2));
		System.out.println("---------------------------------");
		System.out.format("%d >  %d :: %b%n", v1, v2, v1 > v2);
		System.out.format("%d >= %d :: %b%n", v1, v2, v1 >= v2);
		System.out.format("%d <  %d :: %b%n", v1, v2, v1 < v2);
		System.out.format("%d <= %d :: %b%n", v1, v2, v1 <= v2);
		System.out.format("%d == %d :: %b%n", v1, v2, v1 == v2);
		System.out.format("%d != %d :: %b%n", v1, v2, v1 != v2);
		System.out.println("---------------------------------");
		
		// Operador de Atribuição Condicional
		int v3 = 10;
		int v4 = 0;
		// int r = v3 / v4; // Exception in thread "main" java.lang.ArithmeticException: / by zero
		int r1 = v4 > 0 ? v3 / v4 : 0; // Realiza Checagem Antes da Divisão (Operador Ternário)
		
		System.out.format("Resultado1: %d%n", r1);
		System.out.println("---------------------------------");
		
		// Estrutura Condicional IF/ELSE
		int v5 = 10;
		int v6 = 0;
		int r2 = 0;
		
		if (v6 != 0)
			r2 = v5 / v6;
		else
			r2 = Integer.MAX_VALUE;
		
		System.out.format("Resultado2: %d%n", r2);
		System.out.println("---------------------------------");
		
		if (v6 != 0) {
			r2 = v5 / v6;
			System.out.format("Resultado2: %d%n", r2);
		}
		else {
			System.out.println("Divisão Impossível!");
		}
		System.out.println("---------------------------------");
		
		// Estrutura Condicionais Compostas
		int num1 = 10;
		int num2 = 2;
		char op = 'm';
		
			// Estruturas Condicionais Aninhadas Compacta
		if(op == 'a') {
			System.out.format("Soma: %d%n", num1 + num2);
		} else if (op == 's') {
			System.out.format("Subtração: %d%n", num1 - num2);
		} else if (op == 'm') {
			System.out.format("Multiplicação: %d%n", num1 * num2);
		} else if (op == 'd') {
			System.out.format("Divisão: %d%n", num1 / num2);
		}
		System.out.println("---------------------------------");
		
		//Operadores Lógicos Básicos
		boolean c1 = true;
		boolean c2 = true;
		
		System.out.format("c1 & c2 : %b & %b = %b%n", c1, c2, c1 & c2);
		System.out.format("c1 | c2 : %b | %b = %b%n", c1, c2, c1 | c2);
		System.out.format("c1 ^ c2 : %b ^ %b = %b%n", c1, c2, c1 ^ c2); // OU Exclusivo
		System.out.format("!c1	   : !%b     = %b%n", c1,  !c1); // Negação
		System.out.println("---------------------------------");
		
		// Operadores Lógicos Condiciopnais
		int pessoas = 30;
		float areaM2 = 100;
		
		if ((pessoas > 0) && (areaM2 / pessoas < 4)) {
			System.out.println("Risco de Contágio Está Alto.");
		} else {
			System.out.println("Risco de Contágio Está Baixo.");
		}
		System.out.println("---------------------------------");
		
		// Estrutura de Seleção Múltipla
		int v7 = 10;
		int v8 = 2;
		char op2 = 'a';
		
		switch (op2) {
		case 'a':
			System.out.format("Soma: %d%n", v7 + v8);
			break;
		case 's':
			System.out.format("Subtração: %d%n", v7 - v8);
			break;
		case 'm':
			System.out.format("Multiplicação: %d%n", v7 * v8);
			break;
		case 'd':
			if (v8 != 0)
				System.out.format("Divisão: %d%n", v7 / v8);
			else
				System.out.println("Divisão Por Zero Impossível.");
			break;
		default:
			System.out.println("Operação Não Reconhecida.");
		}
		
		
	}
}
