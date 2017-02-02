package hotel;

/**
 * 
 * @author
 * Damião Robson Domiciano - 116210003
 * 
 * Kleber Diogo Dias - 115211239
 */

import java.util.ArrayList;
import java.util.List;

public class Recepcao {

	List<Estadia> estadias;

	public Recepcao() {
		this.estadias = new ArrayList<>();
	}

	public boolean checkIn(String nome, String tipo , int idade, int dias, double preco){
		return estadias.add(new Estadia(nome, tipo, idade, dias, preco));
	}

	public void checkOut(String nomeAnimal) {
		removerEstadia(nomeAnimal);
	}

	private boolean removerEstadia(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equalsIgnoreCase(nome))
				return estadias.remove(estadia);
		}
		return false;
	}

	@Override
	public String toString() {
		String lista = "Estadias:";
		for (Estadia estadia : estadias) {
			lista+= "\n" + estadia;
		}
		return lista;
	}
	
	public int getNumDeHospedes(){
		return estadias.size();
	}
	
	public double getLucroTotal(){
		double valorTotal = 0;
		for (Estadia estadia : estadias) {
			valorTotal += estadia.getPreco();
		}
		return valorTotal;
	}
}
