package contas;

public class CriaConta {
	public static void main(String[] args) {
		//Instanciando uma conta
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);;
		System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo() + " Reais.");
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		//Instanciando uma nova conta
		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		
		System.out.println("Primeira Conta = " + primeiraConta.getSaldo());
		System.out.println("Segunda Conta = " + segundaConta.getSaldo());
	}

}
