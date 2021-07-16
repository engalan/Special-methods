package metodosespeciais;

public class Caneta {
	public String modelo;
	private float ponta;
    private boolean tampada;
   private String cor;
	// Método construtor (contruct)
	
    public Caneta (String m, String c, float p) {
    	this.modelo = m;
    	this.cor = c;
    	this.ponta = p;
    	this.tampar ();
    	
    	
    }
	
	public String getModelo () {  // Todos os Getters e setters são públicos
		return this.modelo;
	}
	
	public void setModelo (String m) { // como é Setter deve enviar algum parâmetro
		this.modelo = m;
	}
	
	public float getPonta () {
		return this.ponta;
	}
	
	public void setPonta(float p) { // como é Setter deve enviar algum parâmetro
		this.ponta = p;
	
}
	// Método tampar
	
	public void tampar () {
	this.tampada = true;
		
	}
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {;
		System.out.print ("Sobre a caneta");
		System.out.println ("Modelo: "+ this.getModelo());
		System.out.println ("Ponta: " + this.getPonta());
		System.out.println ("Cor " + this.cor);
		System.out.println ("Tampada " + this.tampada);
	}

}
