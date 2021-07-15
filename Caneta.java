package metodosespeciais;

public class Caneta {
	public String modelo;
	private float ponta;
	
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
	public void status() {;
		System.out.print ("Sobre a caneta");
		System.out.println ("Modelo: "+ this.modelo);
		System.out.println ("Ponta: " + this.ponta);
	}

}
