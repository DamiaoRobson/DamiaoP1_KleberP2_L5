package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {

	List<Estadia> estadias;

	public Recepcao() {
		this.estadias = new ArrayList<>();
	}

	public boolean checkIn(String nome, String tipo , int idade, int dias, int numeroQuarto){
		Animal hospede = new Animal(nome, tipo, idade);
//		Estadia estadia = 
		return estadias.add(new Estadia);
	}

	public void checkOut(String nomeAnimal) {
		removerEstadia(nomeAnimal);
	}

	private boolean removerEstadia(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNomeAnimal.equalIgnoreCase(nome))
				return estadias.remove(estadia);
		}
	}

	@Override
	public String toString() {

	}

	public String hospedesAtuais() {
		String lista = "Estadias:\n";
		for (Estadia estadia : estadias) {
			lista+= estadia + "\n";
		}
		return lista;
	}
}
