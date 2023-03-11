
public class MinhaClasse {

	public static void main(String[] args) {
		
		String primeiroNome = "Fellipe";
		String segundoNome = "Oliveira";
		
		String nomeCompleto = NomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);

	}
	
	public static String NomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
