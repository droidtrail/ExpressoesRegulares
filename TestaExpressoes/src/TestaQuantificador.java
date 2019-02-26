
public class TestaQuantificador {

	public static void main(String[] args) {
		
		
		//Procura 2 digitos no texto
		boolean valor = "74".matches("\\d{2}");
		System.out.println("Procura 2 valores no texto: "+valor);
		
		//Procura 3 digitos no texto
		valor ="211".matches("\\d{3,}");
		System.out.println("Procura 3 digitos no texto: "+valor);
		
		//Procura d�gitos entre os valores de 2 e 5
		valor = "2121".matches("\\d{2,5}");
		System.out.println("Procura entre 2 e 5 d�fitos no texto: "+valor);
		
		//Procura d�gito entre 0 e 1 vezes. Se tiver mais de 1 digito retorna "false"
		valor="22".matches(".?");
		System.out.println("Procura d�gito entre 0 e 1 vezes: "+ valor);
		
		//Procura d�gito entre 0 e mais vezes
		valor = "75411".matches(".*");
		System.out.println("Procura d�gito entre 0 e mais vezes: "+valor);
		
		//Procura d�gito entre 1 e mais vezes
		valor = "1".matches(".+");
		System.out.println("Procura d�gito entre 1 e mais vezes: "+valor);
		
		//Cria express�o regular resumida da data
		String data = "02/05/1995";
		valor = data.matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println("Data: " + valor);
		
		//Cria a express�o regular resumida do CEP
		String cep = "8545-222";
		valor= cep.matches("\\d{4}-\\d{3}");
		System.out.println("O cep est� correto? "+valor);
	}

}
