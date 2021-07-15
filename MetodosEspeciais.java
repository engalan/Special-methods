package metodosespeciais;

public class MetodosEspeciais {
	public static void main (String[] args ) {
		Caneta c1 = new Caneta ();
		c1.setModelo ("BIC"); // atribuí o modelo da caneta (utiliza o método acessor)
	//	c1.modelo ="BIC"; (Acessando diretamente a variável)
		
		c1.setPonta (0.5f);
	//	c1.ponta = 0.5f; Aqui ocorre um erro devido estar tentando acessar diretamente uma variável privada
		c1.status(); // chama o método status
		
		
	}

}
