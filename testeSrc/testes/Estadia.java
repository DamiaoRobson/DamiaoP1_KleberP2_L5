package testes;

public class Estadia {

	private String nome;
	private String tipo;
	private int idade;
	private int dias;
	private double preco;
	
	public Estadia(String nome, String tipo, int idade, int dias, double preco) {
		this.nome = nome;
		this.setTipo(tipo);
		this.setIdade(idade);
		this.setPreco(preco);
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


	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public String toString(){
		return String.format("%s, %s, %d dias com o preço de  R$ %.2f", this.getNome(),this.getTipo(), this.getDias(), this.getPreco());
	}
	
	

}
