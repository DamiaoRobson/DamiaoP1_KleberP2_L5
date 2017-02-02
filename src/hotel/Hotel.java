package hotel;

/**
 * 
 * @author
 * Damião Robson Domiciano - 116210003
 * 
 * Kleber Diogo Dias - 115211239
 */

public class Hotel {

	Recepcao recepcao;
	
	public Hotel(){
		this.recepcao = new Recepcao();
	}

	public boolean checkIn(String nome, String tipo, int idade, int dias, double preco) {
		return recepcao.checkIn(nome, tipo, idade, dias, preco);
	}

	public void checkOut(String nomeAnimal) {
		recepcao.checkOut(nomeAnimal);
	}

	public String toString() {
		return recepcao.toString();
	}

	public int getNumDeHospedes() {
		return recepcao.getNumDeHospedes();
	}

	public double getLucroTotal() {
		return recepcao.getLucroTotal();
	}
	
	
}
