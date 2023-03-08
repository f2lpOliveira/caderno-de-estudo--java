package variaveis_tipos_operadores;

public class App {

	public static void main(String[] args) throws Exception {
		// Declaração de Variáveis
		int numero;
		numero = 100;
		
		final int numeroConstante = 200; // Valor de Variável Que Não Pode Ser Alterada.
		
		// Variáveis do Tipo Inteiros
		byte v1 = 20;
		short v2 = 30;
		int v3 = 40;
		long v4 = 507967154L; // "L" Indica Que o Valor Atribuído é do Tipo Long.
		
		// Variáveis do Tipo Ponto Flutuante
		float f1 = 17.03f;
		double d1 = 47.13;
		
		// Variável do Tipo Caractere
		char letra = 'A';
		char letraAcentuada = '\u00DA'; // Ú
		
		// Variável do Tipo Boolean
		boolean aplicarDesconto = false;
		
		System.out.println("Byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
		System.out.println("Short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
		System.out.println("Integer: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
		System.out.println("Long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
		System.out.println("Float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
		System.out.println("Double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
		
	}

}
