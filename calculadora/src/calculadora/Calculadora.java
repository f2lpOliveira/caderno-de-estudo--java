package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digíte o primeiro número: ");
		a = scan.nextInt();
		System.out.println("Digíte o segundo número: ");
		b = scan.nextInt();
		
		int sum = sum(a, b);
		int sub = sub(a, b);
		int mult = mult(a, b);
		float div = div(a, b);
		
		System.out.println("Soma: " + sum);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
		
	}

	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int mult(int a, int b) {
		return a * b;
	}
	public static float div(float a, float b) {
		return a / b;
	}
}
