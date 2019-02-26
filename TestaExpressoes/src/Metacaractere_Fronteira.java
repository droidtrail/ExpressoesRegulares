
public class Metacaractere_Fronteira {

	public static void main(String[] args) {
		
		//Come�a na palavra Java, continua com qualquer caractere 
        //a partir do . Pode ser 0 ou mais digitos.
		boolean palavra = "Java322".matches("^Java.*");
		System.out.println(palavra);
		
		//Termina com 322
        //O ponto (.) Come�a com qualquer caractere e busca 0 
        //ou mais caracteres finalizando com o num 322
		palavra = "Java322".matches(".*322");
		System.out.println(palavra);
		
		//Pesquisa se uma palavra existe no texto
		palavra = "Hello World Java".matches(".*Java.*");
		System.out.println(palavra);
		
		//Pesquisa os caracteres que est�o depois da letra O e antes da palavra Java
		palavra = "O mundo Java".matches("^O.*Java$");
		System.out.println(palavra);
		
		//Pesquisa pela palavra Inter ou Gr�mio
		boolean time = "Inter".matches("Inter|Gr�mio");
		System.out.println("Time: " +time);
	}

}
