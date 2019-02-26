
public class TestaOcorrencias {
	
	public static void main(String[] args) {
		
		//Procura ocorrência de 1 caractere
		boolean caractere = "E".matches(".");
		System.out.println("Procura 1 ocorrência: " +caractere);
		
		//Procura a ocorrência de 2 caracteres
		caractere = "Ab".matches("..");
		System.out.println("Procura 2 ocorrência: " +caractere);
		
		//Validação de CEP 
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		boolean validaCep = "21735-001".matches(cep);
		System.out.println("O CPF é válido: "+validaCep);
		
	}

}
