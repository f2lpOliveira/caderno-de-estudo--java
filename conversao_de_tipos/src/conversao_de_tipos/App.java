package conversao_de_tipos;

public class App {

	public static void main(String[] args) throws Exception{
		// Conversão de Dados Implícita
		int v1 = 50;
		long v2 = v1;
		System.out.println(v2);
		
		// Resultado da Expressão Terá Como Tipo Resultante o Maior Tipo Inteiro Envolvido na Expressão
		byte v3 = 5;
		short v4 = 6;
		int v5 = 23423;
		long v6 = 231452345;
		
		long r1 = v3 + v4 + v5 + v6;
		System.out.println(r1);
		
		float f1 = 34.56f;
		double d1 = 567.234;
		
		float r2 = f1 * f1;
		System.out.println(r2);
		
		double r3 = f1 + d1;
		System.out.println(r3);
		
		
		// Conversão de Dados Explícitas
		float vFloat = 5.0f;
		double vDouble = 2.5d;
		byte vByte = 8;
		short vShort = 12;
		int vInt = 41;
		long vLong = 58465;
		
		short r4 = (short)vLong; // Força Uma Conversão Podendo Provocar Perdas
		System.out.println(vLong); 
		System.out.println(r4);
	}

}
