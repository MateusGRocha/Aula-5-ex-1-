
public class Aplicacao {

	public static void main(String[] args) {
	
		// Instancia uma lâmpada 
		Lampada l1 = new Lampada(true);
		Lampada	l2 = new Lampada(false);
		
		// Imprime o estado atual da lampada 1
		l1.imprimir();
		l1.desligar();
		l1.imprimir();
		
		//Imprime o estado atual da lampada 2
		l2.imprimir();
		l2.ligar();
		l2.imprimir();
	}
}
