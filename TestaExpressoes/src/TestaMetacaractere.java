
public class TestaMetacaractere {
	
	public static void main(String[] args) {
		
		boolean email = "@".matches(".");
		System.out.println("Qualquer caractere: "+email);
		
		boolean numero = "a".matches("\\d");
		System.out.println("Possui n�mero: "+numero);
		
		numero = "2".matches("\\d");
		System.out.println("Possui n�mero: "+numero);
		
		boolean letrasNumeros = "A2".matches("\\w\\d");
		System.out.println("Possui letras e n�meros: "+letrasNumeros);
		
		boolean espaco = " ".matches("\\s");
		System.out.println("Possui espa�o: "+espaco);
	}

}
