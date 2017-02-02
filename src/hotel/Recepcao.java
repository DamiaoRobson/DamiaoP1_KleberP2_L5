package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {

	List<Estadia> estadias;

	public Recepcao() {
		this.estadias = new ArrayList<>();
	}

	public boolean checkIn(String nome, String tipo , int idade, int dias, int preco){
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

	/*@Override
	public String toString() {

	}*/

	public String hospedesAtuais() {
		String lista = "Estadias:\n";
		for (Estadia estadia : estadias) {
			lista+= estadia + "\n";
		}
		return lista;
	}
}
