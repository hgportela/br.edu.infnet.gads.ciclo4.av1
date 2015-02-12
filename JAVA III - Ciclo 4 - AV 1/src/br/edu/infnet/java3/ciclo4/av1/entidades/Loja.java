package br.edu.infnet.java3.ciclo4.av1.entidades;

public class Loja {
	private String nome;
	private String endereco;
	private Carro[] estoqueCarro;
	private Motocicleta[] estoqueMoto;
	
	public void adicionarCarro(){
		
	}
	public void adicionarMoto(){
		
	}
	public Carro pesquisarCarro(Carro c){
		return c;
	}
	public Motocicleta pesquisarMoto(Motocicleta m){
		return m;
	}
	public Carro pesquisarCarro(String chassi){
		Carro c = null;
		return c;
	}
	public Motocicleta pesquisarMoto(String chassi){
		Motocicleta m = null;
		return m;
	}
	public void listarEstoqueCarro(){
		
	}
	public void listarEstoqueMoto(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Carro[] getEstoqueCarro() {
		return estoqueCarro;
	}
	public void setEstoqueCarro(Carro[] estoqueCarro) {
		this.estoqueCarro = estoqueCarro;
	}
	public Motocicleta[] getEstoqueMoto() {
		return estoqueMoto;
	}
	public void setEstoqueMoto(Motocicleta[] estoqueMoto) {
		this.estoqueMoto = estoqueMoto;
	}
}