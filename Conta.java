package contas;

import cliente.Cliente;

//saldo, agencia, numero e titular 
public class Conta {
	
	//Declarando atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			System.out.println("Não há dinheiro suficiente para o saque");
			return false;
			
		}
		
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;			
		}
		else {
			System.out.println("Vocâ não tem saldo suficiente para realizar a transferência.");
			return false;
		}
	}
	
	//Métodos getter e setter
	public double getSaldo(){
		return this.saldo;
	}
	
	public double getNumero(){
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
