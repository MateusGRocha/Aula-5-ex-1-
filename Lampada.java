
public class Lampada {


	private boolean ligada;
	/**
	 * Construtor
	 * @param ligada
	 */
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
	
	/**
	 * Metodos para Ligar e Desligar a Lampada
	 */
	public void ligar() {
		ligada = true;
	}
	

	public void desligar() {
		ligada = false;
	}

	/**
	 * Imprime o Estado da Lampada
	 */
	public void imprimir() {
		if (ligada) {
			System.out.println("L�mpada ligada");
		} else {
			System.out.println("L�mpada desligada");
		}
	}
}
