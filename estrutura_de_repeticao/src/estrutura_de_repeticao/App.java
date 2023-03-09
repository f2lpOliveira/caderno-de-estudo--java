package estrutura_de_repeticao;

public class App {

	public static void main(String[] args) throws Exception{
		int valor = 10;
		int fatorial = 1;
		
		// Estrutura De Repetição Com Teste No Início		
		while (valor > 1) {
			fatorial *= valor;
			valor--;
		}
		System.out.println(fatorial);
		System.out.println("--------------------------");
		
		int num = 7;
		int max = 10;
		System.out.println("Tabuada de " + num);
		
		for (int i = 1; i <= max; i++) {
			System.out.format("%d x %d = %d%n", num, i, num * i);
		}		
		System.out.println("--------------------------");
		
		// Estrutura De Repetição Com Teste No Final
		int numero = 8;
		int limite = 10;
		int i = 1;
		System.out.println("Tabuada de " + numero);
		
		do {
			System.out.format("%d x %d = %d%n", numero, i, numero * i);
			i++;
		} while (i <= limite);
		System.out.println("--------------------------");
		
		// Vetores
		int[] vetor1;
		int[] vetor2 = new int[3];
		int[] vetor3 = {10, 20, 30};
		
		// vetor1[0] = 1;
		vetor2[0] = 1;
		vetor3[0] = 1;
		
		int soma = 0;
		for (int z = 0; z < vetor3.length; z++) {
			soma += vetor3[z];
		}
		System.out.println(soma);
		System.out.println("--------------------------");
		
		// for-each : para-cada
		int[] vetor = {10, 20, 30, 40, 50};
		int soma2 = 0;
		
		for (int elemento : vetor) {
			soma2 += elemento;
		}
		System.out.println(soma2);
		System.out.println("--------------------------");
		
		// Comandos Que Mudam Compportamentos Em Uma Estrutura De Repetição
		System.out.println("break");
		for (int y = 0; y < 10; y++) {
			if (y == 5) {
				break;
			}
			System.out.format("%d, ", y);
		}
		System.out.println("\ncontinue");
		for (int y = 0; y < 10; y++) {
			if (y == 5) {
				continue;
			}
			System.out.format("%d, ", y);
		}
	}

}
