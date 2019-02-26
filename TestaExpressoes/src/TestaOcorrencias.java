
public class TestaOcorrencias {
	
	public static void main(String[] args) {
		
		//Procura ocorr�ncia de 1 caractere
		boolean caractere = "E".matches(".");
		System.out.println("Procura 1 ocorr�ncia: " +caractere);
		
		//Procura a ocorr�ncia de 2 caracteres
		caractere = "Ab".matches("..");
		System.out.println("Procura 2 ocorr�ncia: " +caractere);
		
		//Valida��o de CEP 
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		boolean validaCep = "21735-001".matches(cep);
		System.out.println("O CPF � v�lido: "+validaCep);
		
	}

}
