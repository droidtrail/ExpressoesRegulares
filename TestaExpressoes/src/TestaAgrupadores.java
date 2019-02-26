
public class TestaAgrupadores {

	public static void main(String[] args) {
		
		
		//Busca qualquer letra de a at� z - faz diferen�a utilizar mai�sculas e min�sculas
		boolean palavra = "g".matches("[a-z]");
		System.out.println(palavra);
		
		//Verifica se foi escrita em letra mai�scula ou min�scula
		palavra = "Java".matches("[J]ava");
		System.out.println(palavra);
		
		//Verifica caracteres de A at� Z e a at� z
		palavra = "Sql".matches("[A-Z][a-z]*");
		System.out.println(palavra);
		
		//N�o permite que comece com as letras a e i
		palavra = "Oracle".matches("[^aei]racle");
		System.out.println(palavra);
		
		//Verifica se foi digitado o caractere "j" e "s"
        //Retorna false por causa da letra "z" onde que o padr�o esperava a letra "s"
		palavra = "Objetoz".matches("Ob[j]eto[s]");
		System.out.println(palavra);
		
		//Valida��o de email
		boolean email = "java@teste.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
		System.out.println(email);
	}

}
