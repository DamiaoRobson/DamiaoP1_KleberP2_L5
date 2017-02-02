package hotel;

/**
 * 
 * @author
 * Damião Robson Domiciano - 116210003
 * 
 * Kleber Diogo Dias - 115211239
 */

public class Animal {

	private String nome;
	private String tipo;
	private int idade;
	
	
	public Animal(String nome, String tipo , int idade)throws Exception {
		if(nome == null || nome.trim().isEmpty()){
			throw new Exception("Nome de um animal nao pode ser nulo ou vazio");
		}
		if(tipo == null || tipo.trim().isEmpty()){
			throw new Exception("Tipo de um animal nao pode ser nulo ou vazio");
		}
		if(idade < 0){
			throw new Exception("Idade de um animal nao pode ser abaixo de 0");
		}
		this.setNome(nome);
		this.setTipo(tipo);
		this.setIdade(idade);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


}
